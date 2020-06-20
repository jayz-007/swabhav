package com.techlabs.component;

public class MinimumBalanceException extends Exception {
	public MinimumBalanceException(Account acc) {
		super("Cannot perform transaction");
	}

}
