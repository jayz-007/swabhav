package com.techlabs.factory;

public class TeslaFactory implements IAutoFactory {
	private static TeslaFactory factory;

	@Override
	public IAutomobile make() {
		return new Tesla();
	}

	public static TeslaFactory getInstance() {
		if (factory == null)
			return new TeslaFactory();
		return factory;

	}
}
