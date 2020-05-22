package com.techlabs.model.LiskovSubsittuionPrinciple.test;

import com.techlabs.model.LiskovSubsittuionPrinciple.Animal;
import com.techlabs.model.LiskovSubsittuionPrinciple.Cat;
import com.techlabs.model.LiskovSubsittuionPrinciple.Tiger;

public class Test {
	public static void main (String args []) {
		Animal tiger = new Tiger();
		tiger.doVoice();
		
		Animal cat = new Cat();
		cat.doVoice();
		
		
	}

}
