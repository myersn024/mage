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
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;

/**
 *
 * @author North
 */
public class PlanarChaos extends ExpansionSet {

    private static final PlanarChaos fINSTANCE = new PlanarChaos();

    public static PlanarChaos getInstance() {
        return fINSTANCE;
    }

    private PlanarChaos() {
        super("Planar Chaos", "PLC", ExpansionSet.buildDate(2007, 1, 2), SetType.EXPANSION);
        this.blockName = "Time Spiral";
        this.parentSet = TimeSpiral.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aeon Chronicler", 32, Rarity.RARE, mage.cards.a.AeonChronicler.class));
        cards.add(new SetCardInfo("Aether Membrane", 93, Rarity.UNCOMMON, mage.cards.a.AetherMembrane.class));
        cards.add(new SetCardInfo("Akroma, Angel of Fury", 94, Rarity.RARE, mage.cards.a.AkromaAngelOfFury.class));
        cards.add(new SetCardInfo("Ana Battlemage", 124, Rarity.UNCOMMON, mage.cards.a.AnaBattlemage.class));
        cards.add(new SetCardInfo("Aquamorph Entity", 33, Rarity.COMMON, mage.cards.a.AquamorphEntity.class));
        cards.add(new SetCardInfo("Auramancer's Guise", 34, Rarity.UNCOMMON, mage.cards.a.AuramancersGuise.class));
        cards.add(new SetCardInfo("Aven Riftwatcher", 1, Rarity.COMMON, mage.cards.a.AvenRiftwatcher.class));
        cards.add(new SetCardInfo("Battering Sliver", 95, Rarity.COMMON, mage.cards.b.BatteringSliver.class));
        cards.add(new SetCardInfo("Benalish Commander", 2, Rarity.RARE, mage.cards.b.BenalishCommander.class));
        cards.add(new SetCardInfo("Big Game Hunter", 63, Rarity.UNCOMMON, mage.cards.b.BigGameHunter.class));
        cards.add(new SetCardInfo("Blightspeaker", 64, Rarity.COMMON, mage.cards.b.Blightspeaker.class));
        cards.add(new SetCardInfo("Blood Knight", 115, Rarity.UNCOMMON, mage.cards.b.BloodKnight.class));
        cards.add(new SetCardInfo("Body Double", 35, Rarity.RARE, mage.cards.b.BodyDouble.class));
        cards.add(new SetCardInfo("Bog Serpent", 84, Rarity.COMMON, mage.cards.b.BogSerpent.class));
        cards.add(new SetCardInfo("Boom // Bust", 112, Rarity.RARE, mage.cards.b.BoomBust.class));
        cards.add(new SetCardInfo("Braids, Conjurer Adept", 36, Rarity.RARE, mage.cards.b.BraidsConjurerAdept.class));
        cards.add(new SetCardInfo("Brain Gorgers", 65, Rarity.COMMON, mage.cards.b.BrainGorgers.class));
        cards.add(new SetCardInfo("Brute Force", 116, Rarity.COMMON, mage.cards.b.BruteForce.class));
        cards.add(new SetCardInfo("Calciderm", 23, Rarity.UNCOMMON, mage.cards.c.Calciderm.class));
        cards.add(new SetCardInfo("Cautery Sliver", 154, Rarity.UNCOMMON, mage.cards.c.CauterySliver.class));
        cards.add(new SetCardInfo("Chronozoa", 37, Rarity.RARE, mage.cards.c.Chronozoa.class));
        cards.add(new SetCardInfo("Circle of Affliction", 66, Rarity.UNCOMMON, mage.cards.c.CircleOfAffliction.class));
        cards.add(new SetCardInfo("Citanul Woodreaders", 125, Rarity.COMMON, mage.cards.c.CitanulWoodreaders.class));
        cards.add(new SetCardInfo("Cradle to Grave", 67, Rarity.COMMON, mage.cards.c.CradleToGrave.class));
        cards.add(new SetCardInfo("Crovax, Ascendant Hero", 3, Rarity.RARE, mage.cards.c.CrovaxAscendantHero.class));
        cards.add(new SetCardInfo("Damnation", 85, Rarity.RARE, mage.cards.d.Damnation.class));
        cards.add(new SetCardInfo("Darkheart Sliver", 155, Rarity.UNCOMMON, mage.cards.d.DarkheartSliver.class));
        cards.add(new SetCardInfo("Dash Hopes", 68, Rarity.COMMON, mage.cards.d.DashHopes.class));
        cards.add(new SetCardInfo("Dawn Charm", 4, Rarity.COMMON, mage.cards.d.DawnCharm.class));
        cards.add(new SetCardInfo("Dead // Gone", 113, Rarity.COMMON, mage.cards.d.DeadGone.class));
        cards.add(new SetCardInfo("Deadly Grub", 69, Rarity.COMMON, mage.cards.d.DeadlyGrub.class));
        cards.add(new SetCardInfo("Deadwood Treefolk", 126, Rarity.UNCOMMON, mage.cards.d.DeadwoodTreefolk.class));
        cards.add(new SetCardInfo("Detritivore", 96, Rarity.RARE, mage.cards.d.Detritivore.class));
        cards.add(new SetCardInfo("Dismal Failure", 39, Rarity.UNCOMMON, mage.cards.d.DismalFailure.class));
        cards.add(new SetCardInfo("Dormant Sliver", 156, Rarity.UNCOMMON, mage.cards.d.DormantSliver.class));
        cards.add(new SetCardInfo("Dreamscape Artist", 40, Rarity.COMMON, mage.cards.d.DreamscapeArtist.class));
        cards.add(new SetCardInfo("Dunerider Outlaw", 86, Rarity.UNCOMMON, mage.cards.d.DuneriderOutlaw.class));
        cards.add(new SetCardInfo("Dust Corona", 97, Rarity.COMMON, mage.cards.d.DustCorona.class));
        cards.add(new SetCardInfo("Dust Elemental", 5, Rarity.RARE, mage.cards.d.DustElemental.class));
        cards.add(new SetCardInfo("Enslave", 70, Rarity.UNCOMMON, mage.cards.e.Enslave.class));
        cards.add(new SetCardInfo("Erratic Mutation", 41, Rarity.COMMON, mage.cards.e.ErraticMutation.class));
        cards.add(new SetCardInfo("Essence Warden", 145, Rarity.COMMON, mage.cards.e.EssenceWarden.class));
        cards.add(new SetCardInfo("Evolution Charm", 127, Rarity.COMMON, mage.cards.e.EvolutionCharm.class));
        cards.add(new SetCardInfo("Extirpate", 71, Rarity.RARE, mage.cards.e.Extirpate.class));
        cards.add(new SetCardInfo("Fa'adiyah Seer", 146, Rarity.COMMON, mage.cards.f.FaadiyahSeer.class));
        cards.add(new SetCardInfo("Fatal Frenzy", 98, Rarity.RARE, mage.cards.f.FatalFrenzy.class));
        cards.add(new SetCardInfo("Firefright Mage", 99, Rarity.COMMON, mage.cards.f.FirefrightMage.class));
        cards.add(new SetCardInfo("Frenetic Sliver", 157, Rarity.UNCOMMON, mage.cards.f.FreneticSliver.class));
        cards.add(new SetCardInfo("Frozen Aether", 54, Rarity.UNCOMMON, mage.cards.f.FrozenAether.class));
        cards.add(new SetCardInfo("Fungal Behemoth", 128, Rarity.RARE, mage.cards.f.FungalBehemoth.class));
        cards.add(new SetCardInfo("Fury Charm", 100, Rarity.COMMON, mage.cards.f.FuryCharm.class));
        cards.add(new SetCardInfo("Gaea's Anthem", 147, Rarity.RARE, mage.cards.g.GaeasAnthem.class));
        cards.add(new SetCardInfo("Ghost Tactician", 6, Rarity.COMMON, mage.cards.g.GhostTactician.class));
        cards.add(new SetCardInfo("Giant Dustwasp", 129, Rarity.COMMON, mage.cards.g.GiantDustwasp.class));
        cards.add(new SetCardInfo("Gossamer Phantasm", 55, Rarity.COMMON, mage.cards.g.GossamerPhantasm.class));
        cards.add(new SetCardInfo("Groundbreaker", 148, Rarity.RARE, mage.cards.g.Groundbreaker.class));
        cards.add(new SetCardInfo("Hammerheim Deadeye", 101, Rarity.UNCOMMON, mage.cards.h.HammerheimDeadeye.class));
        cards.add(new SetCardInfo("Harmonize", 149, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Healing Leaves", 150, Rarity.COMMON, mage.cards.h.HealingLeaves.class));
        cards.add(new SetCardInfo("Hedge Troll", 151, Rarity.UNCOMMON, mage.cards.h.HedgeTroll.class));
        cards.add(new SetCardInfo("Heroes Remembered", 7, Rarity.RARE, mage.cards.h.HeroesRemembered.class));
        cards.add(new SetCardInfo("Hunting Wilds", 130, Rarity.UNCOMMON, mage.cards.h.HuntingWilds.class));
        cards.add(new SetCardInfo("Imp's Mischief", 72, Rarity.RARE, mage.cards.i.ImpsMischief.class));
        cards.add(new SetCardInfo("Intet, the Dreamer", 158, Rarity.RARE, mage.cards.i.IntetTheDreamer.class));
        cards.add(new SetCardInfo("Jedit Ojanen of Efrava", 131, Rarity.RARE, mage.cards.j.JeditOjanenOfEfrava.class));
        cards.add(new SetCardInfo("Jodah's Avenger", 42, Rarity.UNCOMMON, mage.cards.j.JodahsAvenger.class));
        cards.add(new SetCardInfo("Kavu Predator", 132, Rarity.UNCOMMON, mage.cards.k.KavuPredator.class));
        cards.add(new SetCardInfo("Keen Sense", 152, Rarity.UNCOMMON, mage.cards.k.KeenSense.class));
        cards.add(new SetCardInfo("Keldon Marauders", 102, Rarity.COMMON, mage.cards.k.KeldonMarauders.class));
        cards.add(new SetCardInfo("Lavacore Elemental", 103, Rarity.UNCOMMON, mage.cards.l.LavacoreElemental.class));
        cards.add(new SetCardInfo("Life and Limb", 133, Rarity.RARE, mage.cards.l.LifeAndLimb.class));
        cards.add(new SetCardInfo("Magus of the Arena", 104, Rarity.RARE, mage.cards.m.MagusOfTheArena.class));
        cards.add(new SetCardInfo("Magus of the Bazaar", 43, Rarity.RARE, mage.cards.m.MagusOfTheBazaar.class));
        cards.add(new SetCardInfo("Magus of the Coffers", 73, Rarity.RARE, mage.cards.m.MagusOfTheCoffers.class));
        cards.add(new SetCardInfo("Magus of the Library", 134, Rarity.RARE, mage.cards.m.MagusOfTheLibrary.class));
        cards.add(new SetCardInfo("Magus of the Tabernacle", 8, Rarity.RARE, mage.cards.m.MagusOfTheTabernacle.class));
        cards.add(new SetCardInfo("Malach of the Dawn", 24, Rarity.UNCOMMON, mage.cards.m.MalachOfTheDawn.class));
        cards.add(new SetCardInfo("Mana Tithe", 25, Rarity.COMMON, mage.cards.m.ManaTithe.class));
        cards.add(new SetCardInfo("Melancholy", 88, Rarity.COMMON, mage.cards.m.Melancholy.class));
        cards.add(new SetCardInfo("Merfolk Thaumaturgist", 56, Rarity.COMMON, mage.cards.m.MerfolkThaumaturgist.class));
        cards.add(new SetCardInfo("Mesa Enchantress", 26, Rarity.RARE, mage.cards.m.MesaEnchantress.class));
        cards.add(new SetCardInfo("Midnight Charm", 74, Rarity.COMMON, mage.cards.m.MidnightCharm.class));
        cards.add(new SetCardInfo("Mire Boa", 135, Rarity.COMMON, mage.cards.m.MireBoa.class));
        cards.add(new SetCardInfo("Mirri the Cursed", 75, Rarity.RARE, mage.cards.m.MirriTheCursed.class));
        cards.add(new SetCardInfo("Mycologist", 27, Rarity.UNCOMMON, mage.cards.m.Mycologist.class));
        cards.add(new SetCardInfo("Necrotic Sliver", 159, Rarity.UNCOMMON, mage.cards.n.NecroticSliver.class));
        cards.add(new SetCardInfo("Needlepeak Spider", 105, Rarity.COMMON, mage.cards.n.NeedlepeakSpider.class));
        cards.add(new SetCardInfo("Null Profusion", 89, Rarity.RARE, mage.cards.n.NullProfusion.class));
        cards.add(new SetCardInfo("Numot, the Devastator", 160, Rarity.RARE, mage.cards.n.NumotTheDevastator.class));
        cards.add(new SetCardInfo("Oros, the Avenger", 161, Rarity.RARE, mage.cards.o.OrosTheAvenger.class));
        cards.add(new SetCardInfo("Ovinize", 57, Rarity.UNCOMMON, mage.cards.o.Ovinize.class));
        cards.add(new SetCardInfo("Pallid Mycoderm", 10, Rarity.COMMON, mage.cards.p.PallidMycoderm.class));
        cards.add(new SetCardInfo("Phantasmagorian", 77, Rarity.UNCOMMON, mage.cards.p.Phantasmagorian.class));
        cards.add(new SetCardInfo("Piracy Charm", 58, Rarity.COMMON, mage.cards.p.PiracyCharm.class));
        cards.add(new SetCardInfo("Pongify", 44, Rarity.UNCOMMON, mage.cards.p.Pongify.class));
        cards.add(new SetCardInfo("Porphyry Nodes", 28, Rarity.RARE, mage.cards.p.PorphyryNodes.class));
        cards.add(new SetCardInfo("Poultice Sliver", 11, Rarity.COMMON, mage.cards.p.PoulticeSliver.class));
        cards.add(new SetCardInfo("Pouncing Wurm", 136, Rarity.UNCOMMON, mage.cards.p.PouncingWurm.class));
        cards.add(new SetCardInfo("Primal Plasma", 59, Rarity.COMMON, mage.cards.p.PrimalPlasma.class));
        cards.add(new SetCardInfo("Prodigal Pyromancer", 118, Rarity.COMMON, mage.cards.p.ProdigalPyromancer.class));
        cards.add(new SetCardInfo("Psychotrope Thallid", 137, Rarity.UNCOMMON, mage.cards.p.PsychotropeThallid.class));
        cards.add(new SetCardInfo("Pyrohemia", 119, Rarity.UNCOMMON, mage.cards.p.Pyrohemia.class));
        cards.add(new SetCardInfo("Radha, Heir to Keld", 162, Rarity.RARE, mage.cards.r.RadhaHeirToKeld.class));
        cards.add(new SetCardInfo("Rathi Trapper", 90, Rarity.COMMON, mage.cards.r.RathiTrapper.class));
        cards.add(new SetCardInfo("Reality Acid", 45, Rarity.COMMON, mage.cards.r.RealityAcid.class));
        cards.add(new SetCardInfo("Rebuff the Wicked", 12, Rarity.UNCOMMON, mage.cards.r.RebuffTheWicked.class));
        cards.add(new SetCardInfo("Reckless Wurm", 120, Rarity.UNCOMMON, mage.cards.r.RecklessWurm.class));
        cards.add(new SetCardInfo("Reflex Sliver", 138, Rarity.COMMON, mage.cards.r.ReflexSliver.class));
        cards.add(new SetCardInfo("Revered Dead", 29, Rarity.COMMON, mage.cards.r.ReveredDead.class));
        cards.add(new SetCardInfo("Ridged Kusite", 78, Rarity.COMMON, mage.cards.r.RidgedKusite.class));
        cards.add(new SetCardInfo("Riftmarked Knight", 14, Rarity.UNCOMMON, mage.cards.r.RiftmarkedKnight.class));
        cards.add(new SetCardInfo("Riptide Pilferer", 60, Rarity.UNCOMMON, mage.cards.r.RiptidePilferer.class));
        cards.add(new SetCardInfo("Roiling Horror", 79, Rarity.RARE, mage.cards.r.RoilingHorror.class));
        cards.add(new SetCardInfo("Rough // Tumble", 114, Rarity.UNCOMMON, mage.cards.r.RoughTumble.class));
        cards.add(new SetCardInfo("Saltblast", 15, Rarity.UNCOMMON, mage.cards.s.Saltblast.class));
        cards.add(new SetCardInfo("Saltfield Recluse", 16, Rarity.COMMON, mage.cards.s.SaltfieldRecluse.class));
        cards.add(new SetCardInfo("Seal of Primordium", 153, Rarity.COMMON, mage.cards.s.SealOfPrimordium.class));
        cards.add(new SetCardInfo("Serendib Sorcerer", 61, Rarity.RARE, mage.cards.s.SerendibSorcerer.class));
        cards.add(new SetCardInfo("Serra's Boon", 17, Rarity.UNCOMMON, mage.cards.s.SerrasBoon.class));
        cards.add(new SetCardInfo("Serra Sphinx", 62, Rarity.RARE, mage.cards.s.SerraSphinx.class));
        cards.add(new SetCardInfo("Shade of Trokair", 18, Rarity.COMMON, mage.cards.s.ShadeOfTrokair.class));
        cards.add(new SetCardInfo("Shaper Parasite", 46, Rarity.COMMON, mage.cards.s.ShaperParasite.class));
        cards.add(new SetCardInfo("Shivan Meteor", 106, Rarity.UNCOMMON, mage.cards.s.ShivanMeteor.class));
        cards.add(new SetCardInfo("Shivan Wumpus", 121, Rarity.RARE, mage.cards.s.ShivanWumpus.class));
        cards.add(new SetCardInfo("Shrouded Lore", 91, Rarity.UNCOMMON, mage.cards.s.ShroudedLore.class));
        cards.add(new SetCardInfo("Simian Spirit Guide", 122, Rarity.COMMON, mage.cards.s.SimianSpiritGuide.class));
        cards.add(new SetCardInfo("Sinew Sliver", 30, Rarity.COMMON, mage.cards.s.SinewSliver.class));
        cards.add(new SetCardInfo("Skirk Shaman", 123, Rarity.COMMON, mage.cards.s.SkirkShaman.class));
        cards.add(new SetCardInfo("Sophic Centaur", 139, Rarity.UNCOMMON, mage.cards.s.SophicCentaur.class));
        cards.add(new SetCardInfo("Spellshift", 47, Rarity.RARE, mage.cards.s.Spellshift.class));
        cards.add(new SetCardInfo("Spitting Sliver", 80, Rarity.COMMON, mage.cards.s.SpittingSliver.class));
        cards.add(new SetCardInfo("Stingscourger", 107, Rarity.COMMON, mage.cards.s.Stingscourger.class));
        cards.add(new SetCardInfo("Stonecloaker", 19, Rarity.UNCOMMON, mage.cards.s.Stonecloaker.class));
        cards.add(new SetCardInfo("Stormfront Riders", 20, Rarity.UNCOMMON, mage.cards.s.StormfrontRiders.class));
        cards.add(new SetCardInfo("Sulfur Elemental", 108, Rarity.UNCOMMON, mage.cards.s.SulfurElemental.class));
        cards.add(new SetCardInfo("Sunlance", 31, Rarity.COMMON, mage.cards.s.Sunlance.class));
        cards.add(new SetCardInfo("Synchronous Sliver", 48, Rarity.COMMON, mage.cards.s.SynchronousSliver.class));
        cards.add(new SetCardInfo("Temporal Extortion", 81, Rarity.RARE, mage.cards.t.TemporalExtortion.class));
        cards.add(new SetCardInfo("Teneb, the Harvester", 163, Rarity.RARE, mage.cards.t.TenebTheHarvester.class));
        cards.add(new SetCardInfo("Tidewalker", 49, Rarity.UNCOMMON, mage.cards.t.Tidewalker.class));
        cards.add(new SetCardInfo("Timbermare", 140, Rarity.RARE, mage.cards.t.Timbermare.class));
        cards.add(new SetCardInfo("Timecrafting", 109, Rarity.UNCOMMON, mage.cards.t.Timecrafting.class));
        cards.add(new SetCardInfo("Torchling", 110, Rarity.RARE, mage.cards.t.Torchling.class));
        cards.add(new SetCardInfo("Uktabi Drake", 141, Rarity.COMMON, mage.cards.u.UktabiDrake.class));
        cards.add(new SetCardInfo("Urborg, Tomb of Yawgmoth", 165, Rarity.RARE, mage.cards.u.UrborgTombOfYawgmoth.class));
        cards.add(new SetCardInfo("Utopia Vow", 142, Rarity.COMMON, mage.cards.u.UtopiaVow.class));
        cards.add(new SetCardInfo("Vampiric Link", 92, Rarity.COMMON, mage.cards.v.VampiricLink.class));
        cards.add(new SetCardInfo("Venarian Glimmer", 52, Rarity.UNCOMMON, mage.cards.v.VenarianGlimmer.class));
        cards.add(new SetCardInfo("Vitaspore Thallid", 143, Rarity.COMMON, mage.cards.v.VitasporeThallid.class));
        cards.add(new SetCardInfo("Voidstone Gargoyle", 21, Rarity.RARE, mage.cards.v.VoidstoneGargoyle.class));
        cards.add(new SetCardInfo("Vorosh, the Hunter", 164, Rarity.RARE, mage.cards.v.VoroshTheHunter.class));
        cards.add(new SetCardInfo("Waning Wurm", 83, Rarity.UNCOMMON, mage.cards.w.WaningWurm.class));
        cards.add(new SetCardInfo("Whitemane Lion", 22, Rarity.COMMON, mage.cards.w.WhitemaneLion.class));
        cards.add(new SetCardInfo("Wild Pair", 144, Rarity.RARE, mage.cards.w.WildPair.class));
        cards.add(new SetCardInfo("Wistful Thinking", 53, Rarity.COMMON, mage.cards.w.WistfulThinking.class));
    }
}
