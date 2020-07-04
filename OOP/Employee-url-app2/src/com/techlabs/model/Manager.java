package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployeeRole {
	private String name;
	private int id;
	private List<EmployeeUnderManager> e = new ArrayList<EmployeeUnderManager>();

	public Manager(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void addEmployee(EmployeeUnderManager e) {
		this.e.add(e);
	}

	@Override
	public String show() {
		String hierarchy = "\t" + "Manager is" + name + "Manager id is " + id + '\n';
		for (EmployeeUnderManager e1 : e) {
			hierarchy = hierarchy + e1.show();
		}
		return hierarchy;
	}

}
