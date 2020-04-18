package net.demilich.metastone.game.entities.heroes;

import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Actor;
import com.hiddenswitch.spellsource.client.models.EntityType;
import net.demilich.metastone.game.entities.EntityZone;
import net.demilich.metastone.game.entities.weapons.Weapon;
import net.demilich.metastone.game.cards.Attribute;
import net.demilich.metastone.game.targeting.Zones;

import java.lang.ref.WeakReference;

public final class Hero extends Actor {
	private static final Zones[] HERO_ZONE = new Zones[]{Zones.HERO};
	private String heroClass;

	public Hero(Card heroCard) {
		super();
		setSourceCard(heroCard);
		setName(heroCard.getName());
		setHeroClass(heroCard.getHeroClass());
	}

	@Override
	public Hero clone() {
		return (Hero) super.clone();
	}

	public int getEffectiveHp() {
		return getHp() + getArmor();
	}

	@Override
	public EntityType getEntityType() {
		return EntityType.HERO;
	}

	@Override
	public Zones[] getDefaultActiveTriggerZones() {
		return HERO_ZONE;
	}

	/**
	 * Changes the amount of armor the hero has.
	 *
	 * @param armor The requested change in armor.
	 * @return The amount the armor changed. If damage is being dealt, then the armor will change {@code -Infinity < armor
	 * <= 0} if it is possible.
	 */
	public int modifyArmor(final int armor) {
		// armor cannot fall below zero
		final int originalArmor = getArmor();
		int newArmor = Math.max(originalArmor + armor, 0);
		setAttribute(Attribute.ARMOR, newArmor);
		int armorChange = newArmor - originalArmor;
		return armorChange;
	}

	public void setHeroClass(String heroClass) {
		this.heroClass = heroClass;
	}

	public String getHeroClass() {
		return heroClass;
	}
}
