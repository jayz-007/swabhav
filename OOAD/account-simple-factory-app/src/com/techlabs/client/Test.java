package com.techlabs.client;

import com.techlabs.component.Account;
import com.techlabs.component.AccountFactory;
import com.techlabs.component.AccountType;
import com.techlabs.component.MinimumBalanceException;

public class Test {
	public static void main(String args[]) throws MinimumBalanceException {
		AccountFactory factory = AccountFactory.getInstance();
		Account acc1 = factory.make(AccountType.SA);
		acc1.setAccNo(101);
		acc1.setName("abc");
		acc1.deposit(10000);
		try {
			acc1.withdraw(10000);
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		printInfo(acc1);
		
		
		Account acc2 =factory.make(AccountType.CA);
		acc2.setName("abc");
		acc2.setAccNo(101);
		acc2.deposit(10000);
		acc2.withdraw(10000);
		
		printInfo(acc2);
				

	}

	public static void printInfo(Account acc) {
		System.out.println("Account name :" + acc.getAccName() + " Account no: " + acc.getAccno() + " Account amount : "
				+ acc.getAmount() + " AccountType: " + acc.getType());
	}

}
