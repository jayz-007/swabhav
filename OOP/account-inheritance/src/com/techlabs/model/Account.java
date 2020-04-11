package com.techlabs.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;
	private Date creationDate;
	private Date dateOfBirth;
	

	public Account(int accno, String name, double balance,String creationDate,String dateOfBirth) throws ParseException {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		this.creationDate= formatter.parse(creationDate);
		this.dateOfBirth = formatter.parse(dateOfBirth);
	
		

	}
	public void deposit(double amt) {
		balance = balance + amt;
	}

	public abstract void withdraw(double amt);

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
