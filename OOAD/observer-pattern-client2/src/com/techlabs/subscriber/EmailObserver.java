package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class EmailObserver implements IBalanceObserver {

	@Override
	public void update(Account acc) {
		System.out.println("Inside Email Observer");
		System.out.println("Account no is :" + acc.getAccno() + " Balance is : " + acc.getBalance()
				+ "Account name is : " + acc.getName());
		System.out.println("Email notification sent");

	}

}
