package com.techlabs.model;

public class Admin {
	private String userName = "admin";
	private String password = "admin";
	private Admin login;
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassWord() {
		return password;
	}
	
	public Admin getInstance() {
		if(this.login == null) {
			this.login = new Admin();
		}
		return login;
	}

}
