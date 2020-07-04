package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class EmployeeHierarchy {
	private EmployeeDatabaseManager employeeDataBaseManger;

	public EmployeeHierarchy(EmployeeDatabaseManager employeeDatabaseManager) {
		this.employeeDataBaseManger = employeeDatabaseManager;
	}

	public String constructHierarchy() {
		President president = getPresident();
		for (Iterator<Employee> employees = employeeDataBaseManger.getEmployees(); employees.hasNext();) {
			Employee emp = employees.next();
			if (emp.getDesignation().equals("MANAGER")) {
				Manager m = new Manager(emp.getEname(), emp.getDeptNo());
				int id = emp.getDeptNo();
				for (Iterator<Employee> employeesUnderManager = employeeDataBaseManger
						.getEmployees(); employeesUnderManager.hasNext();) {
					Employee employeeUnderManager = employeesUnderManager.next();
					if (employeeUnderManager.getDeptNo() == id) {
						EmployeeUnderManager em = new EmployeeUnderManager(employeeUnderManager.getEname(),
								employeeUnderManager.getDesignation(), employeeUnderManager.getDeptNo());
						m.addEmployee(em);
					}
				}
				president.addEmployee(m);
			}
		}
		return president.show(0);

	}
	
	

	public President getPresident() {
		for (Iterator<Employee> emp = employeeDataBaseManger.getEmployees(); emp.hasNext();) {
			Employee e = emp.next();
			if (e.getDesignation().equals("PRESIDENT")) {
				System.out.println("president created");
				President p = new President(e.getEname());
				return p;
			}

		}
		return null;

	}
}
