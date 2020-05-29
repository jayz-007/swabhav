package com.model.facadeDesignPattern;

public class ShapeMaker {
	private IShape shape;
	
	public ShapeMaker(IShape shape) {
		this.shape = shape;
	}
	
	public void drawMyShape() {
		shape.drawShape();
	}

}
