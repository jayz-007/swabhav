package com.techkabs.model.test;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class Test {
	public static void main(String args[]) throws ParseException, IOException {
		Account acc[] = new Account[5];
		acc[0] = new SavingAccount(20, "jay", 2000, "12/13/2020", "01/01/1998");
		acc[1] = new CurrentAccount(10, "vinit", 3000, "12/13/2020", "03/23/1990");
		acc[2] = new CurrentAccount(30, "tanmay", 5000, "12/13/2020", "01/29/1997");
		acc[3] = new SavingAccount(40, "pawan", 3500, "12/13/2020", "09/01/1998");
		acc[4] = new SavingAccount(20, "tejashree", 6000, "12/13/2020", "12/19/1998");

		printInfo(findRichestAccountHolder(acc));
		printInfo(findYoungAccountHolders(acc, 23));
		writeAccountToFile(acc);

	}

	public static void printInfo(Account[] acc) {
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) {
				printInfo(acc[i]);
			}
		}

	}

	public static void printInfo(Account acc) {
		System.out.println("Account no : " + acc.getAccno() + " Account name: " + acc.getName() + " Account balance: "
				+ acc.getBalance() + "Age is: " + acc.getAge());
	}

	public static Account findRichestAccountHolder(Account[] acc) {
		Account richest = acc[0];

		double rich;
		for (int i = 0; i < acc.length; i++) {
			double balance = richest.getBalance();
			if (balance < acc[i].getBalance()) {
				richest = acc[i];
			}
		}
		return richest;
	}

	public static Account[] findYoungAccountHolders(Account[] acc, int age) {
		Account youngest[] = new Account[5];
		for (int i = 0; i < acc.length; i++) {
			if (age > acc[i].getAge()) {
				youngest[i] = acc[i];
			}

		}
		return youngest;

	}

	public static void writeAccountToFile(Account[] acc) throws IOException {
		FileWriter writeline = new FileWriter("Accounts.csv");
		writeline.write("type,accno,name,balanmce,created on , age ");
		writeline.write('\n');
		for (Account account : acc) {
			writeline.write(account.getAccountType() + "," + account.getAccno() + "," + account.getName() + ","
					+ account.getBalance() + "," + account.getCurrentDate() + "," + account.getAge()+"\n");
			writeline.write('\n');
		}
		writeline.close();

	}

}
