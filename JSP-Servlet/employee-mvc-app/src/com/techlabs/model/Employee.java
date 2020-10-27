package com.techlabs.model;

public class Employee {
	private int id;
	private String name;
	private String role;

	public Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}



	public String getRole() {
		return role;
	}


}