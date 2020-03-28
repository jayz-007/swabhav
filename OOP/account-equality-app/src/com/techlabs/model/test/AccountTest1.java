package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest1 {
	public static void main(String args[]) {
		Account acc1 = new Account(1000);
		acc1.withdraw(300);
		System.out.println(acc1.getBalance());

	}

}
