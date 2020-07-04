package com.techlabs.model;

import java.util.Iterator;

public class OrganizationHierarchy {
	private EmployeeDataAnalyzer dataAnalyzer;
	private President president;
	private String employeeHierarchy;

	public OrganizationHierarchy(EmployeeDataAnalyzer data) {
		this.dataAnalyzer = data;
		employeeHierarchy = gethierarcy();
	}

	private void getPresident() {
		for (Iterator<Employee> employees = dataAnalyzer.getEmployees(); employees.hasNext();) {
			Employee e = employees.next();
			if (e.getDesignation().equals("PRESIDENT")) {
				this.president = new President(e.getEname());
				System.out.println();

			}
		}
	}

	private String gethierarcy() {
		getPresident();
		for (Iterator<Employee> employees = dataAnalyzer.getEmployees(); employees.hasNext();) {
			Employee e = employees.next();
			if (e.getDesignation().equals("MANAGER")) {
				Manager m = new Manager(e.getEname(), e.getDeptNo());
				int id = e.getDeptNo();
				for (Iterator<Employee> employeesLevel1 = dataAnalyzer.getEmployees(); employeesLevel1.hasNext();) {
					Employee e1 = employeesLevel1.next();
					if (e1.getDeptNo() == id) {
						EmployeeUnderManager employeeUnderManager = new EmployeeUnderManager(e1.getEname(),
								e1.getDesignation(), e1.getDeptNo());
						m.addEmployee(employeeUnderManager);
					}

				}
				president.addManagers(m);
			}
		}
		return president.show();

	}

	public String getEmployeeHierarchy() {
		return employeeHierarchy;
	}

}
