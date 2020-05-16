package com.techlabs.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeDataAnalyzer {
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());
	private ILoader loader;
	

	public EmployeeDataAnalyzer(ILoader loader)  {
		this.loader = loader;
		
		
	}
	public void createDatabse() throws ParseException {
		ArrayList< String >lines = (ArrayList<String>) loader.getData();
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

	public TreeMap<String, Integer> getDesignationCount() {
		TreeMap<String, Integer> designationWiseCount = new TreeMap<String, Integer>();
		for (Employee employee : employees) {
			if (designationWiseCount.containsKey(employee.getDesignation())) {
				int count = designationWiseCount.get(employee.getDesignation());
				count++;
				designationWiseCount.put(employee.getDesignation(), count);
			} else {
				int count = 1;
				designationWiseCount.put(employee.getDesignation(), count);
			}
		}
		return designationWiseCount;
	}

	public TreeMap<Integer, Integer> getDepartmenNoCount() {
		TreeMap<Integer, Integer> departmentWiseCount = new TreeMap<Integer, Integer>();
		for (Employee employee : employees) {
			if (departmentWiseCount.containsKey(employee.getDeptNo())) {
				int count = departmentWiseCount.get(employee.getDeptNo());
				count++;
				departmentWiseCount.put(employee.getDeptNo(), count);
			} else {
				int count = 1;
				departmentWiseCount.put(employee.getDeptNo(), count);
			}
		}
		return departmentWiseCount;

	}

	public Iterator<Employee> getEmployees() {
		return employees.iterator();
	}

}