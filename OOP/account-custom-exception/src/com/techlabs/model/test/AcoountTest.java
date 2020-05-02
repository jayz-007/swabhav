package com.techlabs.model.test;

import java.io.IOException;

import com.techlabs.model.Account;
import com.techlabs.model.InsufficientFundException;

public class AcoountTest {
	public static void main(String args[]) {
		Account acc = new Account(101, "abc", 600);
		try {
			acc.withdraw(600);
			throw new InsufficientFundException(acc);
		} catch (IOException e) {

		} catch (InsufficientFundException e) {

		} catch (Exception e) {

		}

	}

}
