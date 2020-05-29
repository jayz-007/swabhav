package com.model.singleTonPattern.test;

import com.model.singleTonPattern.PI;

public class STPTest {
	public static void main(String args[]) {
		PI object = PI.getInstance();
		System.out.println(object.getValueOfPi());
		
	}

}
