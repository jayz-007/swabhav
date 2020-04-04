package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private String quit = "no";
	private boolean endgame;

	public void startGame() {
		Game newgame = new Game();
		newgame.generateRandomn();
		do {
			System.out.println("Guess the number");
			Scanner sc = new Scanner(System.in);

			newgame.guessNo(sc.nextInt());
			endgame = newgame.checkGuessedNo();
			if (endgame == true) {
				checkUserAnswer();
			}

		} while (quit != "yes");
	}

	public void checkUserAnswer() {

		System.out.println("Do you want to quit? yes or no");
		Scanner sc = new Scanner(System.in);
		String decission = sc.next();
		switch (decission) {
		case "no":
			quit = "no";
		case "yes":
			quit = "yes";
		}
	}

}
