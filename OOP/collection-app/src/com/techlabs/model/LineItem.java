package com.techlabs.model;

public class LineItem {
	private int id;
	private int quatity;
	private String name;
	private double price;

	public LineItem(int id, int quantity, double price, String name) {
		this.id = id;
		this.quatity = quantity;
		this.name = name;
		this.price = price;
	}

	public double calculateTotal() {
		return (quatity * price);
	}

	public int getId() {
		return id;

	}

	public int getQuantity() {
		return quatity;
	}

	public String getNAme() {
		return name;

	}

	public double getPrice() {
		return price;
	}
}
