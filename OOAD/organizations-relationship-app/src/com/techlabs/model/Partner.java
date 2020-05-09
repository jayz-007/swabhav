package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Partner {
	private int id;
	private String name;
	private double companyTurnOver;
	private int companyStrength;
	private List<Talent> talents = new ArrayList<Talent>();

	public Partner(int id, String name, double companyTurnOver, int companyStrength) {
		this.id = id;
		this.name = name;
		this.companyStrength = companyStrength;
		this.companyTurnOver = this.companyTurnOver;
	}

	public void addTalent(Talent t) {
		talents.add(t);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;

	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getCompanyStrength() {
		return companyStrength;
	}

	public Iterator<Talent> getTalents() {
		return talents.iterator();
	}
}
