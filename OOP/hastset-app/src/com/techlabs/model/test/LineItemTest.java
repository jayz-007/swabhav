package com.techlabs.model.test;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import com.techlabs.model.LineItem;

public class LineItemTest {
	public static void main(String args[]) {
		case1();
		case2();
	}

	public static void case1() {
		HashSet<String> names = new HashSet<String>();
		names.add("swabhav");
		names.add("swabhav");
		System.out.println(names.size());
	}

	public static void case2() {
		HashSet<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(101, 500, 10, "book"));
		items.add(new LineItem(101, 500, 10, "book"));

		// display count of items.
		System.out.println(items.size());

		

	}

}
