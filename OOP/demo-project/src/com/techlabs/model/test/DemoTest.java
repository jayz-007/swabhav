package com.techlabs.model.test;

import java.util.ArrayList;

import com.techlabs.model.EvenOddNumbers;

public class DemoTest {
	public static void main (String args[]) {
		EvenOddNumbers evenodd = new EvenOddNumbers();
		evenodd.sortNumbers(0,100);
		printNumbers(evenodd.getEvenNumbers(),"Even");
		printNumbers(evenodd.getOddNumbers(),"Odd");
		
	}
	public static void printNumbers(ArrayList<Integer> numbers,String numType) {
		System.out.println(numType);
		for(int i = 0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+ ",");
		}
		System.out.println();
	}

}
