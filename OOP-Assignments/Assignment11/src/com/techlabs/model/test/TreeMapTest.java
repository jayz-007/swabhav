package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main (String args[]) {
		TreeMap<Integer, String> employees = new TreeMap<Integer, String>();
		

		// add
		employees.put(2, "Rahul");
		employees.put(4, "Rahul");
		employees.put(1, "Vinit");
		employees.put(3, "Jay");

		// remove
		System.out.println(employees.remove(1, "Jay"));// returns false means value was not deleted == value was not
														// added -> a key can have one value
		System.out.println(employees.remove(1, "Rahul"));
		
		//update
		employees.replace(2, "Jay");
		// read
		for (Integer i : employees.keySet()) {
			System.out.println("Key is: " + i + " Value is : " + employees.get(i));
		}
		
		//Search
		for(Integer i : employees.keySet()) {
			if(employees.get(i) == "Jay")
				System.out.println("Key is: " + i + " Value is : " + employees.get(i));
		}

		System.out.println(employees.size());
		
		
	}

}
