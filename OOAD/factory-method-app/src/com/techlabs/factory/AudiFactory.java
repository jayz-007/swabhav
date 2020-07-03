package com.techlabs.factory;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory factory;
	
	
	public static AudiFactory getInstance() {
		if (factory == null)
			return new AudiFactory();
		return factory;

	}


	@Override
	public IAutomobile make() {
		return new Audi();
	}


}
