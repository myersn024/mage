/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mage.MageException;
import mage.players.net.UserData;
import org.apache.log4j.Logger;
import org.jboss.remoting.callback.InvokerCallbackHandler;

/**
 * @author BetaSteward_at_googlemail.com
 */
public class SessionManager {

    private static final Logger logger = Logger.getLogger(SessionManager.class);
    private static final SessionManager INSTANCE = new SessionManager();

    public static SessionManager getInstance() {
        return INSTANCE;
    }

    private final ConcurrentHashMap<String, Session> sessions = new ConcurrentHashMap<>();

    public Session getSession(String sessionId) {
        if (sessions == null || sessionId == null) {
            return null;
        }
        Session session = sessions.get(sessionId);
        if (session != null && session.getUserId() != null && UserManager.getInstance().getUser(session.getUserId()) == null) {
            logger.error("User for session " + sessionId + " with userId " + session.getUserId() + " is missing. Session removed.");
            // can happen if user from same host signs in multiple time with multiple clients, after he disconnects with one client
            disconnect(sessionId, DisconnectReason.ConnectingOtherInstance);
            return null;
        }
        return session;
    }

    public void createSession(String sessionId, InvokerCallbackHandler callbackHandler) {
        Session session = new Session(sessionId, callbackHandler);
        sessions.put(sessionId, session);
    }

    public boolean registerUser(String sessionId, String userName, String password, String email) throws MageException {
        Session session = sessions.get(sessionId);
        if (session == null) {
            logger.error(userName + " tried to register with no sessionId");
            return false;
        }
        String returnMessage = session.registerUser(userName, password, email);
        if (returnMessage != null) {
            logger.debug(userName + " not registered: " + returnMessage);
            return false;
        }
        logger.info(userName + " registered");
        logger.debug("- userId:    " + session.getUserId());
        logger.debug("- sessionId: " + sessionId);
        logger.debug("- host:      " + session.getHost());
        return true;
    }

    public boolean connectUser(String sessionId, String userName, String password) throws MageException {
        Session session = sessions.get(sessionId);
        if (session != null) {
            String returnMessage = session.connectUser(userName, password);
            if (returnMessage == null) {
                logger.info(userName + " connected to server");
                logger.debug("- userId:    " + session.getUserId());
                logger.debug("- sessionId: " + sessionId);
                logger.debug("- host:      " + session.getHost());
                return true;
            } else {
                logger.debug(userName + " not connected: " + returnMessage);
            }
        } else {
            logger.error(userName + " tried to connect with no sessionId");
        }
        return false;
    }

    public boolean connectAdmin(String sessionId) {
        Session session = sessions.get(sessionId);
        if (session != null) {
            session.connectAdmin();
            logger.info("Admin connected from " + session.getHost());
            return true;
        }
        return false;
    }

    public boolean setUserData(String userName, String sessionId, UserData userData, String clientVersion) throws MageException {
        Session session = sessions.get(sessionId);
        if (session != null) {
            session.setUserData(userName, userData, clientVersion);
            return true;
        }
        return false;
    }

    public void disconnect(String sessionId, DisconnectReason reason) {
        Session session = sessions.get(sessionId);
        if (session != null) {
            if (reason != DisconnectReason.AdminDisconnect) {
                if (!sessions.containsKey(sessionId)) {
                    // session was removed meanwhile by another thread so we can return
                    return;
                }
                logger.debug("DISCONNECT  " + reason.toString() + " - sessionId: " + sessionId);
                sessions.remove(sessionId);
                switch (reason) {
                    case Disconnected: // regular session end
                        session.kill(reason);
                        break;
                    case SessionExpired: // session ends after no reconnect happens in the defined time span
                        session.kill(reason);
                        break;
                    case LostConnection: // user lost connection - session expires countdaoun starts
                        session.userLostConnection();
                        break;
                    default:
                        logger.error("endSession: unexpected reason  " + reason.toString() + " - sessionId: " + sessionId);
                }
            } else {
                sessions.remove(sessionId);
                session.kill(reason);
            }
        }

    }

    public Map<String, Session> getSessions() {
        Map<String, Session> map = new HashMap<>();
        for (Map.Entry<String, Session> entry : sessions.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    /**
     * Admin requested the disconnect of a user
     *
     * @param sessionId
     * @param userSessionId
     */
    public void disconnectUser(String sessionId, String userSessionId) {
        if (isAdmin(sessionId)) {
            User userAdmin, user;
            if ((userAdmin = getUserFromSession(sessionId)) != null) {
                if ((user = getUserFromSession(userSessionId)) != null) {
                    user.showUserMessage("Admin operation", "Your session was disconnected by Admin.");
                    userAdmin.showUserMessage("Admin action", "User" + user.getName() + " was disconnected.");
                    disconnect(userSessionId, DisconnectReason.AdminDisconnect);
                } else {
                    userAdmin.showUserMessage("Admin operation", "User with sessionId " + userSessionId + " could not be found!");
                }
            }
        }
    }

    private User getUserFromSession(String sessionId) {
        Session session = getSession(sessionId);
        if (session == null) {
            return null;
        }
        return UserManager.getInstance().getUser(session.getUserId());
    }

    public void endUserSession(String sessionId, String userSessionId) {
        if (isAdmin(sessionId)) {
            disconnect(userSessionId, DisconnectReason.AdminDisconnect);
        }
    }

    public boolean isAdmin(String sessionId) {
        Session admin = sessions.get(sessionId);
        if (admin != null) {
            return admin.isAdmin();
        }
        return false;
    }

    public boolean isValidSession(String sessionId) {
        return sessions.containsKey(sessionId);
    }

    public User getUser(String sessionId) {
        Session session = sessions.get(sessionId);
        if (session != null) {
            return UserManager.getInstance().getUser(sessions.get(sessionId).getUserId());
        }
        return null;
    }

    public boolean extendUserSession(String sessionId, String pingInfo) {
        Session session = sessions.get(sessionId);
        if (session != null) {
            return UserManager.getInstance().extendUserSession(session.getUserId(), pingInfo);
        }
        return false;
    }

    public void sendErrorMessageToClient(String sessionId, String message) {
        Session session = sessions.get(sessionId);
        if (session == null) {
            logger.error("Following error message is not delivered because session " + sessionId + " is not found: " + message);
            return;
        }
        session.sendErrorMessageToClient(message);
    }
}
