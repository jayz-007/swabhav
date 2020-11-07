package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {
	private String developer;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Welcome Action");
		return "success";
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

}
