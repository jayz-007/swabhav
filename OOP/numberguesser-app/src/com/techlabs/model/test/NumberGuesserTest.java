package com.techlabs.model.test;

import com.techlabs.model.NumberGuesser;

public class NumberGuesserTest {
	public static void main (String args[]) {
		NumberGuesser randomnum = new NumberGuesser();
		randomnum.generateRandomn();
		do {
			
			randomnum.guessNo(); 
			randomnum.checkGuessedNo();
			
		}while(randomnum.getQuit()!="yes");
	}

}
