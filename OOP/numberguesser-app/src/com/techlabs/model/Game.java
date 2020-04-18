package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private int randomNumber;
	protected int attemptsMade = 0;
	private int score = 100;
	
	public Game() {
		this.randomNumber=generateRandomn();
		
	}

	public int generateRandomn() {
		Random rn = new Random();
		return rn.nextInt(100);

	}


	public String checkGuessedNo(int userguess) {
		attemptsMade++;
		if (userguess == randomNumber) {

			return "EQUAL";
		}else
			score = score - 10;
		if (userguess < randomNumber){

			return "LOW";
		} else  

			return "HIGH";
		
	}
	
	public int getRadnomNum() {
		return randomNumber;
	}
	
	public int getAttemptsMade() {
		return attemptsMade;
	}
	
	public int getScore() {
		if(score<10)
			return 5;
		return score;
	}
	
	

}
