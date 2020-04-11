package com.techlabs.model;

import java.text.ParseException;

public class SavingAccount extends Account {
	private String accounttype= "Savings Account";

	public SavingAccount(int accno, String name, double balance, String creationDate, String dateOfBirth)
			throws ParseException {
		super(accno, name, balance, creationDate, dateOfBirth);
		accounttype = "Saving Account";
		// TODO Auto-generated constructor stub
	}



	private static final double MINIMUM_BALANCE = 1000;

	

	@Override
	public void withdraw(double amt) {
		if ((balance - amt) > MINIMUM_BALANCE) {
			balance = balance - amt;
		}

	}
	
	public String getAccountType() {
		return accounttype;
	}

}
