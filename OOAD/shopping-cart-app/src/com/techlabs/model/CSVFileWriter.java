package com.techlabs.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class CSVFileWriter {
	private Writer writer ;
	public CSVFileWriter(String filename) {
		try {
			File file = new File(filename);
			writer = new FileWriter(file);
			writer.write(
					"CustID,CustName,CustAddress,OrderId,OrderDate,OrderCheckoutCost,ItemId,ItemQuantity,ProductId,ProductName,ProductPrice,ProductDiscount\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void write(Customer c) throws IOException {
		for (Iterator<Order> orders = c.getOrders().iterator();orders.hasNext();) {
			String text = c.getId() + ","+ c.getName()+","+c.getAddress()+",";
			Order order = orders.next();
			for(Iterator<LineItem>items= order.getItems().iterator();items.hasNext();) {
				LineItem item = items.next();
				String addText = order.getId()+","+order.getDate()+","+order.checkoutCost()+","+item.getId()+","+item.getQuantity()+","+item.getProduct().getId()+","+item.getProduct().getName()+","+item.getProduct().getPrice()+","+item.getProduct().getDiscountPercentage()+'\n';
				String row = text.concat(addText);
				writer.write(row);
			}
		}
		writer.close();
		
	}

}
