package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private List<IBalanceObserver> observers = new ArrayList<IBalanceObserver>();

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
		for(IBalanceObserver observer : observers) {
			observer.update(this);
		}
	}

	public void withdraw(double amount) {
		if (this.balance - amount > 0) {
			this.balance = this.balance - amount;
			for(IBalanceObserver observer : observers) {
				observer.update(this);
			}
	
		}}

	public void addBalanceObserver(IBalanceObserver observer) {
		observers.add(observer);
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
