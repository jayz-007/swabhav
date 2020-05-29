package com.gsf.board;

import java.util.ArrayList;
import java.util.List;

import com.gsf.unit.Unit;

public class Board {

	private int width, height;
	private List tiles;

	public Tile getTile(int x, int y) {
		return (Tile) ((ArrayList) tiles.get(x - 1)).get(y - 1);
	}

	public void addUnit(Unit unit, int x, int y) {
		Tile tile = getTile(x, y);
		tile.addUnit(unit);
	}

	public void removeUnit(Unit unit, int x, int y) {
		Tile tile = getTile(x, y);
		tile.removeUnit(unit);
	}

	public void removeUnits(int x, int y) {
		Tile tile = getTile(x, y);
		tile.removeUnits();
	}

	public List getUnits(int x, int y) {
		return getTile(x, y).getUnits();
	}
}