package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.EvenOddNumbers;

class JunitTestCase2 {

	@Test
	void test_getOddNos_From0To10_Return6OddNos() {
		EvenOddNumbers evenOddNum = new EvenOddNumbers();
		evenOddNum.sortNumbers(0, 10);
		int[] expected = {1,3,5,7,9};
		int[] actual = new int[evenOddNum.getOddNumbers().size()];
		for(int i=0;i<evenOddNum.getOddNumbers().size();i++) {
			actual[i]= evenOddNum.getOddNumbers().get(i);
		}
		assertArrayEquals(expected, actual);
		
	}

}
