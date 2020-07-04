package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class President implements IEmployeeRole {
	private String name;
	private List<Manager> managers = new ArrayList<Manager>();

	public President(String name) {
		this.name = name;
	}

	public void addManagers(Manager m) {
		managers.add(m);

	}

	@Override
	public String show() {
		String hierarchy = "President is: "+name+'\n';
		for(Manager manager : managers) {
			hierarchy = hierarchy +manager.show();
		}
		return hierarchy;
	}

}
