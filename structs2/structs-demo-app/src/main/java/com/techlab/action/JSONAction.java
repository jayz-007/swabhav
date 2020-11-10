package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;

public class JSONAction extends ActionSupport {
	private String id, name;

	public String execute() {
		id = "101";
		name = "jay";

		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}