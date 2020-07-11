package com.techlabs.model;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrganizationHierarchyBuilder {
	Map<Integer, Employee> employees = new TreeMap<Integer, Employee>();

	public OrganizationHierarchyBuilder(ILoader object) throws Exception {
		List<String> lines = object.getData();
		for (String line : lines) {
			String[] elements = line.split(",");
			int empId = Integer.parseInt(elements[0]);
			String empName = elements[1].replaceAll("'", "");
			String role = elements[2].replaceAll("'", "");
			int managerId = 0;
			if (!elements[3].equals("NULL")) {
				managerId = Integer.parseInt(elements[3]);
			}
			String joiningDate = elements[4].replaceAll("'", "");
			int salary = Integer.parseInt(elements[5]);
			int comm = 0;
			if (!elements[6].equals("NULL")) {
				comm = Integer.parseInt(elements[6]);
			}
			int deptId = Integer.parseInt(elements[7]);
			employees.put(empId, new Employee(empId, empName, role, managerId, joiningDate, salary, comm, deptId));
		}
		for (Map.Entry employee : employees.entrySet()) {
			findEmployee((Employee) employee.getValue());
		}
	}

	private void findEmployee(Employee employee) {
		Employee emp1 = employee;
		Employee emp2 = employees.get(emp1.getManagerId());
		if (emp2 != null && emp1 != null)
			emp2.addReferralEmployee(emp1);
	}

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}
	
	public Employee getPresident() {
		for (Map.Entry employee : employees.entrySet()) {
			Employee referredEmployee = (Employee) employee.getValue();
			if (referredEmployee.getDesignation().contains("PRESIDENT")) {
				return referredEmployee;
			}
		}
		return null;
	}

}