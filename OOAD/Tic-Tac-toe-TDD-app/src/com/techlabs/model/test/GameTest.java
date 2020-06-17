package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyzer;
import com.techlabs.model.ResultType;

class GameTest {
	Board board = new Board();
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
	Game newGame = new Game(new Player[] { new Player("Ram", Mark.X), new Player("Shyam", Mark.O) }, board,
			resultAnalyzer);

	@Test
	void test_checkStatusIs_PROGRESS() {

		newGame.Play(5);
		ResultType expected = ResultType.PROGRESS;
		ResultType actual = newGame.getStatus();
		assertEquals(expected, actual);
	}
	
	@Test
	void test_checkStatusIs_WIN() {

		newGame.Play(5);
		newGame.Play(0);
		newGame.Play(2);
		newGame.Play(1);
		newGame.Play(8);
		ResultType expected = ResultType.WIN;
		ResultType actual = newGame.getStatus();
		assertEquals(expected, actual);
	}
	
	@Test
	void test_checkStatusIs_DRAW() {

		newGame.Play(0);
		newGame.Play(1);
		newGame.Play(2);
		newGame.Play(3);
		newGame.Play(5);
		newGame.Play(4);
		newGame.Play(6);
		newGame.Play(8);
		newGame.Play(7);
		ResultType expected = ResultType.DRAW;
		ResultType actual = newGame.getStatus();
		System.out.println(newGame.getStatus());
		assertEquals(expected, actual);
	}
	
	@Test
	void test_checkCurrentPlayerInitiallyIs_Ram() {

		String actual = newGame.getCurrentPlayer().getPlayerName();
		String expected = "Ram";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_checkCurrentPlayerIsSwitched_toShyam() {

		newGame.Play(5);
		String actual = newGame.getCurrentPlayer().getPlayerName();
		String expected = "Shyam";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test_checkNextPlayerIsSwitched_toRam() {

		newGame.Play(5);
		String actual = newGame.getNextPlayer().getPlayerName();
		String expected = "Ram";
		assertEquals(expected, actual);
		
	}

}
