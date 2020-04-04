package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Man;

public class InheritanceTest {
	public static void main(String args[]) {
		case1();
		case2();

	}

	public static void case1() {
		Man x = new Man();
		
		x.play();
		x.read();
		x.walk();
		
		

	}

	public static void case2() {
		Boy x;
		x = new Boy();
		x.play();
		x.read();
		x.walk();
		x.eat();

	}
	
	public static void case3() {
		Man x;
		x = new Boy();
		x.play();
		x.read();
		x.walk();

	}
}
