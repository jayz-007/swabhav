package com.techkabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

class SavingAccountTest {

	@Test
	void test_BalanceEquals1200_ForInitialBalance100_Deposite200() throws ParseException {

		Account sa = new SavingAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		sa.deposit(200);
		assertEquals(1200, sa.getBalance());
	}

	@Test
	void test_BalanceEquals1000_ForInitialBalance100_AmountWithdrwan200() throws ParseException {

		Account sa = new SavingAccount(1, "abc", 1000, "10/12/2009", "02/18/1989");
		sa.withdraw(200);
		assertEquals(1000, sa.getBalance());
	}

	@Test
	void test_BalanceEquals1100_ForInitialBalance1300_AmountWithdrwan200() throws ParseException {

		Account sa = new SavingAccount(1, "abc", 1300, "10/12/2009", "02/18/1989");
		sa.withdraw(200);
		assertEquals(1100, sa.getBalance());
	}

	@Test
	void test_BalanceEquals1100_ForInitialBalance1100() throws ParseException {

		Account sa = new SavingAccount(1, "abc", 1100, "10/12/2009", "02/18/1989");
		assertEquals(1100, sa.getBalance());
	}

	@Test
	void test_AccountTypeIS_CurrentAccount() throws ParseException {

		Account sa = new SavingAccount(1, "abc", 1100, "10/12/2009", "02/18/1989");

		assertEquals("Saving Account", sa.getAccountType());
	}

}
