package com.techlab.model;

import java.util.UUID;

public class Employee {
	private UUID id;
	private String name;
	private String role;

	public Employee(String name, String role) {

		this.id = UUID.randomUUID();
		this.name = name;
		this.role = role;
	}

	public UUID getId() {
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

	public void setId(UUID id) {
		this.id = id;
	}

}