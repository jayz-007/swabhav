package com.techlabs.model;

public class Game {
	private ResultAnalyzer resultAnalyzer;
	private Player currentPlayer;
	private Player nextPlayer;
	private Board board;
	private ResultType status;

	public Game(Player players[], Board board, ResultAnalyzer resultAnalyzer) {
		this.currentPlayer = players[0];
		this.nextPlayer = players[1];
		this.resultAnalyzer = resultAnalyzer;
		this.board = board;

	}

	public void Play(int num) {
		board.drawMyMark(num, currentPlayer.getPlayerMark());
		status = resultAnalyzer.analyzeResult(num, currentPlayer.getPlayerMark());
		Player temp = currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = temp;

	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public ResultType getStatus() {
		return status;
	}

}
