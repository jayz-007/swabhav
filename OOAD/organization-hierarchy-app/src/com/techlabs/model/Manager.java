package com.techlabs.model;

import java.util.List;

public class Manager implements IEmployeeRole {
	private String name;
	private int id;
	List<EmployeeUnderManager> employees;

	public Manager(String name, int id) {
		this.id = id;
		this.name = name;
	}
	
	public void addEmployee(EmployeeUnderManager e) {
		employees.add(e);
	}

	@Override
	public String show(int level) {
		String hierarchy = '\t'+name+" "+id;
		for(EmployeeUnderManager employee :employees) {
			hierarchy = employee.show(level);
		}
		return hierarchy;
		
	}

}
