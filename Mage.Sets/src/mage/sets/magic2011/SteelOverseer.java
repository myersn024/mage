/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 * 
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 * 
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 * 
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.sets.magic2011;

import java.util.UUID;
import mage.Constants.CardType;
import mage.Constants.Rarity;
import mage.Constants.Zone;
import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.AddPlusOneCountersControlledEffect;
import mage.cards.CardImpl;
import mage.filter.Filter.ComparisonScope;
import mage.filter.FilterPermanent;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class SteelOverseer extends CardImpl<SteelOverseer> {

	private static FilterPermanent filter = new FilterPermanent("artifact creature");

	static {
		filter.getCardType().add(CardType.ARTIFACT);
		filter.getCardType().add(CardType.CREATURE);
		filter.setScopeCardType(ComparisonScope.All);
	}

	public SteelOverseer(UUID ownerId) {
		super(ownerId, 214, "Steel Overseer", Rarity.RARE, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}");
		this.expansionSetCode = "M11";
		this.subtype.add("Construct");
		this.power = new MageInt(1);
		this.toughness = new MageInt(1);

		this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new AddPlusOneCountersControlledEffect(1, filter), new TapSourceCost()));
	}

	public SteelOverseer(final SteelOverseer card) {
		super(card);
	}

	@Override
	public SteelOverseer copy() {
		return new SteelOverseer(this);
	}

	@Override
	public String getArt() {
		return "129125_typ_reg_sty_010.jpg";
	}

}
