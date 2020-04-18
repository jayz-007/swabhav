package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.EvenOddNumbers;

class JnuitTestCase4 {

	@Test
	void test_getOddNos_From0To100_Return50EvenNos() {
		EvenOddNumbers evenOddNum = new EvenOddNumbers();
		evenOddNum.sortNumbers(0, 100);
		int expected = 50;
		int actual = evenOddNum.getEvenNumbers().size();
		
		assertEquals(expected, actual);
		
	}

}