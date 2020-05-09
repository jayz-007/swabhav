package com.techlabs.model.test;

import com.techlabs.model.ClassA;
import com.techlabs.model.ClassB;

public class Test {
	public static void main(String args[]) {
		ClassA a = new ClassA(new ClassB());
		a.bar();

	}
}
