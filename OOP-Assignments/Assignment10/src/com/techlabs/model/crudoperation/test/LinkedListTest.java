package com.techlabs.model.crudoperation.test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList<String> fruits = new LinkedList<String>();

		// Add
		fruits.add("Chickoo");
		fruits.addFirst("Mango");// add at first position
		fruits.add(1, "Banana");// add at specified index
		fruits.addLast("Grapes");

		// Read
		for (String fruit : fruits) {
			System.out.println(fruit);

		}
		// Update
			if (fruits.contains("Chickoo")) {
				fruits.remove("Chickoo");// Delete

				fruits.add("Apple");
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
	}

}
