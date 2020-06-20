package com.techlabs.client;

import com.techlabs.model.AutoType;
import com.techlabs.model.AutomobileFactory;
import com.techlabs.model.IAuto;

public class Test {
	public static void main(String args[]) {
		AutomobileFactory factory = AutomobileFactory.FACTORY;
		IAuto audi= factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();
		System.out.println(audi.getClass());
		
	}

}
