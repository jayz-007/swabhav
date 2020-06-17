package com.techlabs.model;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.Empty;
	}

	public void checkMark(Mark mark) {
		if (this.mark.equals(Mark.Empty)) {
			this.mark = mark;
		} else
			throw new RuntimeException("Place is already marked");
	}

	public Mark getMark() {
		return mark;
	}
	
	

}
