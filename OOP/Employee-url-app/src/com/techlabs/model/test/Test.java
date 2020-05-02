package com.techlabs.model.test;

import java.text.ParseException;
import java.util.TreeSet;

import com.techlabs.model.DataBaseManager;
import com.techlabs.model.Employee;

public class Test {
	public static void main(String[] args) throws ParseException {
		DataBaseManager dbManager = new DataBaseManager();
		dbManager.createList();
		TreeSet<Employee> employees = dbManager.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		}
	}

	private static void printInfo(Employee employee) {
		System.out.println(" ename:" + employee.getEname() + " salary:" + employee.getSalary());
	}
}