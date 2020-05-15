package com.techlabs.model.test;

import java.text.ParseException;
import java.util.Iterator;
import java.util.TreeSet;

import com.techlabs.model.DataBaseManager;
import com.techlabs.model.Employee;

public class Test {
	public static void main(String[] args) throws ParseException {
		//DataBaseManager db = new DataBaseManager("https://swabhav-tech.firebaseapp.com/emp.txt");
		DataBaseManager db = new DataBaseManager("C:\\Users\\Admin\\Desktop\\data.txt");
		db.createList();
		printInfo(db);
		printInfo(db.getMaxSalariedEmployee());

	}

	public static void printInfo(DataBaseManager db) {
		
		int count = 0;
		System.out.println();
		System.out.println("Total count of Employees based on Designation as follows: ");
		int totalColumns = 1;
		String countOfEmployeebyDesignation[][] = new String[2][totalColumns];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < totalColumns; j++) {
				countOfEmployeebyDesignation[i][j] = "0";
			}
		}

		for (Iterator<Employee> emp = db.getEmployees(); emp.hasNext();) {
			boolean result = false;
			Employee e = emp.next();
			for (int i = 0; i < totalColumns; i++) {
				String Str = e.getDesignation();
				if (countOfEmployeebyDesignation[0][i].contentEquals(Str)) {
					count = Integer.parseInt(countOfEmployeebyDesignation[1][i]);
					count++;
					countOfEmployeebyDesignation[1][i] = String.valueOf(count);
					result = true;
				}
			}

			if (result == false) {
				totalColumns++;
				String temp[][] = new String[2][totalColumns];
				totalColumns--;
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < totalColumns; j++) {
						temp[i][j] = countOfEmployeebyDesignation[i][j];
					}
				}
				totalColumns++;
				countOfEmployeebyDesignation = temp;
				countOfEmployeebyDesignation[0][--totalColumns] = e.getDesignation();
				count = 1;
				countOfEmployeebyDesignation[1][totalColumns] = String.valueOf(count);
				totalColumns++;

			}

		}
		for (int i = 0; i < totalColumns; i++) {
			if (countOfEmployeebyDesignation[0][i] != "0")
				System.out.println("Designation is : " + countOfEmployeebyDesignation[0][i] + " Count is : "
						+ countOfEmployeebyDesignation[1][i]);
		}

		count = 0;
		System.out.println();
		System.out.println("Total count of Employees based on Deptno as follows: ");
		totalColumns = 1;
		String countOfEmployeebyDeptNo[][] = new String[2][totalColumns];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < totalColumns; j++) {
				countOfEmployeebyDeptNo[i][j] = "0";
			}
		}

		for (Iterator<Employee> emp = db.getEmployees(); emp.hasNext();) {
			boolean result = false;
			Employee e = emp.next();
			for (int i = 0; i < totalColumns; i++) {
				String deptNo = String.valueOf(e.getDeptNo());
				if (countOfEmployeebyDeptNo[0][i].contentEquals(deptNo)) {
					count = Integer.parseInt(countOfEmployeebyDeptNo[1][i]);
					count++;
					countOfEmployeebyDeptNo[1][i] = String.valueOf(count);
					result = true;
				}
			}

			if (result == false) {
				totalColumns++;
				String temp[][] = new String[2][totalColumns];
				totalColumns--;
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < totalColumns; j++) {
						temp[i][j] = countOfEmployeebyDeptNo[i][j];
					}
				}
				totalColumns++;
				countOfEmployeebyDeptNo = temp;
				countOfEmployeebyDeptNo[0][--totalColumns] = String.valueOf(e.getDeptNo());
				count = 1;
				countOfEmployeebyDeptNo[1][totalColumns] = String.valueOf(count);
				totalColumns++;

			}

		}
		for (int i = 0; i < totalColumns; i++) {
			if (countOfEmployeebyDeptNo[0][i] != "0")
				System.out.println("Deptno is : " + countOfEmployeebyDeptNo[0][i] + " Count is : "
						+ countOfEmployeebyDeptNo[1][i]);
		}
	}

	public static void printInfo(Employee e) {
		System.out.println();
		System.out.println("Max");
		System.out.println(" name is: " + e.getEname() + " salary is :" + e.getSalary());
	}
	

}