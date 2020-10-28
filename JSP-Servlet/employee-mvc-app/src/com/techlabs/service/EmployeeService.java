package com.techlabs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.Employee;

public class EmployeeService {
	private static EmployeeService ed;
	private List<Employee> employees = new ArrayList<Employee>();

	public EmployeeService() {
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
	
	public EmployeeService getInstance() {
		if(ed == null) {
			ed = new EmployeeService();
		}
		return ed;
	}
	
	public void deleteEmployee(String id) {
		for(Employee emp : employees) {
			if(emp.getId().toString().equals(id)) {
				employees.remove(emp);
				System.out.println();
			}
		}
	}
}