package com.techlabs.factory.test;

import com.techlabs.factory.AudiFactory;
import com.techlabs.factory.BMWFactory;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;
import com.techlabs.factory.TeslaFactory;

public class Test {
	public static void main (String args []) {
		IAutoFactory factory = TeslaFactory.getInstance();
		IAutoFactory factory1 = BMWFactory.getInstance();
		IAutoFactory factor2y = AudiFactory.getInstance();
		System.out.println(factory.getClass());
		System.out.println(factory1.getClass());
		System.out.println(factor2y.getClass());
		
		IAutomobile automobile = factory.make();
		automobile.start();
		automobile.stop();
	}

}
