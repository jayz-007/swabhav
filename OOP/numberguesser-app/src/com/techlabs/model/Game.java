package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private int guessno;
	private int randomno;
	private int guessesmade = 0;

	public void generateRandomn() {
		Random rn = new Random();
		randomno = rn.nextInt(100);

	}

	public void guessNo(Integer guessno) {

		this.guessno = guessno;
	}

	public int checkGuessedNo() {
		if (guessno > randomno) {

			incrementguessMade();
			return 1;
		}
		if (guessno < randomno) {

			incrementguessMade();
			return 2;
		} else if (guessno == randomno) {
			incrementguessMade();

			return 3;
		}
		return 0;
	}

	public void incrementguessMade() {
		guessesmade++;
	}

	public void resetGuessMade() {
		guessesmade = 0;

	}

	public int getGuessMade() {
		return guessesmade;
	}

}
