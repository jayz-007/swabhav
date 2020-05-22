package com.teclabs.model.StrategyDesignPrinciple;

public class Animal {
	private String name;
	private double height;
	private double weight;
	private String favFood;

	public IFlys flyingType;

	public Animal(String name, double height, double weight, String favFood) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.favFood = favFood;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public String tryToFly() {
		return flyingType.fly();
	}

	public void setFlyingAbility(IFlys flyingType) {
		this.flyingType = flyingType;
	}

}