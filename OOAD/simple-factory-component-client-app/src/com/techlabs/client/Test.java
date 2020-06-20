package com.techlabs.client;

import com.techlabs.model.AutoType;
import com.techlabs.model.AutomobileFactory;
import com.techlabs.model.IAuto;

public class Test {
	public static void main(String args[]) {
		AutomobileFactory autoMobileFactory = new AutomobileFactory();
		IAuto bmw = autoMobileFactory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();
		
		
		
	}

}