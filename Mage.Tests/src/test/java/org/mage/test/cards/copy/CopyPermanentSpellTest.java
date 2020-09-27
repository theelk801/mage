package org.mage.test.cards.copy;

import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.CopyTargetSpellEffect;
import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.filter.Filter;
import mage.filter.StaticFilters;
import org.junit.Ignore;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 * @author TheElk801
 */
public class CopyPermanentSpellTest extends CardTestPlayerBase {

    private void makeTester() {
        addCustomCardWithAbility(
                "Forker", playerA,
                new SpellCastControllerTriggeredAbility(
                        new CopyTargetSpellEffect(true),
                        StaticFilters.FILTER_SPELL, false, true
                )
        );
    }

    @Test
    public void testSimpleToken() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 2);
        addCard(Zone.HAND, playerA, "Grizzly Bears");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Grizzly Bears");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Grizzly Bears", 2);
    }

    @Test
    public void testAuraToken() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Grizzly Bears");
        addCard(Zone.HAND, playerA, "Holy Strength");

        setChoice(playerA, "No");
        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Holy Strength", "Grizzly Bears");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Grizzly Bears", 1);
        assertPermanentCount(playerA, "Holy Strength", 2);
    }

    @Test
    public void testAuraTokenRedirect() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Centaur Courser");
        addCard(Zone.BATTLEFIELD, playerA, "Hill Giant");
        addCard(Zone.HAND, playerA, "Dead Weight");

        setChoice(playerA, "Yes");
        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Dead Weight", "Centaur Courser");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Centaur Courser", 1);
        assertPowerToughness(playerA, "Centaur Courser", 1, 1);
        assertPermanentCount(playerA, "Hill Giant", 1);
        assertPowerToughness(playerA, "Hill Giant", 1, 1);
        assertPermanentCount(playerA, "Dead Weight", 2);
    }

    @Ignore // currently fails
    @Test
    public void testKickerTrigger() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Grizzly Bears");
        addCard(Zone.HAND, playerA, "Goblin Bushwhacker");

        setChoice(playerA, "Yes");
        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Goblin Bushwhacker");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Goblin Bushwhacker", 2);
        assertPowerToughness(playerA, "Grizzly Bears", 4, 2);
    }

    @Ignore // currently fails
    @Test
    public void testKickerReplacement() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Island", 5);
        addCard(Zone.HAND, playerA, "Aether Figment");

        setChoice(playerA, "Yes");
        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Aether Figment");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Aether Figment", 2);
        assertPowerToughness(playerA, "Aether Figment", 3, 3, Filter.ComparisonScope.All);
    }

    @Ignore // currently fails
    @Test
    public void testSurgeTrigger() {
        makeTester();
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 3);
        addCard(Zone.HAND, playerA, "Memnite");
        addCard(Zone.HAND, playerA, "Reckless Bushwhacker");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Memnite");
        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Reckless Bushwhacker with surge");

        setStopAt(1, PhaseStep.END_TURN);
        execute();
        assertAllCommandsUsed();

        assertPermanentCount(playerA, "Reckless Bushwhacker", 2);
        assertPowerToughness(playerA, "Memnite", 3, 1, Filter.ComparisonScope.All);
    }
}
