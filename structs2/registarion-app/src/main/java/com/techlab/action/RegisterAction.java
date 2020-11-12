package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action {
	private String name;
	private String message;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String getMessage() {
		return message;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		System.out.println(name+" is name");
	}
	
	public void setMessage(String message) {
		this.message=message;
	}

}
