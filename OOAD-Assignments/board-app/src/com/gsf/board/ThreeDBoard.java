package com.gsf.board;

import java.util.ArrayList;
import java.util.List;

import com.gsf.unit.Unit;

public class ThreeDBoard {

	public List boards = new ArrayList();
	private int z;

	public Tile getTile(int x, int y, int z) {

		Board b = (Board) boards.get(z);
		return b.getTile(x, y);
	
	}

	public void addUnit(Unit unit, int x, int y, int z) {
		Tile tile = getTile(x, y, z);
		tile.addUnit(unit);
	}

	public void removeUnit(Unit unit, int x, int y, int z) {
		Tile tile = getTile(x, y, z);
		tile.removeUnit(unit);
	}

	public void removeUnits(int x, int y, int z) {
		Tile tile = getTile(x, y, z);
		tile.removeUnits();
	}

	public List getUnits(int x, int y, int z) {
		return getTile(x, y, z).getUnits();
	}
}