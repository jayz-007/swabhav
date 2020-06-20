package com.techlabs.model;

import java.util.Scanner;

public class GameUI {
	
		public void startGame() {
			System.out.println("Enter player1 name");
			Scanner player1 = new Scanner(System.in);
			System.out.println("Enter player2 name");
			Scanner player2 = new Scanner(System.in);
			Game newGame = new Game(
					new Player[] { new Player(player1.nextLine(), Mark.X), new Player(player2.nextLine(), Mark.O) },
					new ResultAnalyzer(new Board()));
			Scanner mark = new Scanner(System.in);
			do {
				System.out.println((newGame.getCurrentPlayer().getPlayerName() + " enter a number to draw mark"));
				int num = Integer.parseInt(mark.nextLine());
				newGame.Play(num);
			} while (newGame.getStatus().equals(ResultType.PROGRESS));
			System.out.println(newGame.getNextPlayer().getPlayerName() + " Won the game");

		}

	}
