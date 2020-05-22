package com.techlabs.model.dependencyinversionprinciple.test;

import com.techlabs.model.dependencyinversionprinciple.Circle;
import com.techlabs.model.dependencyinversionprinciple.Hexagon;
import com.techlabs.model.dependencyinversionprinciple.IShape;

public class Test {
	public static void main (String args[]) {
		IShape circle = new Circle();
		circle.calculateArea(2);
		
		IShape hexagon = new Hexagon();
		hexagon.calculateArea(2);
	}

}
