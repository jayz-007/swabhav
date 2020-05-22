package com.techlabs.model.LiskovSubsittuionPrinciple;

public class Cat extends Animal {
	@Override
	public void doVoice() {
		System.out.println("Cat Meows");
		
	}

}
