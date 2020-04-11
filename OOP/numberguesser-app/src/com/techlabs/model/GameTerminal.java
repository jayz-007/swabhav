package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private String quit = "no";
	private String result;
	private int guess;
	/*
	 * private final String GREATER = "HIGH"; private final String SMALLER = "LOW";
	 * private final String EQUALS = "EQUALS";
	 */

	public void startGame() {
		System.out.println("Game has not started");
		Game newgame = new Game();
		do {
			setGuess();
			checkGuessedNum(newgame);

		} while (this.quit == "no");

	}

	public void checkUserAnswer() {

		System.out.println("Do you want to quit? yes or no");
		Scanner sc = new Scanner(System.in);
		String decission = sc.next();
		switch (decission) {
		case "no":
			quit = "no";
			break;
		case "yes":
			quit = "yes";
			break;
		}

	}

	public void checkGuessedNum(Game newgame) {

		result = newgame.checkGuessedNo(guess);
		switch (result) {
		case "HIGH":
			System.out.println("Number is greater than actual value");
			System.out.println("Game in Progress");
			break;
		case "LOW":
			System.out.println("Number is less than actual value");
			System.out.println("Game in Progress");
			break;
		case "EQUAL":
			System.out.println("Number is equal to actual value \nNumber of guesses made: " + newgame.getAttemptsMade()
					+ "\nScore is " + newgame.getScore());
			System.out.println("Game has ended");

			checkUserAnswer();
			newgame.generateRandomn();

		}
	}

	public void setGuess() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		guess = (sc.nextInt());

	}

}
