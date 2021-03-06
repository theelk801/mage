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
package mage.cards.l;

import java.util.List;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.Abilities;
import mage.abilities.AbilitiesImpl;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.LevelUpAbility;
import mage.abilities.keyword.LevelerCardBuilder;
import mage.cards.CardSetInfo;
import mage.cards.LevelerCard;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Outcome;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;

/**
 *
 * @author North
 */
public class LordOfShatterskullPass extends LevelerCard {

    public LordOfShatterskullPass(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{R}");
        this.subtype.add(SubType.MINOTAUR);
        this.subtype.add(SubType.SHAMAN);

        this.color.setRed(true);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Level up {1}{R}
        this.addAbility(new LevelUpAbility(new ManaCostsImpl("{1}{R}")));
        // LEVEL 1-5
        // 6/6
        Abilities<Ability> abilities1 = new AbilitiesImpl<>();
        // LEVEL 6+
        // 6/6
        // Whenever Lord of Shatterskull Pass attacks, it deals 6 damage to each creature defending player controls.
        Abilities<Ability> abilities2 = new AbilitiesImpl<>();
        abilities2.add(new AttacksTriggeredAbility(new LordOfShatterskullPassEffect(), false));

        this.addAbilities(LevelerCardBuilder.construct(
                new LevelerCardBuilder.LevelAbility(1, 5, abilities1, 6, 6),
                new LevelerCardBuilder.LevelAbility(6, -1, abilities2, 6, 6)));
        setMaxLevelCounters(6);
    }

    public LordOfShatterskullPass(final LordOfShatterskullPass card) {
        super(card);
    }

    @Override
    public LordOfShatterskullPass copy() {
        return new LordOfShatterskullPass(this);
    }
}

class LordOfShatterskullPassEffect extends OneShotEffect {

    public LordOfShatterskullPassEffect() {
        super(Outcome.Damage);
        this.staticText = "it deals 6 damage to each creature defending player controls";
    }

    public LordOfShatterskullPassEffect(final LordOfShatterskullPassEffect effect) {
        super(effect);
    }

    @Override
    public LordOfShatterskullPassEffect copy() {
        return new LordOfShatterskullPassEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        UUID defenderId = game.getCombat().getDefenderId(source.getSourceId());
        if (defenderId != null) {
            FilterCreaturePermanent filter = new FilterCreaturePermanent();
            filter.add(new ControllerIdPredicate(defenderId));
            List<Permanent> permanents = game.getBattlefield().getActivePermanents(filter, source.getControllerId(), source.getSourceId(), game);
            for (Permanent permanent : permanents) {
                permanent.damage(6, source.getSourceId(), game, false, true);
            }
            return true;
        }
        return false;
    }
}
