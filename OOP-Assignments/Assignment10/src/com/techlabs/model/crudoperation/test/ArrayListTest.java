package com.techlabs.model.crudoperation.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main (String args[]) {
	ArrayList<String> fruits = new ArrayList<String>();
	
	fruits.add("Apple");
	fruits.add("Mango");
	
	fruits.remove("Mango");
	
	fruits.set(0, "Grapes");
	fruits.add("Chickoo");
	
	for(int i = 0;i<fruits.size();i++) {
		System.out.println(fruits.get(i));
	}
	int index = fruits.indexOf("Grapes");
	System.out.println(fruits.get(index));
	}

}
