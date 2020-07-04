package com.techlabs.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDatabaseManager {
	TreeSet<Employee> employees = new TreeSet<Employee>();
	private ILoader loader;
	private EmployeeHierarchy hieracrchy;

	public EmployeeDatabaseManager(ILoader loader) {
		this.loader = loader;
		this.hieracrchy = new EmployeeHierarchy(this);

	}

	public void createDatabse() throws ParseException {
		ArrayList<String> lines = (ArrayList<String>) loader.getData();
		for (String line : lines) {
			String[] values = line.split(",");
			int empId = Integer.parseInt(values[0]);
			String eName = values[1].replaceAll("'", "");
			String designation = values[2].replaceAll("'", "");
			int managerId = checkIntegerParameter(values[3]);

			String dob = values[4].replaceAll("'", "");
			double salary = Double.parseDouble(values[5]);

			double commission = checkDoubleParameter(values[6]);
			int deptId = Integer.parseInt(values[7]);
			employees.add(new Employee(empId, eName, designation, managerId, dob, salary, commission, deptId));
			System.out.println("e added");
		}
	}

	private double checkDoubleParameter(String paramter) {
		if (paramter.equals("NULL"))
			return 0;
		return Double.parseDouble(paramter);

	}

	private int checkIntegerParameter(String parameter) {
		if (parameter.equals("NULL"))
			return 0;
		return Integer.parseInt(parameter);
	}

	public TreeSet<Employee> getEmployees() {
		return employees;
	}

	public EmployeeHierarchy getHierarchy() {
		return hieracrchy;
	}

}
