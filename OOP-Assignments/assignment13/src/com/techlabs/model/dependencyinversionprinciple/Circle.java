
package com.techlabs.model.dependencyinversionprinciple;

public class Circle implements IShape {
	private final static float VALUE_OF_PI = 3.14F;

	@Override
	public void calculateArea(float radius) {
		System.out.println("Area of circle is : " + VALUE_OF_PI*radius*radius);
		
	}


}