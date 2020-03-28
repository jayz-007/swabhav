package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccounTest2 {
	
	public static void main(String args[]) {

		Account.setMinimumBalance(1000);
		Account acc1 = new Account(1000);
		acc1.withdraw(300);
		System.out.println(acc1.getBalance());
		
		

	}

}
