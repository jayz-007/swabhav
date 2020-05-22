package com.techlabs.model.dependencyinversionprinciple;

public class Hexagon implements IShape {
	private static final float VALUE_OF_CONSTANT = 2.598f;

	@Override
	public void calculateArea(float side) {
		System.out.println("Area of hexagon is: " + VALUE_OF_CONSTANT*side*side);
		
	}



}