package com.techlabs.model;

public class EmployeeUnderManager implements IEmployeeRole {
	private String name;
	private int id;
	private String role;

	public EmployeeUnderManager(String name, String role, int id) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	@Override
	public String show() {
		return ("\t \t Employee " + name + "Manager id is :" + id + "Employee rolde is " + role + '\n');
	}

}
