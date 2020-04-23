package com.techlabs.model.guitar;

public class Guitar {

	private String serialNum;
	private double price;

	GuitarSpec spec;

	public Guitar(String serialNum, double price, GuitarSpec spec) {
		this.serialNum = serialNum;
		this.price = price;
		this.spec = spec;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

}