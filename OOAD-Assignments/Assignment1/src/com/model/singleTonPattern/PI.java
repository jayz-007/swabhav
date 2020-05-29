package com.model.singleTonPattern;

public class PI {
	private static double VALUE_OF_PI = 3.14;
	private static PI instance = new PI();

	private PI() {
	}

	public static PI getInstance() {
		return instance;
	}

	public double getValueOfPi() {
		return VALUE_OF_PI;
	}
}
