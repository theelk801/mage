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

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author TheElk801
 */
public class ElvesVsInventors extends ExpansionSet {

    private static final ElvesVsInventors instance = new ElvesVsInventors();

    public static ElvesVsInventors getInstance() {
        return instance;
    }

    private ElvesVsInventors() {
        super("Duel Decks: Elves vs. Inventors", "DDU", ExpansionSet.buildDate(2018, 4, 6), SetType.SUPPLEMENTAL);
        this.blockName = "Duel Decks";
        cards.add(new SetCardInfo("Ezuri, Renegade Leader", 1, Rarity.MYTHIC, mage.cards.e.EzuriRenegadeLeader.class));
        cards.add(new SetCardInfo("Dwynen, Gilt-Leaf Daen", 2, Rarity.MYTHIC, mage.cards.d.DwynenGiltLeafDaen.class));
        cards.add(new SetCardInfo("Dwynen's Elite", 3, Rarity.MYTHIC, mage.cards.d.DwynensElite.class));
        cards.add(new SetCardInfo("Elvish Aberration", 4, Rarity.MYTHIC, mage.cards.e.ElvishAberration.class));
        cards.add(new SetCardInfo("Elvish Archdruid", 5, Rarity.MYTHIC, mage.cards.e.ElvishArchdruid.class));
        cards.add(new SetCardInfo("Elvish Branchbender", 6, Rarity.MYTHIC, mage.cards.e.ElvishBranchbender.class));
        cards.add(new SetCardInfo("Elvish Mystic", 7, Rarity.MYTHIC, mage.cards.e.ElvishMystic.class));
        cards.add(new SetCardInfo("Elvish Vanguard", 8, Rarity.MYTHIC, mage.cards.e.ElvishVanguard.class));
        cards.add(new SetCardInfo("Ezuri's Archers", 9, Rarity.MYTHIC, mage.cards.e.EzurisArchers.class));
        cards.add(new SetCardInfo("Fierce Empath", 10, Rarity.MYTHIC, mage.cards.f.FierceEmpath.class));
        cards.add(new SetCardInfo("Gladehart Cavalry", 11, Rarity.MYTHIC, mage.cards.g.GladehartCavalry.class));
        cards.add(new SetCardInfo("Ivy Lane Denizen", 12, Rarity.MYTHIC, mage.cards.i.IvyLaneDenizen.class));
        cards.add(new SetCardInfo("Jagged-Scar Archers", 13, Rarity.MYTHIC, mage.cards.j.JaggedScarArchers.class));
        cards.add(new SetCardInfo("Krosan Tusker", 14, Rarity.MYTHIC, mage.cards.k.KrosanTusker.class));
        cards.add(new SetCardInfo("Kujar Seedsculptor", 15, Rarity.MYTHIC, mage.cards.k.KujarSeedsculptor.class));
        cards.add(new SetCardInfo("Lead the Stampede", 16, Rarity.MYTHIC, mage.cards.l.LeadTheStampede.class));
        cards.add(new SetCardInfo("Leaf Gilder", 17, Rarity.MYTHIC, mage.cards.l.LeafGilder.class));
        cards.add(new SetCardInfo("Llanowar Empath", 18, Rarity.MYTHIC, mage.cards.l.LlanowarEmpath.class));
        cards.add(new SetCardInfo("Naturalize", 19, Rarity.MYTHIC, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Nature's Way", 20, Rarity.MYTHIC, mage.cards.n.NaturesWay.class));
        cards.add(new SetCardInfo("Nissa's Judgment", 21, Rarity.MYTHIC, mage.cards.n.NissasJudgment.class));
        cards.add(new SetCardInfo("Regal Force", 22, Rarity.MYTHIC, mage.cards.r.RegalForce.class));
        cards.add(new SetCardInfo("Sylvan Advocate", 23, Rarity.MYTHIC, mage.cards.s.SylvanAdvocate.class));
        cards.add(new SetCardInfo("Talara's Battalion", 24, Rarity.MYTHIC, mage.cards.t.TalarasBattalion.class));
        cards.add(new SetCardInfo("Viridian Shaman", 25, Rarity.MYTHIC, mage.cards.v.ViridianShaman.class));
        cards.add(new SetCardInfo("Wildheart Invoker", 26, Rarity.MYTHIC, mage.cards.w.WildheartInvoker.class));
        cards.add(new SetCardInfo("Yeva, Nature's Herald", 27, Rarity.MYTHIC, mage.cards.y.YevaNaturesHerald.class));
        cards.add(new SetCardInfo("Oran-Rief, the Vastwood", 28, Rarity.MYTHIC, mage.cards.o.OranRiefTheVastwood.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 29, Rarity.MYTHIC, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Treetop Village", 30, Rarity.MYTHIC, mage.cards.t.TreetopVillage.class));
        cards.add(new SetCardInfo("Forest", 31, Rarity.MYTHIC, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 32, Rarity.MYTHIC, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 33, Rarity.MYTHIC, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 34, Rarity.MYTHIC, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Welder", 35, Rarity.MYTHIC, mage.cards.g.GoblinWelder.class));
        cards.add(new SetCardInfo("Artificer's Epiphany", 36, Rarity.MYTHIC, mage.cards.a.ArtificersEpiphany.class));
        cards.add(new SetCardInfo("Etherium Sculptor", 37, Rarity.MYTHIC, mage.cards.e.EtheriumSculptor.class));
        cards.add(new SetCardInfo("Faerie Mechanist", 38, Rarity.MYTHIC, mage.cards.f.FaerieMechanist.class));
        cards.add(new SetCardInfo("Riddlesmith", 39, Rarity.MYTHIC, mage.cards.r.Riddlesmith.class));
        cards.add(new SetCardInfo("Treasure Mage", 40, Rarity.MYTHIC, mage.cards.t.TreasureMage.class));
        cards.add(new SetCardInfo("Trinket Mage", 41, Rarity.MYTHIC, mage.cards.t.TrinketMage.class));
        cards.add(new SetCardInfo("Trophy Mage", 42, Rarity.MYTHIC, mage.cards.t.TrophyMage.class));
        cards.add(new SetCardInfo("Whirler Rogue", 43, Rarity.MYTHIC, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Barrage Ogre", 44, Rarity.MYTHIC, mage.cards.b.BarrageOgre.class));
        cards.add(new SetCardInfo("Galvanic Blast", 45, Rarity.MYTHIC, mage.cards.g.GalvanicBlast.class));
        cards.add(new SetCardInfo("Ghirapur Gearcrafter", 46, Rarity.MYTHIC, mage.cards.g.GhirapurGearcrafter.class));
        cards.add(new SetCardInfo("Pia and Kiran Nalaar", 47, Rarity.MYTHIC, mage.cards.p.PiaAndKiranNalaar.class));
        cards.add(new SetCardInfo("Shrapnel Blast", 48, Rarity.MYTHIC, mage.cards.s.ShrapnelBlast.class));
        cards.add(new SetCardInfo("Welding Sparks", 49, Rarity.MYTHIC, mage.cards.w.WeldingSparks.class));
        cards.add(new SetCardInfo("Maverick Thopterist", 50, Rarity.MYTHIC, mage.cards.m.MaverickThopterist.class));
        cards.add(new SetCardInfo("Reclusive Artificer", 51, Rarity.MYTHIC, mage.cards.r.ReclusiveArtificer.class));
        cards.add(new SetCardInfo("Darksteel Plate", 52, Rarity.MYTHIC, mage.cards.d.DarksteelPlate.class));
        cards.add(new SetCardInfo("Filigree Familiar", 53, Rarity.MYTHIC, mage.cards.f.FiligreeFamiliar.class));
        cards.add(new SetCardInfo("Ichor Wellspring", 54, Rarity.MYTHIC, mage.cards.i.IchorWellspring.class));
        cards.add(new SetCardInfo("Inventor's Goggles", 55, Rarity.MYTHIC, mage.cards.i.InventorsGoggles.class));
        cards.add(new SetCardInfo("Mycosynth Wellspring", 56, Rarity.MYTHIC, mage.cards.m.MycosynthWellspring.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 57, Rarity.MYTHIC, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Myr Sire", 58, Rarity.MYTHIC, mage.cards.m.MyrSire.class));
        cards.add(new SetCardInfo("Neurok Replica", 59, Rarity.MYTHIC, mage.cards.n.NeurokReplica.class));
        cards.add(new SetCardInfo("Pyrite Spellbomb", 60, Rarity.MYTHIC, mage.cards.p.PyriteSpellbomb.class));
        cards.add(new SetCardInfo("Scuttling Doom Engine", 61, Rarity.MYTHIC, mage.cards.s.ScuttlingDoomEngine.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 62, Rarity.MYTHIC, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Thopter Assembly", 63, Rarity.MYTHIC, mage.cards.t.ThopterAssembly.class));
        cards.add(new SetCardInfo("Voyager Staff", 64, Rarity.MYTHIC, mage.cards.v.VoyagerStaff.class));
        cards.add(new SetCardInfo("Darksteel Citadel", 65, Rarity.MYTHIC, mage.cards.d.DarksteelCitadel.class));
        cards.add(new SetCardInfo("Foundry of the Consuls", 66, Rarity.MYTHIC, mage.cards.f.FoundryOfTheConsuls.class));
        cards.add(new SetCardInfo("Great Furnace", 67, Rarity.MYTHIC, mage.cards.g.GreatFurnace.class));
        cards.add(new SetCardInfo("Phyrexia's Core", 68, Rarity.MYTHIC, mage.cards.p.PhyrexiasCore.class));
        cards.add(new SetCardInfo("Seat of the Synod", 69, Rarity.MYTHIC, mage.cards.s.SeatOfTheSynod.class));
        cards.add(new SetCardInfo("Shivan Reef", 70, Rarity.MYTHIC, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 71, Rarity.MYTHIC, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 72, Rarity.MYTHIC, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Island", 73, Rarity.MYTHIC, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 74, Rarity.MYTHIC, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 75, Rarity.MYTHIC, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 76, Rarity.MYTHIC, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
    }
}
