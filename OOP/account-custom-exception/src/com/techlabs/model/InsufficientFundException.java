package com.techlabs.model;

public class InsufficientFundException extends Exception {

	private Account acc;

	public InsufficientFundException(Account acc) {
		this.acc = acc ;

	}

	@Override
	public String getMessage() {
		return ("Account name :" + acc.getName() + " has account balance :" + acc.getBalance()
				+ " tried to withdraw ammount which cannot be done since the minimum balance has to be maintained 500");
	}
}
