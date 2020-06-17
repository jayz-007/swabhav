package com.techlabs.model;

public class Board {
	private Cell[][] cells;

	public Board() {
		this.cells = new Cell[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cells[i][j] = new Cell();
			}
		}
	}

	public void drawMyMark(int cellPosition, Mark mark) {
		int row = cellPosition/3;
		int column = cellPosition%3;
		try {
			cells[row][column].checkMark(mark);

		} catch (Exception e) {

		}
	}

	public Cell[][] getCell() {
		return cells;
	}

}
