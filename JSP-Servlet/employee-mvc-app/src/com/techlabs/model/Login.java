package com.techlabs.model;

public class Login {
	private String userName = "admin";
	private String password = "admin";
	private Login login;
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassWord() {
		return password;
	}
	
	public Login getInstance() {
		if(this.login == null) {
			this.login = new Login();
		}
		return login;
	}

}
