package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;

class BoardTest {
	Board board = new Board();

	@Test
	void test_SizeOfBoard_isNine() {
		int expected = 3;
		int actual = board.getCell().length;
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	@Test
	void Test_allCellsAreEmpty_WhenBoardIsCreated() {
		boolean expected = true;
		boolean actual = false;
		int count = 0;
		for (int i = 0; i < board.getCell().length; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board.getCell()[i][j].getMark().equals(Mark.Empty)))
					count++;
				if (count == board.getCell().length - 1)
					actual = true;
			}
		}

		assertEquals(expected, actual);
	}

	@Test
	void Test_checkPositionAlreadyMarkedAsX_remainsSame() {
		try {
			board.drawMyMark(1, Mark.O);
			board.drawMyMark(1, Mark.X);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Mark expected = Mark.O;
		Mark actual = board.getCell()[0][1].getMark();
		assertEquals(expected, actual);
	}

}
