package com.model.facadeDesignPattern.test;

import com.model.facadeDesignPattern.Circle;
import com.model.facadeDesignPattern.Rectangle;
import com.model.facadeDesignPattern.ShapeMaker;

public class FDDTest {
	public static void main(String args[]) {
		ShapeMaker circle = new ShapeMaker(new Circle());
		circle.drawMyShape();
		
		ShapeMaker rectangle = new ShapeMaker(new Rectangle());
		rectangle.drawMyShape();
		
		
		
	}
	

}
