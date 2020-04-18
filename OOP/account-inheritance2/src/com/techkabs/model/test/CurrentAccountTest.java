package com.techkabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

class CurrentAccountTest {

	@Test
	void test_BalanceEqualsNegative4999_ForInitialBalance1000_Withdrawn5999() throws ParseException {

		Account ca = new CurrentAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		ca.withdraw(5999);
		assertEquals(-4999, ca.getBalance());
	}

	@Test
	void test_BalanceEqualsNegative1000_ForInitialBalance1000_Withdrawn5000() throws ParseException {

		Account ca = new CurrentAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		ca.withdraw(7000);
		assertEquals(1000, ca.getBalance());
	}

	@Test
	void test_BalanceEquals2000_ForInitialBalance1000_Despoited1000() throws ParseException {

		Account ca = new CurrentAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		ca.deposit(1000);
		assertEquals(2000, ca.getBalance());
	}

	@Test
	void test_BalanceEquals2000_ForInitialBalance2000() throws ParseException {

		Account ca = new CurrentAccount(1, "abc", 2000, "10/12/2009", "02/18/1989");
		assertEquals(2000, ca.getBalance());
	}

	@Test
	void test_AccountTypeIS_CurrentAccount() throws ParseException {

		Account ca = new CurrentAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		assertEquals("Current Account", ca.getAccountType());
	}

}
