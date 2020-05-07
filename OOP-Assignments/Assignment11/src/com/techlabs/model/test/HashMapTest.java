package com.techlabs.model.test;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String args[]) {
		HashMap<Integer, String> employees = new HashMap<Integer, String>();

		// add
		employees.put(1, "Rahul");
		employees.put(1, "Jay");
		employees.put(1, "Rahul");
		employees.put(2, "Vinit");
		employees.put(2, "Pawan");
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
