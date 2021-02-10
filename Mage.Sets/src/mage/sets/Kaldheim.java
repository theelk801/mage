package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardCriteria;
import mage.cards.repository.CardInfo;
import mage.cards.repository.CardRepository;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.constants.SuperType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Kaldheim extends ExpansionSet {

    private static final Kaldheim instance = new Kaldheim();

    public static Kaldheim getInstance() {
        return instance;
    }

    private final List<CardInfo> savedSpecialLand = new ArrayList<>();

    private Kaldheim() {
        super("Kaldheim", "KHM", ExpansionSet.buildDate(2021, 2, 5), SetType.EXPANSION, new KaldheimCollator());
        this.blockName = "Kaldheim";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 7.4;
        this.maxCardNumberInBooster = 285;
        this.ratioBoosterSpecialLand = 12;
        this.ratioBoosterSpecialLandNumerator = 5;

        cards.add(new SetCardInfo("Absorb Identity", 383, Rarity.UNCOMMON, mage.cards.a.AbsorbIdentity.class));
        cards.add(new SetCardInfo("Aegar, the Freezing Flame", 200, Rarity.UNCOMMON, mage.cards.a.AegarTheFreezingFlame.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Aegar, the Freezing Flame", 321, Rarity.UNCOMMON, mage.cards.a.AegarTheFreezingFlame.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Alpine Meadow", 248, Rarity.COMMON, mage.cards.a.AlpineMeadow.class));
        cards.add(new SetCardInfo("Alrund's Epiphany", 295, Rarity.MYTHIC, mage.cards.a.AlrundsEpiphany.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Alrund's Epiphany", 41, Rarity.MYTHIC, mage.cards.a.AlrundsEpiphany.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Alrund, God of the Cosmos", 302, Rarity.MYTHIC, mage.cards.a.AlrundGodOfTheCosmos.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Alrund, God of the Cosmos", 40, Rarity.MYTHIC, mage.cards.a.AlrundGodOfTheCosmos.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Annul", 42, Rarity.COMMON, mage.cards.a.Annul.class));
        cards.add(new SetCardInfo("Arachnoform", 159, Rarity.COMMON, mage.cards.a.Arachnoform.class));
        cards.add(new SetCardInfo("Arctic Treeline", 249, Rarity.COMMON, mage.cards.a.ArcticTreeline.class));
        cards.add(new SetCardInfo("Armed and Armored", 379, Rarity.UNCOMMON, mage.cards.a.ArmedAndArmored.class));
        cards.add(new SetCardInfo("Arni Brokenbrow", 120, Rarity.RARE, mage.cards.a.ArniBrokenbrow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Arni Brokenbrow", 310, Rarity.RARE, mage.cards.a.ArniBrokenbrow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Arni Slays the Troll", 201, Rarity.UNCOMMON, mage.cards.a.ArniSlaysTheTroll.class));
        cards.add(new SetCardInfo("Ascendant Spirit", 341, Rarity.RARE, mage.cards.a.AscendantSpirit.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ascendant Spirit", 43, Rarity.RARE, mage.cards.a.AscendantSpirit.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ascent of the Worthy", 202, Rarity.UNCOMMON, mage.cards.a.AscentOfTheWorthy.class));
        cards.add(new SetCardInfo("Augury Raven", 44, Rarity.COMMON, mage.cards.a.AuguryRaven.class));
        cards.add(new SetCardInfo("Avalanche Caller", 45, Rarity.UNCOMMON, mage.cards.a.AvalancheCaller.class));
        cards.add(new SetCardInfo("Axgard Armory", 250, Rarity.UNCOMMON, mage.cards.a.AxgardArmory.class));
        cards.add(new SetCardInfo("Axgard Braggart", 1, Rarity.COMMON, mage.cards.a.AxgardBraggart.class));
        cards.add(new SetCardInfo("Axgard Cavalry", 121, Rarity.COMMON, mage.cards.a.AxgardCavalry.class));
        cards.add(new SetCardInfo("Barkchannel Pathway", 251, Rarity.RARE, mage.cards.b.BarkchannelPathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Barkchannel Pathway", 290, Rarity.RARE, mage.cards.b.BarkchannelPathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Basalt Ravager", 122, Rarity.UNCOMMON, mage.cards.b.BasaltRavager.class));
        cards.add(new SetCardInfo("Battershield Warrior", 2, Rarity.UNCOMMON, mage.cards.b.BattershieldWarrior.class));
        cards.add(new SetCardInfo("Battle Mammoth", 160, Rarity.MYTHIC, mage.cards.b.BattleMammoth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Battle Mammoth", 298, Rarity.MYTHIC, mage.cards.b.BattleMammoth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Battle for Bretagard", 203, Rarity.RARE, mage.cards.b.BattleForBretagard.class));
        cards.add(new SetCardInfo("Battle of Frost and Fire", 204, Rarity.RARE, mage.cards.b.BattleOfFrostAndFire.class));
        cards.add(new SetCardInfo("Battlefield Raptor", 3, Rarity.COMMON, mage.cards.b.BattlefieldRaptor.class));
        cards.add(new SetCardInfo("Bearded Axe", 388, Rarity.UNCOMMON, mage.cards.b.BeardedAxe.class));
        cards.add(new SetCardInfo("Behold the Multiverse", 46, Rarity.COMMON, mage.cards.b.BeholdTheMultiverse.class));
        cards.add(new SetCardInfo("Berg Strider", 47, Rarity.COMMON, mage.cards.b.BergStrider.class));
        cards.add(new SetCardInfo("Beskir Shieldmate", 4, Rarity.COMMON, mage.cards.b.BeskirShieldmate.class));
        cards.add(new SetCardInfo("Bind the Monster", 48, Rarity.COMMON, mage.cards.b.BindTheMonster.class));
        cards.add(new SetCardInfo("Binding the Old Gods", 206, Rarity.UNCOMMON, mage.cards.b.BindingTheOldGods.class));
        cards.add(new SetCardInfo("Birgi, God of Storytelling", 123, Rarity.RARE, mage.cards.b.BirgiGodOfStorytelling.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Birgi, God of Storytelling", 311, Rarity.RARE, mage.cards.b.BirgiGodOfStorytelling.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blessing of Frost", 161, Rarity.RARE, mage.cards.b.BlessingOfFrost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blessing of Frost", 362, Rarity.RARE, mage.cards.b.BlessingOfFrost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blightstep Pathway", 252, Rarity.RARE, mage.cards.b.BlightstepPathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blightstep Pathway", 291, Rarity.RARE, mage.cards.b.BlightstepPathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blizzard Brawl", 162, Rarity.UNCOMMON, mage.cards.b.BlizzardBrawl.class));
        cards.add(new SetCardInfo("Blood on the Snow", 348, Rarity.RARE, mage.cards.b.BloodOnTheSnow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blood on the Snow", 79, Rarity.RARE, mage.cards.b.BloodOnTheSnow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodline Pretender", 235, Rarity.UNCOMMON, mage.cards.b.BloodlinePretender.class));
        cards.add(new SetCardInfo("Bloodsky Berserker", 80, Rarity.UNCOMMON, mage.cards.b.BloodskyBerserker.class));
        cards.add(new SetCardInfo("Boreal Outrider", 163, Rarity.UNCOMMON, mage.cards.b.BorealOutrider.class));
        cards.add(new SetCardInfo("Bound in Gold", 5, Rarity.COMMON, mage.cards.b.BoundInGold.class));
        cards.add(new SetCardInfo("Breakneck Berserker", 124, Rarity.COMMON, mage.cards.b.BreakneckBerserker.class));
        cards.add(new SetCardInfo("Bretagard Stronghold", 253, Rarity.UNCOMMON, mage.cards.b.BretagardStronghold.class));
        cards.add(new SetCardInfo("Brinebarrow Intruder", 49, Rarity.COMMON, mage.cards.b.BrinebarrowIntruder.class));
        cards.add(new SetCardInfo("Broken Wings", 164, Rarity.COMMON, mage.cards.b.BrokenWings.class));
        cards.add(new SetCardInfo("Burning-Rune Demon", 349, Rarity.MYTHIC, mage.cards.b.BurningRuneDemon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Burning-Rune Demon", 81, Rarity.MYTHIC, mage.cards.b.BurningRuneDemon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Calamity Bearer", 125, Rarity.RARE, mage.cards.c.CalamityBearer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Calamity Bearer", 356, Rarity.RARE, mage.cards.c.CalamityBearer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Canopy Tactician", 378, Rarity.RARE, mage.cards.c.CanopyTactician.class));
        cards.add(new SetCardInfo("Cinderheart Giant", 126, Rarity.COMMON, mage.cards.c.CinderheartGiant.class));
        cards.add(new SetCardInfo("Clarion Spirit", 6, Rarity.UNCOMMON, mage.cards.c.ClarionSpirit.class));
        cards.add(new SetCardInfo("Cleaving Reaper", 376, Rarity.RARE, mage.cards.c.CleavingReaper.class));
        cards.add(new SetCardInfo("Codespell Cleric", 7, Rarity.COMMON, mage.cards.c.CodespellCleric.class));
        cards.add(new SetCardInfo("Colossal Plow", 236, Rarity.UNCOMMON, mage.cards.c.ColossalPlow.class));
        cards.add(new SetCardInfo("Cosima, God of the Voyage", 303, Rarity.RARE, mage.cards.c.CosimaGodOfTheVoyage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosima, God of the Voyage", 50, Rarity.RARE, mage.cards.c.CosimaGodOfTheVoyage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmos Charger", 342, Rarity.RARE, mage.cards.c.CosmosCharger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmos Charger", 51, Rarity.RARE, mage.cards.c.CosmosCharger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmos Elixir", 237, Rarity.RARE, mage.cards.c.CosmosElixir.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmos Elixir", 368, Rarity.RARE, mage.cards.c.CosmosElixir.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Craven Hulk", 127, Rarity.COMMON, mage.cards.c.CravenHulk.class));
        cards.add(new SetCardInfo("Crippling Fear", 350, Rarity.RARE, mage.cards.c.CripplingFear.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Crippling Fear", 82, Rarity.RARE, mage.cards.c.CripplingFear.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Crush the Weak", 128, Rarity.UNCOMMON, mage.cards.c.CrushTheWeak.class));
        cards.add(new SetCardInfo("Cyclone Summoner", 343, Rarity.RARE, mage.cards.c.CycloneSummoner.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cyclone Summoner", 52, Rarity.RARE, mage.cards.c.CycloneSummoner.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Darkbore Pathway", 254, Rarity.RARE, mage.cards.d.DarkborePathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Darkbore Pathway", 292, Rarity.RARE, mage.cards.d.DarkborePathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deathknell Berserker", 83, Rarity.COMMON, mage.cards.d.DeathknellBerserker.class));
        cards.add(new SetCardInfo("Demon Bolt", 129, Rarity.COMMON, mage.cards.d.DemonBolt.class));
        cards.add(new SetCardInfo("Demonic Gifts", 84, Rarity.COMMON, mage.cards.d.DemonicGifts.class));
        cards.add(new SetCardInfo("Depart the Realm", 53, Rarity.COMMON, mage.cards.d.DepartTheRealm.class));
        cards.add(new SetCardInfo("Disdainful Stroke", 54, Rarity.COMMON, mage.cards.d.DisdainfulStroke.class));
        cards.add(new SetCardInfo("Divine Gambit", 8, Rarity.UNCOMMON, mage.cards.d.DivineGambit.class));
        cards.add(new SetCardInfo("Dogged Pursuit", 85, Rarity.COMMON, mage.cards.d.DoggedPursuit.class));
        cards.add(new SetCardInfo("Doomskar Oracle", 10, Rarity.COMMON, mage.cards.d.DoomskarOracle.class));
        cards.add(new SetCardInfo("Doomskar Titan", 130, Rarity.UNCOMMON, mage.cards.d.DoomskarTitan.class));
        cards.add(new SetCardInfo("Doomskar", 334, Rarity.RARE, mage.cards.d.Doomskar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Doomskar", 9, Rarity.RARE, mage.cards.d.Doomskar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dragonkin Berserker", 131, Rarity.RARE, mage.cards.d.DragonkinBerserker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dragonkin Berserker", 357, Rarity.RARE, mage.cards.d.DragonkinBerserker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Draugr Necromancer", 351, Rarity.RARE, mage.cards.d.DraugrNecromancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Draugr Necromancer", 86, Rarity.RARE, mage.cards.d.DraugrNecromancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Draugr Recruiter", 87, Rarity.COMMON, mage.cards.d.DraugrRecruiter.class));
        cards.add(new SetCardInfo("Draugr Thought-Thief", 55, Rarity.COMMON, mage.cards.d.DraugrThoughtThief.class));
        cards.add(new SetCardInfo("Draugr's Helm", 88, Rarity.UNCOMMON, mage.cards.d.DraugrsHelm.class));
        cards.add(new SetCardInfo("Dread Rider", 89, Rarity.COMMON, mage.cards.d.DreadRider.class));
        cards.add(new SetCardInfo("Dream Devourer", 352, Rarity.RARE, mage.cards.d.DreamDevourer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dream Devourer", 90, Rarity.RARE, mage.cards.d.DreamDevourer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dual Strike", 132, Rarity.UNCOMMON, mage.cards.d.DualStrike.class));
        cards.add(new SetCardInfo("Duskwielder", 91, Rarity.COMMON, mage.cards.d.Duskwielder.class));
        cards.add(new SetCardInfo("Dwarven Hammer", 133, Rarity.UNCOMMON, mage.cards.d.DwarvenHammer.class));
        cards.add(new SetCardInfo("Dwarven Reinforcements", 134, Rarity.COMMON, mage.cards.d.DwarvenReinforcements.class));
        cards.add(new SetCardInfo("Egon, God of Death", 306, Rarity.RARE, mage.cards.e.EgonGodOfDeath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Egon, God of Death", 92, Rarity.RARE, mage.cards.e.EgonGodOfDeath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elderfang Disciple", 93, Rarity.COMMON, mage.cards.e.ElderfangDisciple.class));
        cards.add(new SetCardInfo("Elderfang Ritualist", 385, Rarity.UNCOMMON, mage.cards.e.ElderfangRitualist.class));
        cards.add(new SetCardInfo("Elderleaf Mentor", 165, Rarity.COMMON, mage.cards.e.ElderleafMentor.class));
        cards.add(new SetCardInfo("Elven Ambush", 391, Rarity.UNCOMMON, mage.cards.e.ElvenAmbush.class));
        cards.add(new SetCardInfo("Elven Bow", 166, Rarity.UNCOMMON, mage.cards.e.ElvenBow.class));
        cards.add(new SetCardInfo("Elvish Warmaster", 167, Rarity.RARE, mage.cards.e.ElvishWarmaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Warmaster", 363, Rarity.RARE, mage.cards.e.ElvishWarmaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Eradicator Valkyrie", 353, Rarity.MYTHIC, mage.cards.e.EradicatorValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Eradicator Valkyrie", 94, Rarity.MYTHIC, mage.cards.e.EradicatorValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Esika's Chariot", 169, Rarity.RARE, mage.cards.e.EsikasChariot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Esika's Chariot", 315, Rarity.RARE, mage.cards.e.EsikasChariot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Esika, God of the Tree", 168, Rarity.MYTHIC, mage.cards.e.EsikaGodOfTheTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Esika, God of the Tree", 314, Rarity.MYTHIC, mage.cards.e.EsikaGodOfTheTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Faceless Haven", 255, Rarity.RARE, mage.cards.f.FacelessHaven.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Faceless Haven", 371, Rarity.RARE, mage.cards.f.FacelessHaven.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fall of the Impostor", 208, Rarity.UNCOMMON, mage.cards.f.FallOfTheImpostor.class));
        cards.add(new SetCardInfo("Fearless Liberator", 135, Rarity.UNCOMMON, mage.cards.f.FearlessLiberator.class));
        cards.add(new SetCardInfo("Fearless Pup", 136, Rarity.COMMON, mage.cards.f.FearlessPup.class));
        cards.add(new SetCardInfo("Feed the Serpent", 95, Rarity.COMMON, mage.cards.f.FeedTheSerpent.class));
        cards.add(new SetCardInfo("Fire Giant's Fury", 389, Rarity.UNCOMMON, mage.cards.f.FireGiantsFury.class));
        cards.add(new SetCardInfo("Firja's Retribution", 210, Rarity.RARE, mage.cards.f.FirjasRetribution.class));
        cards.add(new SetCardInfo("Firja, Judge of Valor", 209, Rarity.UNCOMMON, mage.cards.f.FirjaJudgeOfValor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Firja, Judge of Valor", 322, Rarity.UNCOMMON, mage.cards.f.FirjaJudgeOfValor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 398, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forging the Tyrite Sword", 211, Rarity.UNCOMMON, mage.cards.f.ForgingTheTyriteSword.class));
        cards.add(new SetCardInfo("Frenzied Raider", 137, Rarity.UNCOMMON, mage.cards.f.FrenziedRaider.class));
        cards.add(new SetCardInfo("Frost Augur", 56, Rarity.UNCOMMON, mage.cards.f.FrostAugur.class));
        cards.add(new SetCardInfo("Frost Bite", 138, Rarity.COMMON, mage.cards.f.FrostBite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frost Bite", 404, Rarity.COMMON, mage.cards.f.FrostBite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frostpeak Yeti", 57, Rarity.COMMON, mage.cards.f.FrostpeakYeti.class));
        cards.add(new SetCardInfo("Frostpyre Arcanist", 58, Rarity.UNCOMMON, mage.cards.f.FrostpyreArcanist.class));
        cards.add(new SetCardInfo("Funeral Longboat", 238, Rarity.COMMON, mage.cards.f.FuneralLongboat.class));
        cards.add(new SetCardInfo("Fynn, the Fangbearer", 170, Rarity.UNCOMMON, mage.cards.f.FynnTheFangbearer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fynn, the Fangbearer", 316, Rarity.UNCOMMON, mage.cards.f.FynnTheFangbearer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gates of Istfell", 256, Rarity.UNCOMMON, mage.cards.g.GatesOfIstfell.class));
        cards.add(new SetCardInfo("Giant Ox", 11, Rarity.COMMON, mage.cards.g.GiantOx.class));
        cards.add(new SetCardInfo("Giant's Amulet", 59, Rarity.UNCOMMON, mage.cards.g.GiantsAmulet.class));
        cards.add(new SetCardInfo("Giant's Grasp", 384, Rarity.UNCOMMON, mage.cards.g.GiantsGrasp.class));
        cards.add(new SetCardInfo("Gilded Assault Cart", 390, Rarity.UNCOMMON, mage.cards.g.GildedAssaultCart.class));
        cards.add(new SetCardInfo("Glacial Floodplain", 257, Rarity.COMMON, mage.cards.g.GlacialFloodplain.class));
        cards.add(new SetCardInfo("Gladewalker Ritualist", 392, Rarity.UNCOMMON, mage.cards.g.GladewalkerRitualist.class));
        cards.add(new SetCardInfo("Glimpse the Cosmos", 60, Rarity.UNCOMMON, mage.cards.g.GlimpseTheCosmos.class));
        cards.add(new SetCardInfo("Glittering Frost", 171, Rarity.COMMON, mage.cards.g.GlitteringFrost.class));
        cards.add(new SetCardInfo("Glorious Protector", 12, Rarity.RARE, mage.cards.g.GloriousProtector.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glorious Protector", 335, Rarity.RARE, mage.cards.g.GloriousProtector.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gnottvold Recluse", 172, Rarity.COMMON, mage.cards.g.GnottvoldRecluse.class));
        cards.add(new SetCardInfo("Gnottvold Slumbermound", 258, Rarity.UNCOMMON, mage.cards.g.GnottvoldSlumbermound.class));
        cards.add(new SetCardInfo("Gods' Hall Guardian", 13, Rarity.COMMON, mage.cards.g.GodsHallGuardian.class));
        cards.add(new SetCardInfo("Goldmaw Champion", 14, Rarity.COMMON, mage.cards.g.GoldmawChampion.class));
        cards.add(new SetCardInfo("Goldspan Dragon", 139, Rarity.MYTHIC, mage.cards.g.GoldspanDragon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goldspan Dragon", 358, Rarity.MYTHIC, mage.cards.g.GoldspanDragon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goldvein Pick", 239, Rarity.COMMON, mage.cards.g.GoldveinPick.class));
        cards.add(new SetCardInfo("Graven Lore", 344, Rarity.RARE, mage.cards.g.GravenLore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Graven Lore", 61, Rarity.RARE, mage.cards.g.GravenLore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Great Hall of Starnheim", 259, Rarity.UNCOMMON, mage.cards.g.GreatHallOfStarnheim.class));
        cards.add(new SetCardInfo("Grim Draugr", 96, Rarity.COMMON, mage.cards.g.GrimDraugr.class));
        cards.add(new SetCardInfo("Grizzled Outrider", 173, Rarity.COMMON, mage.cards.g.GrizzledOutrider.class));
        cards.add(new SetCardInfo("Guardian Gladewalker", 174, Rarity.COMMON, mage.cards.g.GuardianGladewalker.class));
        cards.add(new SetCardInfo("Hagi Mob", 140, Rarity.COMMON, mage.cards.h.HagiMob.class));
        cards.add(new SetCardInfo("Hailstorm Valkyrie", 97, Rarity.UNCOMMON, mage.cards.h.HailstormValkyrie.class));
        cards.add(new SetCardInfo("Halvar, God of Battle", 15, Rarity.MYTHIC, mage.cards.h.HalvarGodOfBattle.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Halvar, God of Battle", 299, Rarity.MYTHIC, mage.cards.h.HalvarGodOfBattle.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Harald Unites the Elves", 213, Rarity.RARE, mage.cards.h.HaraldUnitesTheElves.class));
        cards.add(new SetCardInfo("Harald, King of Skemfar", 212, Rarity.UNCOMMON, mage.cards.h.HaraldKingOfSkemfar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Harald, King of Skemfar", 323, Rarity.UNCOMMON, mage.cards.h.HaraldKingOfSkemfar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Haunting Voyage", 296, Rarity.MYTHIC, mage.cards.h.HauntingVoyage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Haunting Voyage", 98, Rarity.MYTHIC, mage.cards.h.HauntingVoyage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hengegate Pathway", 260, Rarity.RARE, mage.cards.h.HengegatePathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hengegate Pathway", 293, Rarity.RARE, mage.cards.h.HengegatePathway.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Highland Forest", 261, Rarity.COMMON, mage.cards.h.HighlandForest.class));
        cards.add(new SetCardInfo("Horizon Seeker", 175, Rarity.COMMON, mage.cards.h.HorizonSeeker.class));
        cards.add(new SetCardInfo("Ice Tunnel", 262, Rarity.COMMON, mage.cards.i.IceTunnel.class));
        cards.add(new SetCardInfo("Icebind Pillar", 62, Rarity.UNCOMMON, mage.cards.i.IcebindPillar.class));
        cards.add(new SetCardInfo("Icebreaker Kraken", 345, Rarity.RARE, mage.cards.i.IcebreakerKraken.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icebreaker Kraken", 63, Rarity.RARE, mage.cards.i.IcebreakerKraken.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icehide Troll", 176, Rarity.COMMON, mage.cards.i.IcehideTroll.class));
        cards.add(new SetCardInfo("Immersturm Predator", 214, Rarity.RARE, mage.cards.i.ImmersturmPredator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Immersturm Predator", 367, Rarity.RARE, mage.cards.i.ImmersturmPredator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Immersturm Raider", 141, Rarity.COMMON, mage.cards.i.ImmersturmRaider.class));
        cards.add(new SetCardInfo("Immersturm Skullcairn", 263, Rarity.UNCOMMON, mage.cards.i.ImmersturmSkullcairn.class));
        cards.add(new SetCardInfo("In Search of Greatness", 177, Rarity.RARE, mage.cards.i.InSearchOfGreatness.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("In Search of Greatness", 364, Rarity.RARE, mage.cards.i.InSearchOfGreatness.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Infernal Pet", 99, Rarity.COMMON, mage.cards.i.InfernalPet.class));
        cards.add(new SetCardInfo("Inga Rune-Eyes", 304, Rarity.UNCOMMON, mage.cards.i.IngaRuneEyes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Inga Rune-Eyes", 64, Rarity.UNCOMMON, mage.cards.i.IngaRuneEyes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Invasion of the Giants", 215, Rarity.UNCOMMON, mage.cards.i.InvasionOfTheGiants.class));
        cards.add(new SetCardInfo("Invoke the Divine", 16, Rarity.COMMON, mage.cards.i.InvokeTheDivine.class));
        cards.add(new SetCardInfo("Iron Verdict", 17, Rarity.COMMON, mage.cards.i.IronVerdict.class));
        cards.add(new SetCardInfo("Island", 395, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jarl of the Forsaken", 100, Rarity.COMMON, mage.cards.j.JarlOfTheForsaken.class));
        cards.add(new SetCardInfo("Jaspera Sentinel", 178, Rarity.COMMON, mage.cards.j.JasperaSentinel.class));
        cards.add(new SetCardInfo("Jorn, God of Winter", 179, Rarity.RARE, mage.cards.j.JornGodOfWinter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jorn, God of Winter", 317, Rarity.RARE, mage.cards.j.JornGodOfWinter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kardur's Vicious Return", 217, Rarity.UNCOMMON, mage.cards.k.KardursViciousReturn.class));
        cards.add(new SetCardInfo("Kardur, Doomscourge", 216, Rarity.UNCOMMON, mage.cards.k.KardurDoomscourge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kardur, Doomscourge", 324, Rarity.UNCOMMON, mage.cards.k.KardurDoomscourge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karfell Harbinger", 65, Rarity.COMMON, mage.cards.k.KarfellHarbinger.class));
        cards.add(new SetCardInfo("Karfell Kennel-Master", 101, Rarity.COMMON, mage.cards.k.KarfellKennelMaster.class));
        cards.add(new SetCardInfo("Kaya the Inexorable", 218, Rarity.MYTHIC, mage.cards.k.KayaTheInexorable.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaya the Inexorable", 288, Rarity.MYTHIC, mage.cards.k.KayaTheInexorable.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaya's Onslaught", 18, Rarity.UNCOMMON, mage.cards.k.KayasOnslaught.class));
        cards.add(new SetCardInfo("King Harald's Revenge", 180, Rarity.COMMON, mage.cards.k.KingHaraldsRevenge.class));
        cards.add(new SetCardInfo("King Narfi's Betrayal", 219, Rarity.RARE, mage.cards.k.KingNarfisBetrayal.class));
        cards.add(new SetCardInfo("Koll, the Forgemaster", 220, Rarity.UNCOMMON, mage.cards.k.KollTheForgemaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koll, the Forgemaster", 325, Rarity.UNCOMMON, mage.cards.k.KollTheForgemaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kolvori, God of Kinship", 181, Rarity.RARE, mage.cards.k.KolvoriGodOfKinship.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kolvori, God of Kinship", 318, Rarity.RARE, mage.cards.k.KolvoriGodOfKinship.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koma's Faithful", 102, Rarity.COMMON, mage.cards.k.KomasFaithful.class));
        cards.add(new SetCardInfo("Koma, Cosmos Serpent", 221, Rarity.MYTHIC, mage.cards.k.KomaCosmosSerpent.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koma, Cosmos Serpent", 326, Rarity.MYTHIC, mage.cards.k.KomaCosmosSerpent.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Littjara Glade-Warden", 182, Rarity.UNCOMMON, mage.cards.l.LittjaraGladeWarden.class));
        cards.add(new SetCardInfo("Littjara Kinseekers", 66, Rarity.COMMON, mage.cards.l.LittjaraKinseekers.class));
        cards.add(new SetCardInfo("Littjara Mirrorlake", 264, Rarity.UNCOMMON, mage.cards.l.LittjaraMirrorlake.class));
        cards.add(new SetCardInfo("Magda, Brazen Outlaw", 142, Rarity.RARE, mage.cards.m.MagdaBrazenOutlaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Magda, Brazen Outlaw", 312, Rarity.RARE, mage.cards.m.MagdaBrazenOutlaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Maja, Bretagard Protector", 222, Rarity.UNCOMMON, mage.cards.m.MajaBretagardProtector.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Maja, Bretagard Protector", 327, Rarity.UNCOMMON, mage.cards.m.MajaBretagardProtector.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mammoth Growth", 183, Rarity.COMMON, mage.cards.m.MammothGrowth.class));
        cards.add(new SetCardInfo("Masked Vandal", 184, Rarity.COMMON, mage.cards.m.MaskedVandal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Masked Vandal", 405, Rarity.COMMON, mage.cards.m.MaskedVandal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Maskwood Nexus", 240, Rarity.RARE, mage.cards.m.MaskwoodNexus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Maskwood Nexus", 369, Rarity.RARE, mage.cards.m.MaskwoodNexus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Master Skald", 19, Rarity.COMMON, mage.cards.m.MasterSkald.class));
        cards.add(new SetCardInfo("Mists of Littjara", 67, Rarity.COMMON, mage.cards.m.MistsOfLittjara.class));
        cards.add(new SetCardInfo("Mistwalker", 68, Rarity.COMMON, mage.cards.m.Mistwalker.class));
        cards.add(new SetCardInfo("Moritte of the Frost", 223, Rarity.UNCOMMON, mage.cards.m.MoritteOfTheFrost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Moritte of the Frost", 328, Rarity.UNCOMMON, mage.cards.m.MoritteOfTheFrost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 397, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mystic Reflection", 346, Rarity.RARE, mage.cards.m.MysticReflection.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mystic Reflection", 69, Rarity.RARE, mage.cards.m.MysticReflection.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Narfi, Betrayer King", 224, Rarity.UNCOMMON, mage.cards.n.NarfiBetrayerKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Narfi, Betrayer King", 329, Rarity.UNCOMMON, mage.cards.n.NarfiBetrayerKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Niko Aris", 225, Rarity.MYTHIC, mage.cards.n.NikoAris.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Niko Aris", 289, Rarity.MYTHIC, mage.cards.n.NikoAris.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Niko Defies Destiny", 226, Rarity.UNCOMMON, mage.cards.n.NikoDefiesDestiny.class));
        cards.add(new SetCardInfo("Old-Growth Troll", 185, Rarity.RARE, mage.cards.o.OldGrowthTroll.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Old-Growth Troll", 365, Rarity.RARE, mage.cards.o.OldGrowthTroll.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Open the Omenpaths", 143, Rarity.COMMON, mage.cards.o.OpenTheOmenpaths.class));
        cards.add(new SetCardInfo("Orvar, the All-Form", 305, Rarity.MYTHIC, mage.cards.o.OrvarTheAllForm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orvar, the All-Form", 70, Rarity.MYTHIC, mage.cards.o.OrvarTheAllForm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Path to the World Tree", 186, Rarity.UNCOMMON, mage.cards.p.PathToTheWorldTree.class));
        cards.add(new SetCardInfo("Pilfering Hawk", 71, Rarity.COMMON, mage.cards.p.PilferingHawk.class));
        cards.add(new SetCardInfo("Plains", 394, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poison the Cup", 103, Rarity.UNCOMMON, mage.cards.p.PoisonTheCup.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poison the Cup", 403, Rarity.UNCOMMON, mage.cards.p.PoisonTheCup.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Port of Karfell", 265, Rarity.UNCOMMON, mage.cards.p.PortOfKarfell.class));
        cards.add(new SetCardInfo("Priest of the Haunted Edge", 104, Rarity.COMMON, mage.cards.p.PriestOfTheHauntedEdge.class));
        cards.add(new SetCardInfo("Provoke the Trolls", 144, Rarity.UNCOMMON, mage.cards.p.ProvokeTheTrolls.class));
        cards.add(new SetCardInfo("Pyre of Heroes", 241, Rarity.RARE, mage.cards.p.PyreOfHeroes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pyre of Heroes", 370, Rarity.RARE, mage.cards.p.PyreOfHeroes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quakebringer", 145, Rarity.MYTHIC, mage.cards.q.Quakebringer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quakebringer", 297, Rarity.MYTHIC, mage.cards.q.Quakebringer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Raiders' Karve", 242, Rarity.COMMON, mage.cards.r.RaidersKarve.class));
        cards.add(new SetCardInfo("Raise the Draugr", 105, Rarity.COMMON, mage.cards.r.RaiseTheDraugr.class));
        cards.add(new SetCardInfo("Rally the Ranks", 20, Rarity.RARE, mage.cards.r.RallyTheRanks.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rally the Ranks", 336, Rarity.RARE, mage.cards.r.RallyTheRanks.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rampage of the Valkyries", 393, Rarity.UNCOMMON, mage.cards.r.RampageOfTheValkyries.class));
        cards.add(new SetCardInfo("Raven Wings", 243, Rarity.COMMON, mage.cards.r.RavenWings.class));
        cards.add(new SetCardInfo("Ravenform", 72, Rarity.COMMON, mage.cards.r.Ravenform.class));
        cards.add(new SetCardInfo("Ravenous Lindwurm", 187, Rarity.COMMON, mage.cards.r.RavenousLindwurm.class));
        cards.add(new SetCardInfo("Realmwalker", 188, Rarity.RARE, mage.cards.r.Realmwalker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Realmwalker", 366, Rarity.RARE, mage.cards.r.Realmwalker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Realmwalker", 399, Rarity.RARE, mage.cards.r.Realmwalker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reckless Crew", 146, Rarity.RARE, mage.cards.r.RecklessCrew.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reckless Crew", 359, Rarity.RARE, mage.cards.r.RecklessCrew.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reflections of Littjara", 347, Rarity.RARE, mage.cards.r.ReflectionsOfLittjara.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reflections of Littjara", 400, Rarity.RARE, mage.cards.r.ReflectionsOfLittjara.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reflections of Littjara", 73, Rarity.RARE, mage.cards.r.ReflectionsOfLittjara.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reidane, God of the Worthy", 21, Rarity.RARE, mage.cards.r.ReidaneGodOfTheWorthy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reidane, God of the Worthy", 300, Rarity.RARE, mage.cards.r.ReidaneGodOfTheWorthy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Renegade Reaper", 386, Rarity.UNCOMMON, mage.cards.r.RenegadeReaper.class));
        cards.add(new SetCardInfo("Replicating Ring", 244, Rarity.UNCOMMON, mage.cards.r.ReplicatingRing.class));
        cards.add(new SetCardInfo("Resplendent Marshal", 22, Rarity.MYTHIC, mage.cards.r.ResplendentMarshal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Resplendent Marshal", 337, Rarity.MYTHIC, mage.cards.r.ResplendentMarshal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Return Upon the Tide", 106, Rarity.UNCOMMON, mage.cards.r.ReturnUponTheTide.class));
        cards.add(new SetCardInfo("Revitalize", 23, Rarity.COMMON, mage.cards.r.Revitalize.class));
        cards.add(new SetCardInfo("Righteous Valkyrie", 24, Rarity.RARE, mage.cards.r.RighteousValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Righteous Valkyrie", 338, Rarity.RARE, mage.cards.r.RighteousValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rimewood Falls", 266, Rarity.COMMON, mage.cards.r.RimewoodFalls.class));
        cards.add(new SetCardInfo("Rise of the Dread Marn", 107, Rarity.RARE, mage.cards.r.RiseOfTheDreadMarn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rise of the Dread Marn", 354, Rarity.RARE, mage.cards.r.RiseOfTheDreadMarn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rootless Yew", 189, Rarity.UNCOMMON, mage.cards.r.RootlessYew.class));
        cards.add(new SetCardInfo("Roots of Wisdom", 190, Rarity.COMMON, mage.cards.r.RootsOfWisdom.class));
        cards.add(new SetCardInfo("Run Amok", 147, Rarity.COMMON, mage.cards.r.RunAmok.class));
        cards.add(new SetCardInfo("Run Ashore", 74, Rarity.COMMON, mage.cards.r.RunAshore.class));
        cards.add(new SetCardInfo("Rune of Flight", 75, Rarity.UNCOMMON, mage.cards.r.RuneOfFlight.class));
        cards.add(new SetCardInfo("Rune of Might", 191, Rarity.UNCOMMON, mage.cards.r.RuneOfMight.class));
        cards.add(new SetCardInfo("Rune of Mortality", 108, Rarity.UNCOMMON, mage.cards.r.RuneOfMortality.class));
        cards.add(new SetCardInfo("Rune of Speed", 148, Rarity.UNCOMMON, mage.cards.r.RuneOfSpeed.class));
        cards.add(new SetCardInfo("Rune of Sustenance", 25, Rarity.UNCOMMON, mage.cards.r.RuneOfSustenance.class));
        cards.add(new SetCardInfo("Runed Crown", 245, Rarity.UNCOMMON, mage.cards.r.RunedCrown.class));
        cards.add(new SetCardInfo("Runeforge Champion", 26, Rarity.RARE, mage.cards.r.RuneforgeChampion.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Runeforge Champion", 339, Rarity.RARE, mage.cards.r.RuneforgeChampion.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sarulf's Packmate", 192, Rarity.COMMON, mage.cards.s.SarulfsPackmate.class));
        cards.add(new SetCardInfo("Sarulf, Realm Eater", 228, Rarity.RARE, mage.cards.s.SarulfRealmEater.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sarulf, Realm Eater", 330, Rarity.RARE, mage.cards.s.SarulfRealmEater.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Saw It Coming", 76, Rarity.UNCOMMON, mage.cards.s.SawItComing.class));
        cards.add(new SetCardInfo("Scorn Effigy", 246, Rarity.COMMON, mage.cards.s.ScornEffigy.class));
        cards.add(new SetCardInfo("Sculptor of Winter", 193, Rarity.COMMON, mage.cards.s.SculptorOfWinter.class));
        cards.add(new SetCardInfo("Search for Glory", 27, Rarity.RARE, mage.cards.s.SearchForGlory.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Search for Glory", 340, Rarity.RARE, mage.cards.s.SearchForGlory.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Seize the Spoils", 149, Rarity.COMMON, mage.cards.s.SeizeTheSpoils.class));
        cards.add(new SetCardInfo("Shackles of Treachery", 150, Rarity.COMMON, mage.cards.s.ShacklesOfTreachery.class));
        cards.add(new SetCardInfo("Shepherd of the Cosmos", 28, Rarity.UNCOMMON, mage.cards.s.ShepherdOfTheCosmos.class));
        cards.add(new SetCardInfo("Shimmerdrift Vale", 267, Rarity.COMMON, mage.cards.s.ShimmerdriftVale.class));
        cards.add(new SetCardInfo("Showdown of the Skalds", 229, Rarity.RARE, mage.cards.s.ShowdownOfTheSkalds.class));
        cards.add(new SetCardInfo("Sigrid, God-Favored", 29, Rarity.RARE, mage.cards.s.SigridGodFavored.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sigrid, God-Favored", 301, Rarity.RARE, mage.cards.s.SigridGodFavored.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skemfar Avenger", 109, Rarity.RARE, mage.cards.s.SkemfarAvenger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skemfar Avenger", 355, Rarity.RARE, mage.cards.s.SkemfarAvenger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skemfar Elderhall", 268, Rarity.UNCOMMON, mage.cards.s.SkemfarElderhall.class));
        cards.add(new SetCardInfo("Skemfar Shadowsage", 110, Rarity.UNCOMMON, mage.cards.s.SkemfarShadowsage.class));
        cards.add(new SetCardInfo("Skull Raid", 111, Rarity.COMMON, mage.cards.s.SkullRaid.class));
        cards.add(new SetCardInfo("Smashing Success", 151, Rarity.COMMON, mage.cards.s.SmashingSuccess.class));
        cards.add(new SetCardInfo("Snakeskin Veil", 194, Rarity.COMMON, mage.cards.s.SnakeskinVeil.class));
        cards.add(new SetCardInfo("Snow-Covered Forest", 284, Rarity.LAND, mage.cards.s.SnowCoveredForest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Forest", 285, Rarity.LAND, mage.cards.s.SnowCoveredForest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Island", 278, Rarity.LAND, mage.cards.s.SnowCoveredIsland.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Island", 279, Rarity.LAND, mage.cards.s.SnowCoveredIsland.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Mountain", 282, Rarity.LAND, mage.cards.s.SnowCoveredMountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Mountain", 283, Rarity.LAND, mage.cards.s.SnowCoveredMountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Plains", 276, Rarity.LAND, mage.cards.s.SnowCoveredPlains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Plains", 277, Rarity.LAND, mage.cards.s.SnowCoveredPlains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Swamp", 280, Rarity.LAND, mage.cards.s.SnowCoveredSwamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Swamp", 281, Rarity.LAND, mage.cards.s.SnowCoveredSwamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snowfield Sinkhole", 269, Rarity.COMMON, mage.cards.s.SnowfieldSinkhole.class));
        cards.add(new SetCardInfo("Spectral Steel", 30, Rarity.UNCOMMON, mage.cards.s.SpectralSteel.class));
        cards.add(new SetCardInfo("Spirit of the Aldergard", 195, Rarity.UNCOMMON, mage.cards.s.SpiritOfTheAldergard.class));
        cards.add(new SetCardInfo("Squash", 152, Rarity.COMMON, mage.cards.s.Squash.class));
        cards.add(new SetCardInfo("Stalwart Valkyrie", 31, Rarity.COMMON, mage.cards.s.StalwartValkyrie.class));
        cards.add(new SetCardInfo("Starnheim Aspirant", 380, Rarity.UNCOMMON, mage.cards.s.StarnheimAspirant.class));
        cards.add(new SetCardInfo("Starnheim Courser", 32, Rarity.COMMON, mage.cards.s.StarnheimCourser.class));
        cards.add(new SetCardInfo("Starnheim Unleashed", 294, Rarity.MYTHIC, mage.cards.s.StarnheimUnleashed.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Starnheim Unleashed", 33, Rarity.MYTHIC, mage.cards.s.StarnheimUnleashed.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Story Seeker", 34, Rarity.COMMON, mage.cards.s.StorySeeker.class));
        cards.add(new SetCardInfo("Strategic Planning", 402, Rarity.COMMON, mage.cards.s.StrategicPlanning.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Strategic Planning", 77, Rarity.COMMON, mage.cards.s.StrategicPlanning.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Struggle for Skemfar", 196, Rarity.COMMON, mage.cards.s.StruggleForSkemfar.class));
        cards.add(new SetCardInfo("Sulfurous Mire", 270, Rarity.COMMON, mage.cards.s.SulfurousMire.class));
        cards.add(new SetCardInfo("Surtland Elementalist", 375, Rarity.RARE, mage.cards.s.SurtlandElementalist.class));
        cards.add(new SetCardInfo("Surtland Flinger", 377, Rarity.RARE, mage.cards.s.SurtlandFlinger.class));
        cards.add(new SetCardInfo("Surtland Frostpyre", 271, Rarity.UNCOMMON, mage.cards.s.SurtlandFrostpyre.class));
        cards.add(new SetCardInfo("Svella, Ice Shaper", 230, Rarity.UNCOMMON, mage.cards.s.SvellaIceShaper.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Svella, Ice Shaper", 331, Rarity.UNCOMMON, mage.cards.s.SvellaIceShaper.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 396, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tergrid's Shadow", 113, Rarity.UNCOMMON, mage.cards.t.TergridsShadow.class));
        cards.add(new SetCardInfo("Tergrid, God of Fright", 112, Rarity.RARE, mage.cards.t.TergridGodOfFright.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tergrid, God of Fright", 307, Rarity.RARE, mage.cards.t.TergridGodOfFright.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Bears of Littjara", 205, Rarity.RARE, mage.cards.t.TheBearsOfLittjara.class));
        cards.add(new SetCardInfo("The Bloodsky Massacre", 207, Rarity.RARE, mage.cards.t.TheBloodskyMassacre.class));
        cards.add(new SetCardInfo("The Raven's Warning", 227, Rarity.RARE, mage.cards.t.TheRavensWarning.class));
        cards.add(new SetCardInfo("The Three Seasons", 231, Rarity.UNCOMMON, mage.cards.t.TheThreeSeasons.class));
        cards.add(new SetCardInfo("The Trickster-God's Heist", 232, Rarity.UNCOMMON, mage.cards.t.TheTricksterGodsHeist.class));
        cards.add(new SetCardInfo("The World Tree", 275, Rarity.RARE, mage.cards.t.TheWorldTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The World Tree", 373, Rarity.RARE, mage.cards.t.TheWorldTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thornmantle Striker", 387, Rarity.UNCOMMON, mage.cards.t.ThornmantleStriker.class));
        cards.add(new SetCardInfo("Tibalt's Trickery", 153, Rarity.RARE, mage.cards.t.TibaltsTrickery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tibalt's Trickery", 360, Rarity.RARE, mage.cards.t.TibaltsTrickery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Toralf, God of Fury", 154, Rarity.MYTHIC, mage.cards.t.ToralfGodOfFury.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Toralf, God of Fury", 313, Rarity.MYTHIC, mage.cards.t.ToralfGodOfFury.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tormentor's Helm", 155, Rarity.COMMON, mage.cards.t.TormentorsHelm.class));
        cards.add(new SetCardInfo("Toski, Bearer of Secrets", 197, Rarity.RARE, mage.cards.t.ToskiBearerOfSecrets.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Toski, Bearer of Secrets", 319, Rarity.RARE, mage.cards.t.ToskiBearerOfSecrets.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tundra Fumarole", 156, Rarity.RARE, mage.cards.t.TundraFumarole.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tundra Fumarole", 361, Rarity.RARE, mage.cards.t.TundraFumarole.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tuskeri Firewalker", 157, Rarity.COMMON, mage.cards.t.TuskeriFirewalker.class));
        cards.add(new SetCardInfo("Tyrite Sanctum", 272, Rarity.RARE, mage.cards.t.TyriteSanctum.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyrite Sanctum", 372, Rarity.RARE, mage.cards.t.TyriteSanctum.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyvar Kell", 198, Rarity.MYTHIC, mage.cards.t.TyvarKell.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyvar Kell", 287, Rarity.MYTHIC, mage.cards.t.TyvarKell.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Undersea Invader", 78, Rarity.COMMON, mage.cards.u.UnderseaInvader.class));
        cards.add(new SetCardInfo("Usher of the Fallen", 35, Rarity.UNCOMMON, mage.cards.u.UsherOfTheFallen.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Usher of the Fallen", 401, Rarity.UNCOMMON, mage.cards.u.UsherOfTheFallen.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Valki, God of Lies", 114, Rarity.MYTHIC, mage.cards.v.ValkiGodOfLies.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Valki, God of Lies", 286, Rarity.MYTHIC, mage.cards.v.ValkiGodOfLies.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Valki, God of Lies", 308, Rarity.MYTHIC, mage.cards.v.ValkiGodOfLies.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Valkyrie Harbinger", 374, Rarity.RARE, mage.cards.v.ValkyrieHarbinger.class));
        cards.add(new SetCardInfo("Valkyrie's Sword", 36, Rarity.UNCOMMON, mage.cards.v.ValkyriesSword.class));
        cards.add(new SetCardInfo("Valor of the Worthy", 37, Rarity.COMMON, mage.cards.v.ValorOfTheWorthy.class));
        cards.add(new SetCardInfo("Varragoth, Bloodsky Sire", 115, Rarity.RARE, mage.cards.v.VarragothBloodskySire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Varragoth, Bloodsky Sire", 309, Rarity.RARE, mage.cards.v.VarragothBloodskySire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vault Robber", 158, Rarity.COMMON, mage.cards.v.VaultRobber.class));
        cards.add(new SetCardInfo("Vega, the Watcher", 233, Rarity.UNCOMMON, mage.cards.v.VegaTheWatcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vega, the Watcher", 332, Rarity.UNCOMMON, mage.cards.v.VegaTheWatcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vengeful Reaper", 116, Rarity.UNCOMMON, mage.cards.v.VengefulReaper.class));
        cards.add(new SetCardInfo("Village Rites", 117, Rarity.COMMON, mage.cards.v.VillageRites.class));
        cards.add(new SetCardInfo("Volatile Fjord", 273, Rarity.COMMON, mage.cards.v.VolatileFjord.class));
        cards.add(new SetCardInfo("Vorinclex, Monstrous Raider", 199, Rarity.MYTHIC, mage.cards.v.VorinclexMonstrousRaider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vorinclex, Monstrous Raider", 320, Rarity.MYTHIC, mage.cards.v.VorinclexMonstrousRaider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vorinclex, Monstrous Raider", 333, Rarity.MYTHIC, mage.cards.v.VorinclexMonstrousRaider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Waking the Trolls", 234, Rarity.RARE, mage.cards.w.WakingTheTrolls.class));
        cards.add(new SetCardInfo("Warchanter Skald", 381, Rarity.UNCOMMON, mage.cards.w.WarchanterSkald.class));
        cards.add(new SetCardInfo("Warhorn Blast", 38, Rarity.COMMON, mage.cards.w.WarhornBlast.class));
        cards.add(new SetCardInfo("Weathered Runestone", 247, Rarity.UNCOMMON, mage.cards.w.WeatheredRunestone.class));
        cards.add(new SetCardInfo("Weigh Down", 118, Rarity.COMMON, mage.cards.w.WeighDown.class));
        cards.add(new SetCardInfo("Wings of the Cosmos", 39, Rarity.COMMON, mage.cards.w.WingsOfTheCosmos.class));
        cards.add(new SetCardInfo("Withercrown", 119, Rarity.COMMON, mage.cards.w.Withercrown.class));
        cards.add(new SetCardInfo("Woodland Chasm", 274, Rarity.COMMON, mage.cards.w.WoodlandChasm.class));
        cards.add(new SetCardInfo("Youthful Valkyrie", 382, Rarity.UNCOMMON, mage.cards.y.YouthfulValkyrie.class));
    }

    @Override
    public List<CardInfo> getCardsByRarity(Rarity rarity) {
        if (savedCards.containsKey(rarity)) {
            return new ArrayList<>(savedCards.get(rarity));
        }
        CardCriteria criteria = new CardCriteria();
        criteria.setCodes(this.code);
        criteria.rarities(rarity);
        List<CardInfo> savedCardsInfos = CardRepository.instance.findCards(criteria);
        switch (rarity) {
            case LAND:
                savedCardsInfos.removeIf(cardInfo -> !cardInfo.getSupertypes().contains(SuperType.SNOW));
                savedCardsInfos.removeIf(cardInfo -> !cardInfo.getSupertypes().contains(SuperType.BASIC));
                break;
            case COMMON:
                savedCardsInfos.removeIf(cardInfo ->
                        cardInfo.getCard().isSnow()
                                && cardInfo.getCard().isLand()
                                && !cardInfo.getCard().getName().equals("Shimmerdrift Vale")
                );
                break;
        }
        savedCardsInfos.removeIf(next -> next.getCardNumberAsInt() > maxCardNumberInBooster);
        savedCards.put(rarity, savedCardsInfos);
        return new ArrayList<>(savedCardsInfos);
    }

    @Override
    public List<CardInfo> getSpecialLand() {
        if (savedSpecialLand.isEmpty()) {
            CardCriteria criteria = new CardCriteria();
            criteria.setCodes(this.code);
            criteria.types(CardType.LAND);
            savedSpecialLand.addAll(CardRepository.instance.findCards(criteria));
            savedSpecialLand.removeIf(cardInfo -> cardInfo.getSupertypes().contains(SuperType.BASIC));
            savedSpecialLand.removeIf(cardInfo -> !cardInfo.getSupertypes().contains(SuperType.SNOW));
            savedSpecialLand.removeIf(cardInfo -> cardInfo.getName().equals("Shimmerdrift Vale"));
            savedSpecialLand.removeIf(cardInfo -> cardInfo.getName().equals("Faceless Haven"));
            savedSpecialLand.removeIf(cardInfo -> cardInfo.getCardNumberAsInt() > maxCardNumberInBooster);
        }
        return new ArrayList<>(savedSpecialLand);
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/khm.html
class KaldheimCollator implements BoosterCollator {

    private static class KaldheimRun extends CardRun {
        private static final KaldheimRun commonA = new KaldheimRun(true, "Story Seeker", "Strategic Planning", "Fearless Pup", "Gods' Hall Guardian", "Undersea Invader", "Seize the Spoils", "Battlefield Raptor", "Berg Strider", "Craven Hulk", "Goldmaw Champion", "Mists of Littjara", "Hagi Mob", "Master Skald", "Disdainful Stroke", "Breakneck Berserker", "Warhorn Blast", "Brinebarrow Intruder", "Run Amok", "Wings of the Cosmos", "Draugr Thought-Thief", "Tuskeri Firewalker", "Axgard Braggart", "Depart the Realm", "Immersturm Raider", "Valor of the Worthy", "Littjara Kinseekers", "Cinderheart Giant", "Doomskar Oracle", "Pilfering Hawk", "Tormentor's Helm", "Beskir Shieldmate", "Karfell Harbinger", "Axgard Cavalry", "Gods' Hall Guardian", "Strategic Planning", "Fearless Pup", "Story Seeker", "Undersea Invader", "Craven Hulk", "Battlefield Raptor", "Berg Strider", "Seize the Spoils", "Goldmaw Champion", "Disdainful Stroke", "Breakneck Berserker", "Warhorn Blast", "Mists of Littjara", "Hagi Mob", "Master Skald", "Draugr Thought-Thief", "Run Amok", "Wings of the Cosmos", "Brinebarrow Intruder", "Tuskeri Firewalker", "Valor of the Worthy", "Depart the Realm", "Immersturm Raider", "Doomskar Oracle", "Karfell Harbinger", "Tormentor's Helm", "Axgard Braggart", "Pilfering Hawk", "Axgard Cavalry", "Beskir Shieldmate", "Littjara Kinseekers", "Cinderheart Giant");
        private static final KaldheimRun commonB = new KaldheimRun(true, "Koma's Faithful", "Icehide Troll", "Draugr Recruiter", "Mammoth Growth", "Elderfang Disciple", "Masked Vandal", "Priest of the Haunted Edge", "Jaspera Sentinel", "Village Rites", "Guardian Gladewalker", "Skull Raid", "Glittering Frost", "Grim Draugr", "Snakeskin Veil", "Demonic Gifts", "Icehide Troll", "Withercrown", "King Harald's Revenge", "Deathknell Berserker", "Broken Wings", "Dread Rider", "Gnottvold Recluse", "Draugr Recruiter", "Horizon Seeker", "Koma's Faithful", "Mammoth Growth", "Priest of the Haunted Edge", "Jaspera Sentinel", "Elderfang Disciple", "Guardian Gladewalker", "Village Rites", "Masked Vandal", "Skull Raid", "Glittering Frost", "Demonic Gifts", "Snakeskin Veil", "Withercrown", "Broken Wings", "Grim Draugr", "King Harald's Revenge", "Dread Rider", "Icehide Troll", "Deathknell Berserker", "Gnottvold Recluse", "Koma's Faithful", "Horizon Seeker", "Draugr Recruiter", "Jaspera Sentinel", "Priest of the Haunted Edge", "Guardian Gladewalker", "Elderfang Disciple", "Mammoth Growth", "Village Rites", "Glittering Frost", "Withercrown", "Masked Vandal", "Demonic Gifts", "Broken Wings", "Skull Raid", "Snakeskin Veil", "Dread Rider", "King Harald's Revenge", "Grim Draugr", "Gnottvold Recluse", "Deathknell Berserker", "Horizon Seeker");
        private static final KaldheimRun commonC1 = new KaldheimRun(true, "Ravenous Lindwurm", "Squash", "Raiders' Karve", "Behold the Multiverse", "Grizzled Outrider", "Revitalize", "Karfell Kennel-Master", "Scorn Effigy", "Bind the Monster", "Roots of Wisdom", "Starnheim Courser", "Smashing Success", "Infernal Pet", "Mistwalker", "Shimmerdrift Vale", "Stalwart Valkyrie", "Duskwielder", "Sarulf's Packmate", "Open the Omenpaths", "Frostpeak Yeti", "Jarl of the Forsaken", "Raven Wings", "Raise the Draugr", "Invoke the Divine", "Dwarven Reinforcements", "Annul", "Struggle for Skemfar", "Funeral Longboat", "Ravenous Lindwurm", "Behold the Multiverse", "Revitalize", "Raiders' Karve", "Squash", "Grizzled Outrider", "Bind the Monster", "Starnheim Courser", "Scorn Effigy", "Roots of Wisdom", "Smashing Success", "Karfell Kennel-Master", "Stalwart Valkyrie", "Mistwalker", "Infernal Pet", "Shimmerdrift Vale", "Duskwielder", "Dwarven Reinforcements", "Raise the Draugr", "Frostpeak Yeti", "Invoke the Divine", "Sarulf's Packmate", "Jarl of the Forsaken", "Open the Omenpaths", "Raven Wings", "Struggle for Skemfar", "Annul");
        private static final KaldheimRun commonC2 = new KaldheimRun(true, "Giant Ox", "Sculptor of Winter", "Feed the Serpent", "Vault Robber", "Iron Verdict", "Goldvein Pick", "Augury Raven", "Arachnoform", "Demon Bolt", "Codespell Cleric", "Weigh Down", "Dogged Pursuit", "Frost Bite", "Run Ashore", "Elderleaf Mentor", "Giant Ox", "Demon Bolt", "Sculptor of Winter", "Shackles of Treachery", "Ravenform", "Bound in Gold", "Feed the Serpent", "Arachnoform", "Run Ashore", "Vault Robber", "Iron Verdict", "Dogged Pursuit", "Goldvein Pick", "Weigh Down", "Frost Bite", "Augury Raven", "Codespell Cleric", "Funeral Longboat", "Sculptor of Winter", "Shackles of Treachery", "Elderleaf Mentor", "Bound in Gold", "Ravenform", "Vault Robber", "Feed the Serpent", "Giant Ox", "Augury Raven", "Arachnoform", "Goldvein Pick", "Demon Bolt", "Iron Verdict", "Dogged Pursuit", "Run Ashore", "Codespell Cleric", "Weigh Down", "Bound in Gold", "Shackles of Treachery", "Elderleaf Mentor", "Frost Bite", "Ravenform");
        private static final KaldheimRun uncommonA = new KaldheimRun(true, "Invasion of the Giants", "Colossal Plow", "Harald, King of Skemfar", "Fall of the Impostor", "Spirit of the Aldergard", "Narfi, Betrayer King", "Vega, the Watcher", "Clarion Spirit", "The Trickster-God's Heist", "Kaya's Onslaught", "Return Upon the Tide", "Skemfar Elderhall", "Firja, Judge of Valor", "Blizzard Brawl", "Divine Gambit", "Saw It Coming", "Basalt Ravager", "Draugr's Helm", "Littjara Glade-Warden", "Binding the Old Gods", "Ascent of the Worthy", "Icebind Pillar", "Skemfar Shadowsage", "Dual Strike", "Aegar, the Freezing Flame", "Koll, the Forgemaster", "Surtland Frostpyre", "Forging the Tyrite Sword", "Provoke the Trolls", "Poison the Cup", "Invasion of the Giants", "Colossal Plow", "Gnottvold Slumbermound", "Frost Augur", "Boreal Outrider", "Tergrid's Shadow", "Shepherd of the Cosmos", "Niko Defies Destiny", "Battershield Warrior", "Frostpyre Arcanist", "Immersturm Skullcairn", "Rune of Speed", "The Trickster-God's Heist", "Blizzard Brawl", "Narfi, Betrayer King", "Fall of the Impostor", "Spirit of the Aldergard", "Harald, King of Skemfar", "Skemfar Elderhall", "Kaya's Onslaught", "Return Upon the Tide", "Clarion Spirit", "Vega, the Watcher", "Divine Gambit", "Saw It Coming", "Basalt Ravager", "Firja, Judge of Valor", "Draugr's Helm", "Littjara Glade-Warden", "Binding the Old Gods", "Ascent of the Worthy", "Icebind Pillar", "Skemfar Shadowsage", "Dual Strike", "Aegar, the Freezing Flame", "Koll, the Forgemaster", "Surtland Frostpyre", "Forging the Tyrite Sword", "Provoke the Trolls", "Gnottvold Slumbermound", "Battershield Warrior", "Shepherd of the Cosmos", "Immersturm Skullcairn", "Tergrid's Shadow", "Niko Defies Destiny", "Poison the Cup", "Colossal Plow", "Boreal Outrider", "Frost Augur", "Invasion of the Giants", "Rune of Speed", "Frostpyre Arcanist", "Narfi, Betrayer King", "Spirit of the Aldergard", "Clarion Spirit", "The Trickster-God's Heist", "Vega, the Watcher", "Kaya's Onslaught", "Harald, King of Skemfar", "Blizzard Brawl", "Skemfar Elderhall", "Return Upon the Tide", "Fall of the Impostor", "Poison the Cup", "Firja, Judge of Valor", "Saw It Coming", "Basalt Ravager", "Draugr's Helm", "Littjara Glade-Warden", "Binding the Old Gods", "Ascent of the Worthy", "Icebind Pillar", "Skemfar Shadowsage", "Dual Strike", "Aegar, the Freezing Flame", "Koll, the Forgemaster", "Surtland Frostpyre", "Forging the Tyrite Sword", "Provoke the Trolls", "Divine Gambit", "Frostpyre Arcanist", "Shepherd of the Cosmos", "Gnottvold Slumbermound", "Tergrid's Shadow", "Frost Augur", "Rune of Speed", "Battershield Warrior", "Immersturm Skullcairn", "Niko Defies Destiny", "Boreal Outrider");
        private static final KaldheimRun uncommonB = new KaldheimRun(true, "Spectral Steel", "Elven Bow", "Rune of Flight", "Arni Slays the Troll", "Port of Karfell", "Maja, Bretagard Protector", "Avalanche Caller", "Fearless Liberator", "Gates of Istfell", "Rune of Might", "The Three Seasons", "Bloodline Pretender", "Valkyrie's Sword", "Axgard Armory", "Fynn, the Fangbearer", "Crush the Weak", "Rune of Sustenance", "Weathered Runestone", "Littjara Mirrorlake", "Usher of the Fallen", "Hailstorm Valkyrie", "Path to the World Tree", "Moritte of the Frost", "Giant's Amulet", "Glimpse the Cosmos", "Doomskar Titan", "Kardur, Doomscourge", "Bloodsky Berserker", "Replicating Ring", "Great Hall of Starnheim", "Kardur's Vicious Return", "Dwarven Hammer", "Inga Rune-Eyes", "Runed Crown", "Rune of Mortality", "Rootless Yew", "Svella, Ice Shaper", "Frenzied Raider", "Vengeful Reaper", "Bretagard Stronghold", "Spectral Steel", "Elven Bow", "Rune of Flight", "Arni Slays the Troll", "Port of Karfell", "Maja, Bretagard Protector", "Avalanche Caller", "Crush the Weak", "Gates of Istfell", "Weathered Runestone", "Bloodline Pretender", "Valkyrie's Sword", "Rune of Might", "Rune of Sustenance", "Fynn, the Fangbearer", "Axgard Armory", "Fearless Liberator", "The Three Seasons", "Path to the World Tree", "Usher of the Fallen", "Glimpse the Cosmos", "Kardur, Doomscourge", "Hailstorm Valkyrie", "Doomskar Titan", "Giant's Amulet", "Littjara Mirrorlake", "Replicating Ring", "Bloodsky Berserker", "Moritte of the Frost", "Great Hall of Starnheim", "Dwarven Hammer", "Kardur's Vicious Return", "Inga Rune-Eyes", "Runed Crown", "Rune of Mortality", "Rootless Yew", "Svella, Ice Shaper", "Frenzied Raider", "Vengeful Reaper", "Bretagard Stronghold", "Spectral Steel", "Elven Bow", "Rune of Flight", "Arni Slays the Troll", "Port of Karfell", "Maja, Bretagard Protector", "Avalanche Caller", "Gates of Istfell", "Rune of Might", "Bloodline Pretender", "Fynn, the Fangbearer", "Fearless Liberator", "Valkyrie's Sword", "Crush the Weak", "Rune of Sustenance", "Weathered Runestone", "Axgard Armory", "The Three Seasons", "Usher of the Fallen", "Moritte of the Frost", "Glimpse the Cosmos", "Doomskar Titan", "Hailstorm Valkyrie", "Littjara Mirrorlake", "Kardur, Doomscourge", "Path to the World Tree", "Giant's Amulet", "Replicating Ring", "Bloodsky Berserker", "Great Hall of Starnheim", "Kardur's Vicious Return", "Dwarven Hammer", "Inga Rune-Eyes", "Runed Crown", "Rune of Mortality", "Rootless Yew", "Svella, Ice Shaper", "Frenzied Raider", "Vengeful Reaper", "Bretagard Stronghold");
        private static final KaldheimRun rare = new KaldheimRun(false, "Arni Brokenbrow", "Ascendant Spirit", "Barkchannel Pathway", "Battle for Bretagard", "Battle of Frost and Fire", "Birgi, God of Storytelling", "Blessing of Frost", "Blightstep Pathway", "Blood on the Snow", "Calamity Bearer", "Cosima, God of the Voyage", "Cosmos Charger", "Cosmos Elixir", "Crippling Fear", "Cyclone Summoner", "Darkbore Pathway", "Doomskar", "Dragonkin Berserker", "Draugr Necromancer", "Dream Devourer", "Egon, God of Death", "Elvish Warmaster", "Esika's Chariot", "Faceless Haven", "Firja's Retribution", "Glorious Protector", "Graven Lore", "Harald Unites the Elves", "Hengegate Pathway", "Icebreaker Kraken", "Immersturm Predator", "In Search of Greatness", "Jorn, God of Winter", "King Narfi's Betrayal", "Kolvori, God of Kinship", "Magda, Brazen Outlaw", "Maskwood Nexus", "Mystic Reflection", "Old-Growth Troll", "Pyre of Heroes", "Rally the Ranks", "Realmwalker", "Reckless Crew", "Reflections of Littjara", "Reidane, God of the Worthy", "Righteous Valkyrie", "Rise of the Dread Marn", "Runeforge Champion", "Sarulf, Realm Eater", "Search for Glory", "Showdown of the Skalds", "Sigrid, God-Favored", "Skemfar Avenger", "Tergrid, God of Fright", "The Bears of Littjara", "The Bloodsky Massacre", "The Raven's Warning", "The World Tree", "Tibalt's Trickery", "Toski, Bearer of Secrets", "Tundra Fumarole", "Tyrite Sanctum", "Varragoth, Bloodsky Sire", "Waking the Trolls");
        private static final KaldheimRun mythic = new KaldheimRun(false, "Alrund, God of the Cosmos", "Alrund's Epiphany", "Battle Mammoth", "Burning-Rune Demon", "Eradicator Valkyrie", "Esika, God of the Tree", "Goldspan Dragon", "Halvar, God of Battle", "Haunting Voyage", "Kaya the Inexorable", "Koma, Cosmos Serpent", "Niko Aris", "Orvar, the All-Form", "Quakebringer", "Resplendent Marshal", "Starnheim Unleashed", "Toralf, God of Fury", "Tyvar Kell", "Valki, God of Lies", "Vorinclex, Monstrous Raider");
        private static final KaldheimRun land = new KaldheimRun(true, "Sulfurous Mire", "Snow-Covered Mountain", "Alpine Meadow", "Snow-Covered Plains", "Snow-Covered Plains", "Snow-Covered Swamp", "Snow-Covered Island", "Rimewood Falls", "Sulfurous Mire", "Snow-Covered Mountain", "Snow-Covered Mountain", "Snow-Covered Forest", "Woodland Chasm", "Snow-Covered Plains", "Snow-Covered Swamp", "Snow-Covered Island", "Ice Tunnel", "Snow-Covered Forest", "Snow-Covered Mountain", "Alpine Meadow", "Snow-Covered Mountain", "Snow-Covered Plains", "Snowfield Sinkhole", "Snow-Covered Plains", "Snow-Covered Swamp", "Snow-Covered Forest", "Snow-Covered Swamp", "Arctic Treeline", "Glacial Floodplain", "Snow-Covered Forest", "Snow-Covered Plains", "Arctic Treeline", "Snow-Covered Swamp", "Snow-Covered Forest", "Snow-Covered Mountain", "Rimewood Falls", "Glacial Floodplain", "Snow-Covered Swamp", "Snowfield Sinkhole", "Snow-Covered Swamp", "Highland Forest", "Snow-Covered Plains", "Snow-Covered Plains", "Snow-Covered Mountain", "Arctic Treeline", "Snow-Covered Island", "Snow-Covered Forest", "Alpine Meadow", "Snow-Covered Plains", "Snow-Covered Forest", "Snow-Covered Island", "Highland Forest", "Snowfield Sinkhole", "Glacial Floodplain", "Arctic Treeline", "Alpine Meadow", "Snow-Covered Mountain", "Sulfurous Mire", "Snow-Covered Forest", "Snow-Covered Plains", "Snow-Covered Mountain", "Snow-Covered Forest", "Sulfurous Mire", "Snow-Covered Island", "Alpine Meadow", "Snow-Covered Island", "Snowfield Sinkhole", "Snow-Covered Swamp", "Woodland Chasm", "Snow-Covered Swamp", "Snow-Covered Island", "Glacial Floodplain", "Snow-Covered Swamp", "Snow-Covered Forest", "Snow-Covered Plains", "Glacial Floodplain", "Woodland Chasm", "Volatile Fjord", "Snow-Covered Island", "Snow-Covered Plains", "Ice Tunnel", "Rimewood Falls", "Snow-Covered Forest", "Snow-Covered Swamp", "Volatile Fjord", "Snow-Covered Mountain", "Snow-Covered Island", "Ice Tunnel", "Snow-Covered Swamp", "Snow-Covered Island", "Woodland Chasm", "Ice Tunnel", "Snow-Covered Mountain", "Snow-Covered Mountain", "Snow-Covered Island", "Ice Tunnel", "Snow-Covered Island", "Highland Forest", "Snow-Covered Forest", "Volatile Fjord", "Rimewood Falls", "Snow-Covered Mountain", "Highland Forest", "Snow-Covered Swamp", "Snow-Covered Forest", "Rimewood Falls", "Snow-Covered Island", "Sulfurous Mire", "Snow-Covered Forest", "Snow-Covered Mountain", "Snow-Covered Swamp", "Snow-Covered Plains", "Snow-Covered Plains", "Volatile Fjord", "Snow-Covered Island", "Snowfield Sinkhole", "Volatile Fjord", "Arctic Treeline", "Highland Forest", "Woodland Chasm");

        private KaldheimRun(boolean keepOrder, String... names) {
            super(keepOrder, names);
        }
    }

    private static class KaldheimStructure extends BoosterStructure {
        private static final KaldheimStructure C1 = new KaldheimStructure(
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1
        );
        private static final KaldheimStructure C2 = new KaldheimStructure(
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1,
                KaldheimRun.commonC1
        );
        private static final KaldheimStructure C3 = new KaldheimStructure(
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2
        );
        private static final KaldheimStructure C4 = new KaldheimStructure(
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2
        );
        private static final KaldheimStructure C5 = new KaldheimStructure(
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonA,
                KaldheimRun.commonB,
                KaldheimRun.commonB,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2,
                KaldheimRun.commonC2
        );
        private static final KaldheimStructure U1 = new KaldheimStructure(
                KaldheimRun.uncommonA,
                KaldheimRun.uncommonA,
                KaldheimRun.uncommonA
        );
        private static final KaldheimStructure U2 = new KaldheimStructure(
                KaldheimRun.uncommonB,
                KaldheimRun.uncommonB,
                KaldheimRun.uncommonB
        );
        private static final KaldheimStructure R1 = new KaldheimStructure(
                KaldheimRun.rare
        );
        private static final KaldheimStructure M1 = new KaldheimStructure(
                KaldheimRun.mythic
        );
        private static final KaldheimStructure L1 = new KaldheimStructure(
                KaldheimRun.land
        );

        private KaldheimStructure(CardRun... runs) {
            super(runs);
        }
    }

    private final RarityConfiguration commonRuns = new RarityConfiguration(
            false,
            KaldheimStructure.C1,
            KaldheimStructure.C2,
            KaldheimStructure.C3,
            KaldheimStructure.C4,
            KaldheimStructure.C5,
            KaldheimStructure.C1,
            KaldheimStructure.C2,
            KaldheimStructure.C3,
            KaldheimStructure.C4,
            KaldheimStructure.C5,
            KaldheimStructure.C4,
            KaldheimStructure.C5
    );
    private final RarityConfiguration uncommonRuns = new RarityConfiguration(
            KaldheimStructure.U1,
            KaldheimStructure.U2
    );
    private final RarityConfiguration rareRuns = new RarityConfiguration(
            false,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.R1,
            KaldheimStructure.M1
    );
    private final RarityConfiguration landRuns = new RarityConfiguration(
            KaldheimStructure.L1
    );


    @Override
    public void shuffle() {
        commonRuns.shuffle();
        uncommonRuns.shuffle();
        rareRuns.shuffle();
        landRuns.shuffle();
    }

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRuns.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        booster.addAll(landRuns.getNext().makeRun());
        return booster;
    }
}
