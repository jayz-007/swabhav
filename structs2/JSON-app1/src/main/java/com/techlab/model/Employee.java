package com.techlab.model;

import java.util.UUID;

public class Employee {
	private String id;
	private String name;
	private String role;

	public Employee() {

	}

	public Employee(String id, String name, String role) {
		this.id = id.toString();
		this.name = name;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(String id) {
		this.id = id.toString();
	}

}
