package com.techlabs.model;

import java.text.ParseException;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance, String creationDate, String dateOfBirth)
			throws ParseException {
		super(accno, name, balance, creationDate, dateOfBirth);
		accounttype = "Current Account";
		// TODO Auto-generated constructor stub
	}

	private static final double MINIMUM_BALANCE = -5000;

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
