package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Customer {

	private UUID id;
	private String name;
	private String address;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(String id, String name, String address) {
		this.id = UUID.fromString(id);
		this.name = name;
		this.address = address;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
