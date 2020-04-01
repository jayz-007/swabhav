package com.techlabs.serialization.model;

import java.io.Serializable;

public class Account implements Serializable{

	private int accno;
	private String name;
	private double balance;
	private static int MINIMUM_BALANCE = 500;
	private static int TOTAL_TRANSACTIONS = 0;

	/*
	 * static { MINIMUM_BALANCE = 500 ; TOTAL_TRANSACTIONS = 0; }
	 */

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;

	}

	public void withdraw(double amt) { 
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
			TOTAL_TRANSACTIONS++;
		}
	}

	public void deposit(double amt) {
		balance = balance + amt;
		TOTAL_TRANSACTIONS++;
	}

	public String getName() {
		return name;
	}
	
	public int getAccno() {
		return accno;
	}
	
	public double getBalance() {
		return balance;
	}

	public static void setMinimumBalance(int balance) {
		MINIMUM_BALANCE = balance;
	}

	/*
	 * public static int getMinimumBalance() { return MINIMUM_BALANCE; }
	 */

	public static int getTotalTransactions() {
		return TOTAL_TRANSACTIONS;
	}

	@Override
	public String toString() {
		return (super.toString() + "accno" + accno + "\nname: " + name + "\nbalance: " + balance);

	}

	@Override
	public boolean equals(Object obj) {

		Account acc = (Account) obj;
		return (accno == acc.accno && name == acc.name && balance == acc.balance);

	}

}
