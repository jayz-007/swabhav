package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private int guessno;
	private int randomno;
	private int guessesmade = 0 ;

	public void generateRandomn() {
		Random rn = new Random();
		randomno = rn.nextInt(100) ;

	}

	public void guessNo(Integer guessno) {
		
		this.guessno = guessno;
	}

	public boolean checkGuessedNo() {
		if (guessno > randomno) {
			System.out.println("Number is greater than actual value");
			guessesmade ++;
			return false;
		}
		if (guessno < randomno) {
			System.out.println("Number is less than actual value");
			guessesmade ++;
			return false;
		} else if(guessno == randomno) {
			guessesmade ++;
			System.out.println("Number is equal to actual value \nNumber of guesses made: " + this.guessesmade) ;
			return true;
		}
		return false;
	}
	
	public void incrementguessmade() {
		guessesmade ++;
	}
	
	
	

}
