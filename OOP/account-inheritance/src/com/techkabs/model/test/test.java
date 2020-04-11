package com.techkabs.model.test;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class test {
	public static void main(String args[]) {
		Account sa = new SavingAccount(20, "Savings", 1300);
		//sa.withdraw(200);
		printInfo(sa);
		//sa.withdraw(200);
		printInfo(sa);
		sa.deposit(500);
		printInfo(sa);
		
		Account ca = new CurrentAccount(30, "Current", 0);
		//ca.withdraw(4000);
		printInfo(ca);
		ca.deposit(5000);
		printInfo(ca);
		//ca.withdraw(6000);
		printInfo(ca);
		
		
	}

	public static void printInfo(Account acc) {
		System.out.println("Account no : " + acc.getAccno() + " Account name: " + acc.getName() + " Account balance: "
				+ acc.getBalance());
	}

}
