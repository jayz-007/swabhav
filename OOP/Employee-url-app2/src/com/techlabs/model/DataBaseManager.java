package com.techlabs.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class DataBaseManager {
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());
	private String file;

	public DataBaseManager(String file) {
		this.file = file;

	}

	public void createList() throws ParseException {
		MyFileReader reader = new MyFileReader(file);
		ArrayList<String> lines = reader.read();
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
		}
	}

	private int checkIntegerParameter(String parameter) {
		if (parameter.equals("NULL"))
			return 0;
		return Integer.parseInt(parameter);

	}

	private double checkDoubleParameter(String paramter) {
		if (paramter.equals("NULL"))
			return 0;
		return Double.parseDouble(paramter);
	}

	public Employee getMaxSalariedEmployee() {
		
		
		return (employees.last());

	}
	
	/*public TreeSet<Employee> sortEmployeeByDesignation() {
		TreeSet <Employee> employeeByDesignation = employees;
		employeeByDesignation(new DesignationComparator());
		return employeeByDesignation;
	}*/

	public Iterator<Employee> getEmployees() {
		return employees.iterator();
	}
}