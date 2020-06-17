package com.techlabs.model;

public class Player {
	private String playerName;
	private Mark playerMark;

	public Player(String playerName, Mark playerMark) {
		this.playerName = playerName;
		this.playerMark = playerMark;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Mark getPlayerMark() {
		return playerMark;
	}

}
