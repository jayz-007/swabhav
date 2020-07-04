package com.techlabs.model;

public class EmployeeUnderManager implements IEmployeeRole {
	private String name;
	private String employeeRole;
	private int id;

	public EmployeeUnderManager(String name, String employeeRole, int id) {
		this.employeeRole = employeeRole;
		this.name = name;
		this.id = id;
	}

	@Override
	public String show(int level) {
		return("\t" + "\t" + name + " " + employeeRole + " " + id);

	}
}
