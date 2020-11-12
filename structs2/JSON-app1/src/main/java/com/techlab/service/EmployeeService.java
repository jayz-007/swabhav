package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService instance;
	public List<Employee> employees;
	Employee emp1 = new Employee(UUID.randomUUID().toString(), "xyz", "head");
	Employee emp2 = new Employee(UUID.randomUUID().toString(), "abc", "trainne");
	Employee emp3 = new Employee(UUID.randomUUID().toString(), "lma", "Analyst");
	Employee emp4 = new Employee(UUID.randomUUID().toString(), "axc", "develop");
	Employee emp5 = new Employee(UUID.randomUUID().toString(), "pqr", "tech");

	private EmployeeService() {
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	public static EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;

	}

	public void addEmployee(String name, String role) {

		employees.add(new Employee(UUID.randomUUID().toString(), name, role));
	}

	public void deleteEmployee(String id) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				employees.remove(employee);
				break;
			}
		}
	}

	public void updateEmployee(String id, String name, String role) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				employee.setName(name);
				employee.setRole(role);
			}
		}
	}

	public List<Employee> getEmployees(String name) {
		System.out.println("Inside Search");
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getName().equals(name)) {
				System.out.println(employee.getName());
				emps.add(employee);
			}
		}
		return emps;
	}

	public Employee searchEmployee(String id) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
		return null;
	}
}