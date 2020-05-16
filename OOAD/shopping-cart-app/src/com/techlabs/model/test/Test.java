package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import com.techlabs.model.CSVFileWriter;
import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class Test {
	public static void main(String args[]) throws ParseException, IOException {
		Product pen = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "pen", 20, 10f);
		Product book = new Product("cede66b7-3d29-4da6-b700-871fc0ac57be", "book", 50, 50f);
		LineItem pens = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 20, pen);
		LineItem books = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", 10, book);
		

		Order order1 = new Order("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "12/2/2020");
		order1.addItem(pens);
		order1.addItem(pens);
		order1.addItem(books);

		Product bag = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "bag", 100, 10f);
		Product mobile = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "mobile", 10000, 50f);
		LineItem bags = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 1, bag);
		LineItem mobiles = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", 1, mobile);

		Order order2 = new Order("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "12/3/2020");
		order2.addItem(bags);
		order2.addItem(mobiles);
		
		Product camera = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "camera", 100, 10f);
		Product brush = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "brushes", 10000, 50f);
		LineItem cameras = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 1, bag);
		LineItem brushes = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", 2, mobile);
		
		Order order3 = new Order("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "12/3/2020");
		order3.addItem(cameras);
		order3.addItem(brushes);
		
		

		Customer kishore = new Customer("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "kishore", "mumbai");
		kishore.addOrder(order1);
		kishore.addOrder(order2);
		
		Customer vishal = new Customer("9fb01de0-1d63-4d09-9415-90e0b4e93b9e", "vishal", "thane");
		vishal.addOrder(order1);
		vishal.addOrder(order2);
		vishal.addOrder(order3);
		
		printInfo(kishore);
		printInfo(vishal);
		
		CSVFileWriter csv = new CSVFileWriter("kishore.txt");
		csv.write(kishore);
	}

	public static void printInfo(Customer c) {
		System.out.println("Customer name is: " + c.getName() + " has made orders " + c.getOrders().size());
		System.out.println("Order details are as follows :");
		System.out.println();
		int countOfOrders=1;
		
		for (Iterator<Order> orders = c.getOrders().iterator();orders.hasNext();) {
			Order order =orders.next();
			int countOfLineItems = 1;
			System.out.println("There are "+order.getItems().size()+" in this order");
			
			System.out.println("Order " + countOfOrders++ + " total cost is: " + order.checkoutCost());
			System.out.println("Details are as follows: ");
			for (Iterator<LineItem> itme = order.getItems().iterator();itme.hasNext();) {
				LineItem item = itme.next();
				System.out.println("LineItem " + countOfLineItems + " detailas are");
				System.out.println("product purchased is: " + item.getProduct().getName() + " Quantity is: "
						+ item.getQuantity() + " total cost is: " + item.calculateItemCost());
				countOfLineItems++;

			}
			System.out.println();
		}
		System.out.println("____________________________________________________________________________");

	}

}
