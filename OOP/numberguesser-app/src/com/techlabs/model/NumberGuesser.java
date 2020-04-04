package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	private int guessno;
	private int randomno;
	private String quit;

	public void generateRandomn() {
		Random rn = new Random();
		randomno = rn.nextInt(100) ;

	}

	public void guessNo() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		this.guessno = sc.nextInt();
	}

	public void checkGuessedNo() {
		if (guessno > randomno) {
			System.out.println("Number is greater than actual value");
		}
		if (guessno < randomno) {
			System.out.println("Number is less than actual value");
		} else if(guessno == randomno) {
			System.out.println("Number is equal to actual value");
			checkUserAnswer();
		}
	}
	
	public void checkUserAnswer() {
		
		System.out.println("Do you want to quit? yes or no");
		Scanner sc = new Scanner(System.in);
		String decission = sc.next();
		switch(decission) {
		case "no": quit = "no";
		case "yes": quit = "yes";
		}
	}
	
	public String getQuit() {
		return quit;
	}

}
