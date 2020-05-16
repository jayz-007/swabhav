package com.techlabs.model.test;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.Employee;
import com.techlabs.model.CSVLoader;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String[] args) throws ParseException {

		// DataBaseManager db = new DataBaseManager(new
		// MyUrlReader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		EmployeeDataAnalyzer db = new EmployeeDataAnalyzer(new CSVLoader("C:\\Users\\Admin\\Desktop\\data.txt"));
		db.createDatabse();
		System.out.println("Max salaried Employe is:");
		printInfo(db.getMaxSalariedEmployee());
		printDepartmentNoWiseCount(db);
		printDesignationWiseCount(db);

	}

	public static void printDesignationWiseCount(EmployeeDataAnalyzer db) {
		TreeMap<String, Integer> d = db.getDesignationCount();
		System.out.println("This is Designation wise count ");
		for (String designation : d.keySet()) {
			System.out.println("Designation is : " + designation + " Count is: " + d.get(designation));
		}
		System.out.println();
	}

	public static void printDepartmentNoWiseCount(EmployeeDataAnalyzer db) {
		TreeMap<Integer, Integer> d = db.getDepartmenNoCount();
		System.out.println("This is department number wise count");
		for (Integer deptNo : d.keySet()) {
			System.out.println("DeptNo is : " + deptNo + " Count is: " + d.get(deptNo));
		}
		System.out.println();
	}

	public static void printInfo(Employee e) {
		System.out.println("Name is: " + e.getEname() + " salary is :" + e.getSalary());
		System.out.println();
	}

}