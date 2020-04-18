package com.techlabs.model;

import java.awt.List;
import java.util.ArrayList;

public class EvenOddNumbers {
	ArrayList<Integer> even=new ArrayList<Integer>();
	ArrayList<Integer> odd=new ArrayList<Integer>();
	
	public void sortNumbers(int MIN_BOUND,int MAX_BOUND) {
		for(int i = MIN_BOUND;i<=MAX_BOUND;i++) {
			if(findIsEvenOrOdd(i)=="even") {
				even.add(i);
			}
			else
				odd.add(i);
		}
	}
	public String findIsEvenOrOdd(int number) {
		if(number%2 == 0) 
			return "even";
		return "odd";
		
	}
	
	
	
	public ArrayList<Integer> getEvenNumbers() {
		return even;
	}
	
	public ArrayList<Integer> getOddNumbers() {
		return odd;
	}
	
	

}
