package com.techlabs.model.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import com.techlabs.model.LineItem;
import com.techlabs.model.NameComparator;
import com.techlabs.model.PriceComparator;
import com.techlabs.model.QuantityComparator;

public class TreeSetTest {
	public static void main(String args[]) {
		case1();
		case2();
		case3();
		case4();
		case5();

	}

	public static void case1() {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Swabhav");
		names.add("techlabs");
		names.add("techlabs");

		System.out.println(names.size());

	}

	public static void case2() {
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		items.add(new LineItem(102, 500, 10, "book"));
		items.add(new LineItem(101, 500, 10, "book"));
		items.add(new LineItem(104, 500, 10, "book"));

		System.out.println(items.size());

	}

	public static void case3() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new PriceComparator() {
		});
		items.add(new LineItem(102, 600, 11, "pen"));
		items.add(new LineItem(101, 800, 7, "pencil"));
		items.add(new LineItem(104, 250, 6, "book"));

		for (LineItem item : items) {
			System.out.println("Id is : " + item.getId() + " Name is : " + item.getNAme() + " price is :" + item.getPrice()
					+ " Quantity is " + item.getQuantity());

		}
		System.out.println();

	}
	
	public static void case4() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new QuantityComparator() {
		});
		items.add(new LineItem(102, 600, 11, "pen"));
		items.add(new LineItem(101, 800, 7, "pencil"));
		items.add(new LineItem(104, 250, 6, "book"));

		for (LineItem item : items) {
			System.out.println("Id is : " + item.getId() + " Name is : " + item.getNAme() + " price is :" + item.getPrice()
					+ " Quantity is " + item.getQuantity());

		}
		System.out.println();

	}
	
	public static void case5() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new NameComparator() {
		});
		items.add(new LineItem(102, 600, 11, "pen"));
		items.add(new LineItem(101, 800, 7, "eraser"));
		items.add(new LineItem(104, 250, 6, "book"));

		for (LineItem item : items) {
			System.out.println("Id is : " + item.getId() + " Name is : " + item.getNAme() + " price is :" + item.getPrice()
					+ " Quantity is " + item.getQuantity());

		}

	}
}
