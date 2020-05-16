package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Order {

	private UUID id;
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(String id, String date)  {
		
		this.id = UUID.fromString(id);
		try {SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		this.date = sdf.parse(date);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void addItem(LineItem item) {
		if (this.getItems().contains(item)) {
			int index = this.getItems().indexOf(item);
			this.getItems().get(index).incrementQuantity(item.getQuantity());

		} else {
			items.add(item);
		}
	}

	public double checkoutCost() {
		double totalCost = 0;
		for (LineItem item : items) {
			totalCost = item.calculateItemCost() + totalCost;
		}
		return totalCost;
	}

	public UUID getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

}