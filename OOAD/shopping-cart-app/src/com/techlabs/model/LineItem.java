package com.techlabs.model;

import java.util.UUID;

public class LineItem implements Comparable<LineItem> {

	private UUID id;
	private int quantity;
	private Product product;

	public LineItem(String id, int quantity, Product product) {
		this.id = UUID.fromString(id);
		this.product = product;
		this.quantity = quantity;
	}

	public double calculateItemCost() {
		return (quantity * product.totalCost());
	}

	public UUID getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void incrementQuantity(int quatities) {
		this.quantity = quantity + quatities;
	}

	@Override
	public boolean equals(Object a) {
		LineItem item = (LineItem) a;
		if (this.hashCode() == item.hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(LineItem o) {
		// TODO Auto-generated method stub
		return 0;
	}

}