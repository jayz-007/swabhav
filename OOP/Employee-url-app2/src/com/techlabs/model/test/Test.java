package com.techlabs.model.test;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.OrganizationHierarchy;
import com.techlabs.model.Employee;
import com.techlabs.model.CSVLoader;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String[] args) throws ParseException {

		EmployeeDataAnalyzer db = new EmployeeDataAnalyzer(new CSVLoader("C:\\Users\\Admin\\Desktop\\data.txt"));
		db.createDatabse();

		OrganizationHierarchy h = new OrganizationHierarchy(db);
		System.out.println(h.getEmployeeHierarchy());

	}

}