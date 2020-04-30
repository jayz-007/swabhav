package com.techlabs.model;

public class Account {
	private double balance;
	private static int MINIMUM_BALANCE = 500;
	private static int TOTAL_TRANSACTIONS = 0;
	private int Id;
	private String name;

	/*
	 * static { MINIMUM_BALANCE = 500 ; TOTAL_TRANSACTIONS = 0; }
	 */

	public Account(int Id, String name, double balance) {
		this.balance = balance;
		this.Id = Id;
		this.name = name;

	}

	public void withdraw(double amt) {
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
			TOTAL_TRANSACTIONS++;
		} else {
			throw new RuntimeException();
		}
	}

	public void deposit(double amt) {
		balance = balance + amt;
		TOTAL_TRANSACTIONS++;
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
	
	public String getName() {
		return name;
	}
	
	public int getAccNo() {
		return Id;
	}

}
