package com.techlabs.model;

public class InsufficientFundException extends Exception {
	

	public InsufficientFundException(Account acc) {
		super("Account name :" + acc.getName() + " has account balance :" + acc.getBalance()
				+ " tried to withdraw ammount which cannot be done since the minimum balance has to be maintained 500");

	}

}
