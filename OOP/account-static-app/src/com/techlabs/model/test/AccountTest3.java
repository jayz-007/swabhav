package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest3 {
	public static void main(String args[]) {
		Account acc1 = new Account(1000);
		acc1.withdraw(300);
		acc1.deposit(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new Account(200);
		acc2.deposit(400);
		acc2.withdraw(50);
		System.out.println(acc2.getBalance());
		
		System.out.println(Account.getTotalTransactions());
		

	}

}
