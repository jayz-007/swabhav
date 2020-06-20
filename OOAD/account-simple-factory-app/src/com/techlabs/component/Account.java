package com.techlabs.component;

public abstract class Account {
	protected int accno;
	protected String name;
	protected double amount;
	protected AccountType accountType;

	public Account(AccountType type) {
		this.accountType = type;
	}

	public void setAccNo(int accNo) {
		this.accno = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		this.amount = this.amount + amount;
	}

	public abstract void withdraw(double amount) throws MinimumBalanceException;

	public int getAccno() {
		return accno;
	}

	public String getAccName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public AccountType getType() {
		return accountType;
	}

}
