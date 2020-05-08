package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String args[]) {
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

		// update
		employees.replace(2, "Jay");

		employees.put(1, "Rahul");
		employees.put(4, "Prasad");
		// read
		for (Integer i : employees.keySet()) {
			System.out.println("Key is: " + i + " Value is : " + employees.get(i));
		}

		// Search
		for (Integer i : employees.keySet()) {
			if (employees.get(i) == "Jay")
				System.out.println("Key is: " + i + " Value is : " + employees.get(i));
		}

		System.out.println(employees.size());

		Map<Integer, String> map = sortValues(employees);
		System.out.println("\n");
		System.out.println("After Sorting:");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry employee = (Map.Entry) iterator.next();
			System.out.println("Roll no:  " + employee.getKey() + "     Name:   " + employee.getValue());
		}

	}

	private static HashMap sortValues(TreeMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}
