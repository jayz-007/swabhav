package com.techlabs.model;

import java.text.ParseException;
import java.util.Iterator;

public class Test {
	public static void main(String args[]) throws ParseException {
		EmployeeDatabaseManager emp = new EmployeeDatabaseManager(
				new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		emp.createDatabse();
		for(Employee e : emp.getEmployees()) {
			
			System.out.println(e.getDesignation());
		}
	}

}
