package com.techlabs.model;

import java.util.List;

public class President implements IEmployeeRole {
	public String name;
	private List<Manager> managers;

	public President(String name) {
		this.name = name;
	}

	public void addEmployee(Manager e) {
		managers.add(e);
	}

	@Override
	public String show(int level) {
		String hierarchy = "President name: " + name + '\n';
		for(Manager manager: managers) {
			hierarchy = hierarchy + manager.show(level);
		}
		return hierarchy;

	}

}
