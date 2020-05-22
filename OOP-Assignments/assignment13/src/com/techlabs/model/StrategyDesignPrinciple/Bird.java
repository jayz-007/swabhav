package com.techlabs.model.StrategyDesignPrinciple;

public class Bird extends Animal {

	public Bird(String name, double height, double weight, String favFood) {

		super(name, height, weight, favFood);
		flyingType = new CanFly();

	}

}