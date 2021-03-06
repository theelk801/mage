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
package mage.cards.p;

import java.util.UUID;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CopyTargetSpellEffect;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.filter.common.FilterInstantOrSorcerySpell;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.stack.Spell;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author LevelX2
 */
public class PyromancersGoggles extends CardImpl {

    public PyromancersGoggles(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{5}");
        addSuperType(SuperType.LEGENDARY);

        // {T}: Add {R}.
        Ability ability = new RedManaAbility();
        this.addAbility(ability);

        // When that mana is used to cast a red instant or sorcery spell, copy that spell and you may choose new targets for the copy.
        Effect effect = new CopyTargetSpellEffect(true);
        effect.setText("copy that spell and you may choose new targets for the copy");
        this.addAbility(new PyromancersGogglesTriggeredAbility(ability.getOriginalId(), effect));

    }

    public PyromancersGoggles(final PyromancersGoggles card) {
        super(card);
    }

    @Override
    public PyromancersGoggles copy() {
        return new PyromancersGoggles(this);
    }
}

class PyromancersGogglesTriggeredAbility extends TriggeredAbilityImpl {

    private final static FilterInstantOrSorcerySpell filter = new FilterInstantOrSorcerySpell();

    static {
        filter.add(new ColorPredicate(ObjectColor.RED));
    }

    String abilityOriginalId;

    public PyromancersGogglesTriggeredAbility(UUID abilityOriginalId, Effect effect) {
        super(Zone.ALL, effect, false);
        this.abilityOriginalId = abilityOriginalId.toString();
    }

    public PyromancersGogglesTriggeredAbility(final PyromancersGogglesTriggeredAbility ability) {
        super(ability);
        this.abilityOriginalId = ability.abilityOriginalId;
    }

    @Override
    public PyromancersGogglesTriggeredAbility copy() {
        return new PyromancersGogglesTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.MANA_PAID;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (event.getData().equals(abilityOriginalId)) {
            Spell spell = game.getStack().getSpell(event.getTargetId());
            if (spell != null && filter.match(spell, getSourceId(), getControllerId(), game)) {
                for (Effect effect : getEffects()) {
                    effect.setTargetPointer(new FixedTarget(event.getTargetId()));
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String getRule() {
        return "When that mana is used to cast a red instant or sorcery spell, " + super.getRule();
    }
}
