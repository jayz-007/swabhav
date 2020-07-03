package com.techlabs.factory;

public class BMWFactory implements IAutoFactory {
	private static BMWFactory factory;

	@Override
	public IAutomobile make() {
		return new BMW();
	}

	public static BMWFactory getInstance() {
		if (factory == null)
			return new BMWFactory();
		return factory;

	}

}
