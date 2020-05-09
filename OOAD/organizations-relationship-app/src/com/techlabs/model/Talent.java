package com.techlabs.model;

public class Talent {
	private int id;
	private String name;
	private float cgpa;
	private Partner partner;
	private String techstack;

	public Talent(int id, String name, float cgpa, Partner partner, String techstack) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.partner = partner;
		this.techstack = techstack;
	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public Partner getPartner() {
		return partner;

	}

	public String getTechStack() {
		return techstack;
	}
}
