package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.techlabs.model.LineItem;

public class LineItemsTest {
	public static void main(String args[]) {
		case1();
		case2();
	}

	public static void case1() {
		ArrayList carts = new ArrayList();
		carts.add(new LineItem(101, 10, 500, "book"));
		carts.add(new LineItem(102, 5, 50, "pen"));
		carts.add(new LineItem(103, 3, 10, "pencil"));
		carts.add("swabhav");
		double totalCartPrice = 0;
		for (Object cart : carts) {

			if(cart instanceof LineItem) {
				LineItem lineitem = (LineItem) cart;
				totalCartPrice = lineitem.calculateTotal() + totalCartPrice;
				System.out.println("ID :" + lineitem.getId() + " Name : " + lineitem.getNAme() + " Price is: "
						+ lineitem.getPrice() + " Quantity is: " + lineitem.getQuantity() + " Total price is: "
						+ lineitem.calculateTotal());
			

			}
		}
		System.out.println("total is:" + totalCartPrice);

	}

	public static void case2() {
		double totalCartPrice = 0;
		ArrayList<LineItem> carts = new ArrayList<LineItem>();
		carts.add(new LineItem(101, 10, 500, "book"));
		carts.add(new LineItem(102, 5, 50, "pen"));
		carts.add(new LineItem(103, 3, 10, "pencil"));

		for (LineItem cart : carts) {
			totalCartPrice = cart.calculateTotal() + totalCartPrice;
			System.out.println("ID :" + cart.getId() + " Name : " + cart.getNAme() + " Price is: " + cart.getPrice()
					+ " Quantity is: " + cart.getQuantity() + " Total price is: " + cart.calculateTotal());

		}
		System.out.println("total is:" + totalCartPrice);
	}

}
