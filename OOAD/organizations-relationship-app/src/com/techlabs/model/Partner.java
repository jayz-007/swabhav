package com.techlabs.model;

public class Partner {
	private int id;
	private String name;
	private double companyTurnOver;
	private int companyStrength;

	public Partner(int id, String name, double companyTurnOver, int companyStrength) {
		this.id = id;
		this.name = name;
		this.companyStrength = companyStrength;
		this.companyTurnOver = companyTurnOver;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		if (name != null)
			return name;

		return null;

	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getCompanyStrength() {
		return companyStrength;
	}
}
