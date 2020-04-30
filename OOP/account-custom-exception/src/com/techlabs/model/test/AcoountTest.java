package com.techlabs.model.test;

import com.techlabs.model.Account;
import com.techlabs.model.InsufficientFundException;

public class AcoountTest {
	public static void main(String args[]) {
		Account acc = new Account(101, "abc", 600);
		try {
			acc.withdraw(600);
			throw new InsufficientFundException(acc);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("end main");
		}
	}

}
