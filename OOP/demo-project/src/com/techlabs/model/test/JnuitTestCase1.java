package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.EvenOddNumbers;

class JnuitTestCase1 {

	@Test
	void  test_getEvenNos_From0To10_Return6EvenNos()  {
		EvenOddNumbers evenOddNum = new EvenOddNumbers();
		evenOddNum.sortNumbers(0, 10);
		int[] expectedOddNos = {0,2,4,6,8,10};
		int[] actualOddNos = new int[evenOddNum.getEvenNumbers().size()];
		for(int i=0;i<evenOddNum.getEvenNumbers().size();i++) {
			actualOddNos[i]= evenOddNum.getEvenNumbers().get(i);
		}
		assertArrayEquals(expectedOddNos, actualOddNos);
		
	}
	
	
	
	
	
	

}
