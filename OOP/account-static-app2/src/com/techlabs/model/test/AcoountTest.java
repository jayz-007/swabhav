package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AcoountTest {
	public static void main(String args[]) {
		Account acc = new Account(101, "abc", 600);
		try {
			acc.withdraw(600);
		} catch (RuntimeException e) {
			System.err.println(e.getLocalizedMessage());
		} finally {
			System.out.println("end main");
		}

	}

}
