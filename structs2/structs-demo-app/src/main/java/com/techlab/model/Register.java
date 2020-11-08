package com.techlab.model;

public class Register {
	private String username;
	private String firstname;
	private String middlname;
	private String lastname;
	
	public void setLastname(String lastname) {
		this.lastname=lastname;
		System.out.println(this.lastname);
	}
	public void setMiddlename(String middlename) {
		this.middlname=middlename;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getUsername() {
		return username;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getMiddlename() {
		return middlname;
	}

}
