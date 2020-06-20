package com.techlabs.model;

public enum AutomobileFactory {
	FACTORY;
	
	public IAuto make(AutoType type) {
		if(type == AutoType.AUDI)
			return new Audi();
		if(type == AutoType.BMW)
			return new BMW();
		if(type == AutoType.TESLA)
		   return new TESLA();
		return null;
		
		
		
	}

}
