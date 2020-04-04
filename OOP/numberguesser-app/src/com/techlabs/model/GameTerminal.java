package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private String quit = "no";
	private int endgame;

	public void startGame() {
		Game newgame = new Game();
		newgame.generateRandomn();
		do {
			System.out.println("Guess the number");
			Scanner sc = new Scanner(System.in);
			newgame.guessNo(sc.nextInt());

			endgame = newgame.checkGuessedNo();
			switch (endgame) {
			case 1:
				System.out.println("Number is greater than actual value");
				break;
			case 2:
				System.out.println("Number is less than actual value");
				break;
			case 3:
				System.out
						.println("Number is equal to actual value \nNumber of guesses made: " + newgame.getGuessMade());
			}
			if (endgame == 3) {
				{
					checkUserAnswer();
					newgame.generateRandomn();
					newgame.resetGuessMade();
				}
			}

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

}
