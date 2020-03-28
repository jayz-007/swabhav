package com.techlabs.model;

public class Account extends Object {
	private int accno;
	private String name;
	private double balance;
	private static int MINIMUM_BALANCE = 500 ;
	private static int TOTAL_TRANSACTIONS = 0;
	
	/*static {
		MINIMUM_BALANCE = 500 ;
		 TOTAL_TRANSACTIONS = 0;
	}*/
	
	public Account(int accno , String name ,double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		
	}
	
	public void withdraw(double amt ) {
		if(balance - amt > MINIMUM_BALANCE) {
			balance = balance- amt;
			TOTAL_TRANSACTIONS++;
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
	
	/*public static int getMinimumBalance() {
		return MINIMUM_BALANCE;
	}*/
	
	public static int getTotalTransactions() {
		return TOTAL_TRANSACTIONS;
	}

	  public String toString() {
		  super.toString();
		String str = super.toString() + "accno" + accno + "\nname: "+ name + "\nbalance: " + balance; 
		
		  return str;
	}

}
