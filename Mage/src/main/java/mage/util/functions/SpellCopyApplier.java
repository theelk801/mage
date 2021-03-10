package mage.util.functions;

import mage.game.Game;
import mage.game.stack.Spell;

import java.io.Serializable;

/**
 * @author TheElk801
 */
public interface SpellCopyApplier extends Serializable {

    void modifySpell(Spell spell, Game game);

    void changeTargets(Spell spell, Game game);
}
