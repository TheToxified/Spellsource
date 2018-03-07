package net.demilich.metastone.game.spells.desc.valueprovider;

import net.demilich.metastone.game.cards.desc.Desc;
import net.demilich.metastone.game.targeting.EntityReference;

import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.Map;

public class ValueProviderDesc extends Desc<ValueProviderArg, ValueProvider> {

	public static Map<ValueProviderArg, Object> build(Class<? extends ValueProvider> providerClass) {
		final Map<ValueProviderArg, Object> arguments = new EnumMap<>(ValueProviderArg.class);
		arguments.put(ValueProviderArg.CLASS, providerClass);
		return arguments;
	}

	public ValueProviderDesc(Map<ValueProviderArg, Object> arguments) {
		super(arguments);
	}

	public ValueProviderDesc(Class<? extends ValueProvider> vpClass) {
		super(vpClass);
	}

	@Override
	protected Class<? extends Desc> getDescImplClass() {
		return ValueProviderDesc.class;
	}

	@Override
	public ValueProviderArg getClassArg() {
		return ValueProviderArg.CLASS;
	}

	@Override
	public ValueProviderDesc clone() {
		return (ValueProviderDesc)copyTo(new ValueProviderDesc(getDescClass()));
	}

	public EntityReference getSource() {
		return (EntityReference) get(ValueProviderArg.TARGET);
	}
}
