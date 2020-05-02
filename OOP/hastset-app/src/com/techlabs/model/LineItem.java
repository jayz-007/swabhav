package com.techlabs.model;

public class LineItem implements Comparable<LineItem> {
	private int id;
	private int quatity;
	private String name;
	private double price;

	public LineItem(int id, int quantity, int price, String name) {
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

	@Override
	public int compareTo(LineItem o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem item = (LineItem) obj;

		return (item.getId() == this.id && item.getNAme() == this.name && item.getPrice() == this.price
				&& item.getQuantity() == this.quatity);
	}*/
	
}
