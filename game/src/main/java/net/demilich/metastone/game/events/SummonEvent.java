package net.demilich.metastone.game.events;

import com.hiddenswitch.spellsource.client.models.GameEvent.EventTypeEnum;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.actions.OpenerAction;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Actor;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.HasCard;
import org.jetbrains.annotations.NotNull;

public class SummonEvent extends GameEvent implements HasCard {

	private final boolean resolvedBattlecry;
	private final OpenerAction[] openerActions;
	private final Actor minion;
	private final Entity source;

	public SummonEvent(@NotNull GameContext context, @NotNull Actor minion, @NotNull Entity source, boolean resolvedBattlecry, OpenerAction... openerActions) {
		super(context, minion.getOwner(), source.getOwner());
		this.minion = minion;
		this.source = source;
		this.resolvedBattlecry = resolvedBattlecry;
		this.openerActions = openerActions;
	}

	@Override
	@NotNull
	public Entity getEventTarget() {
		return getMinion();
	}

	@Override
	@NotNull
	public Entity getEventSource() {
		return getSource();
	}

	@Override
	public EventTypeEnum getEventType() {
		return EventTypeEnum.SUMMON;
	}

	@NotNull
	public Actor getMinion() {
		return minion;
	}

	@NotNull
	public Entity getSource() {
		return source;
	}

	@Override
	@NotNull
	public Card getSourceCard() {
		return source.getSourceCard();
	}

	public boolean isResolvedBattlecry() {
		return resolvedBattlecry;
	}

	public OpenerAction[] getOpenerActions() {
		return openerActions;
	}
}
