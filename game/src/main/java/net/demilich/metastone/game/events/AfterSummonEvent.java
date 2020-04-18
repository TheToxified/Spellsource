package net.demilich.metastone.game.events;

import com.hiddenswitch.spellsource.client.models.GameEvent;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.actions.OpenerAction;
import net.demilich.metastone.game.entities.Actor;
import net.demilich.metastone.game.entities.Entity;
import org.jetbrains.annotations.NotNull;

public final class AfterSummonEvent extends SummonEvent {

	public AfterSummonEvent(@NotNull GameContext context, @NotNull Actor minion, @NotNull Entity source, boolean didResolveBattlecry, OpenerAction... openerActions) {
		super(context, minion, source, didResolveBattlecry, openerActions);
	}

	@Override
	public GameEvent.EventTypeEnum getEventType() {
		return com.hiddenswitch.spellsource.client.models.GameEvent.EventTypeEnum.AFTER_SUMMON;
	}
}
