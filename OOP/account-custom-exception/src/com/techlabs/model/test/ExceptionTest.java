package com.techlabs.model.test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.InsufficientFundException;

class ExceptionTest {
	Account acc = new Account(12, "xyz", 1500);
	
	

	@Test
	void test_checkAccountBalancIs1200_forInitialBalance1500_amountDeposited200() {
		acc.deposit(200);
		assertEquals(1700, acc.getBalance());
	}
	
	@Test
	void test_checkAccountBalanceIs800_forInitialBalance1500_amoutWithdrawn200() {
		try {
			acc.withdraw(200);
			assertEquals(1300, acc.getBalance());
			
		} catch (InsufficientFundException e) {
			assertEquals(e.getMessage(), "Account name :" + acc.getName() + " has account balance :" + acc.getBalance()
				+ " tried to withdraw ammount which cannot be done since the minimum balance has to be maintained 500");
		}
		
	}
	
	@Test
	void test_getInsufficientFundException_forInitialBalance1500_amoutWithdrawn600() {
		try {
			acc.withdraw(1000);
			assertEquals(500, acc.getBalance());
			
		} catch (InsufficientFundException e) {
			assertEquals(e.getMessage(), "Account name :" + acc.getName() + " has account balance :" + acc.getBalance()
				+ " tried to withdraw ammount which cannot be done since the minimum balance has to be maintained 500");
			System.err.println(e.getMessage());
		}
		
	}
	
	@Test
	void test_getAccno() {
		assertEquals(12, acc.getAccNo());
	}
	
	@Test
	void test_getName() {
		assertEquals("xyz", acc.getName());
	}



}
