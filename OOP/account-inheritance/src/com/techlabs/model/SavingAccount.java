package com.techlabs.model;

public class SavingAccount extends Account {

	private static final double MINIMUM_BALANCE = 1000;

	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	/*@Override
	public void withdraw(double amt) {
		if ((balance - amt) > MINIMUM_BALANCE) {
			balance = balance - amt;
		}

	}*/

}
