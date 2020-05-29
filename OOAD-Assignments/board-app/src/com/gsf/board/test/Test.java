package com.gsf.board.test;

import com.gsf.board.ThreeDBoard;
import com.gsf.board.Tile;
import com.gsf.unit.Unit;

public class Test {

	public static void main(String[] args) {

		ThreeDBoard b = new ThreeDBoard();
		Unit unit = new Unit();
		Tile tile = new Tile();
		b.addUnit(unit, 10, 20, 30);
		b.getTile(10, 20, 30);
	}
}