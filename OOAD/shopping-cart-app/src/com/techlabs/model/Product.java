package com.techlabs.model;

import java.util.UUID;

public class Product {

	private UUID id;
	private String name;
	private double price;
	private float discountPercentage;

	public Product(String id, String name, double price, float discountPercentage) {
		this.id = UUID.fromString(id);
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
	}

	public double totalCost() {
		return(price - (price*discountPercentage/100));
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}
}