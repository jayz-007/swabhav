package com.techlabs.model.StrategyDesignPrinciple.test;

import com.techlabs.model.StrategyDesignPrinciple.Animal;
import com.techlabs.model.StrategyDesignPrinciple.Bird;
import com.techlabs.model.StrategyDesignPrinciple.Dog;

public class Test {

	public static void main(String[] args) {

		Animal Tucker = new Dog("Oscar", 3.2, 42, "Chicken");
		Animal Tim = new Bird("Jill", 2, 10, "Peanuts");

		System.out.println("Dog: " + Tucker.tryToFly());

		System.out.println("Bird: " + Tim.tryToFly());

	}

}