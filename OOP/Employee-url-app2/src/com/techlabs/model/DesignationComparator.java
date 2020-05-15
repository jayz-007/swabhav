package com.techlabs.model;

import java.util.Comparator;

public class DesignationComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String designation = o1.getDesignation();
		return (designation.compareToIgnoreCase(o2.getDesignation()));
	}

}
