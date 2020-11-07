package com.techlabs.model;

public class Contact {
	private String fname;
	private String lname;
	private String mname;
	private String emailId;
	private String phoneNo;

	public Contact(String fname, String lname, String mname, String phoneNo, String emailId) {
		this.fname = fname;
		this.lname = lname;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.mname = mname;
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhone() {
		return phoneNo;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
