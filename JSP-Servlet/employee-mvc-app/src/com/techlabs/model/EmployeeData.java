package com.techlabs.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
	private static EmployeeData ed;
	private List<Employee> employees = new ArrayList<Employee>();

	public EmployeeData() {
		employees.add(new Employee( "Jay", "Developer"));
		employees.add(new Employee( "Vinit", "Developer"));
		employees.add(new Employee( "Pawan", "Analyst"));
		employees.add(new Employee( "Prasad", "Tester"));
		employees.add(new Employee( "Murtuza", "Manager"));
	}
	
	public void addEmployee(String name,String role) {
		employees.add(new Employee( name, role));
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public EmployeeData getInstance() {
		if(ed == null) {
			ed = new EmployeeData();
		}
		return ed;
	}
}