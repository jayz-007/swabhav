package com.techlabs.subscriber;

import com.techlabs.publisher.Account;

public class Test {
	public static void main(String args[]) {
		Account acc = new Account(101, "abc", 1000);
		acc.addBalanceObserver(new SMSObserver());
		acc.deposit(10000);
		
	}

}
