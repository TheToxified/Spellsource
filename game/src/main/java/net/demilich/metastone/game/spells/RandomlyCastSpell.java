package net.demilich.metastone.game.spells;

import java.util.Arrays;
import java.util.Map;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.EntityReference;

public class RandomlyCastSpell extends Spell {

	public static SpellDesc create(EntityReference target, SpellDesc... spells) {
		Map<SpellArg, Object> arguments = new SpellDesc(RandomlyCastSpell.class);
		arguments.put(SpellArg.SPELLS, spells);
		arguments.put(SpellArg.TARGET, target);
		return new SpellDesc(arguments);
	}

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		SpellDesc[] spells = (SpellDesc[]) desc.get(SpellArg.SPELLS);
		SpellUtils.castChildSpell(context, player, context.getLogic().getRandom(Arrays.asList(spells)), source, target);
	}

}