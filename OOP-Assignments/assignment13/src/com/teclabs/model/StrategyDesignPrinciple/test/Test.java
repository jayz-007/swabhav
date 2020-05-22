package com.teclabs.model.StrategyDesignPrinciple.test;

import com.teclabs.model.StrategyDesignPrinciple.Animal;
import com.teclabs.model.StrategyDesignPrinciple.Bird;
import com.teclabs.model.StrategyDesignPrinciple.Dog;

public class Test {

	public static void main(String[] args) {

		Animal Tucker = new Dog("Oscar", 3.2, 42, "Chicken");
		Animal Tim = new Bird("Jill", 2, 10, "Peanuts");

		System.out.println("Dog: " + Tucker.tryToFly());

		System.out.println("Bird: " + Tim.tryToFly());

	}

}