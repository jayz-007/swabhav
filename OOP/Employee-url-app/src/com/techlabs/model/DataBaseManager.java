package com.techlabs.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.TreeSet;

public class DataBaseManager {
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());

	public void createList() throws ParseException {
		MyFileReader reader = new MyFileReader();
		ArrayList<String> lines = reader.read();
		for (String line : lines) {
			String[] values = line.split(",");
			int empId = Integer.parseInt(values[0]);
			String eName = values[1].replaceAll("'", "");
			String role = values[2].replaceAll("'", "");
			int managerId = checkIntegerParameter(values[3]);
			
			String dob = values[4].replaceAll("'", "");
			double salary = Double.parseDouble(values[5]);

			double comm = checkDoubleParameter(values[6]);
			int deptId = Integer.parseInt(values[7]);
			employees.add(new Employee(empId, eName, role, managerId, dob, salary, comm, deptId));
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

	public TreeSet<Employee> getEmployees() {
		return employees;
	}
}