package com.techlabs.model.crudoperation.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetTest {
	public static void main(String args[]) {
		LinkedHashSet<String> fruits = new LinkedHashSet<String>();

		// Add
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");

		// Read
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// Update
		if (fruits.contains("Apple")) {
			fruits.remove("Apple");// Delete

			fruits.add("Chickoo");
		}
		System.out.println("After modfiy");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Search
		for (String fruit : fruits) {
			if (fruit.contains("Chickoo"))
				System.out.println(fruit);

		}

		List<String> listOfFruits = new ArrayList<String>(fruits);
		Collections.sort(listOfFruits);
		System.out.println("After Sorting");

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(listOfFruits.get(i));
		}
	}

}
