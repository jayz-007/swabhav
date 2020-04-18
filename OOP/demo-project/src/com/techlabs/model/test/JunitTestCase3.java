package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.EvenOddNumbers;

class JunitTestCase3 {

	@Test
	void test_getOddNos_From0To100_Return50OddNos() {
		EvenOddNumbers evenOddNum = new EvenOddNumbers();
		evenOddNum.sortNumbers(0, 100);
		int expected = 50;
		int actual = evenOddNum.getOddNumbers().size();
		
		assertEquals(expected, actual);
		
	}

}
