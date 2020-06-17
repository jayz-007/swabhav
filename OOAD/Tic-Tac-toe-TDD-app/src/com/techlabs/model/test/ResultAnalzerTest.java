package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;
import com.techlabs.model.ResultAnalyzer;
import com.techlabs.model.ResultType;

class ResultAnalzerTest {
	Board board = new Board();
	ResultAnalyzer result = new ResultAnalyzer(board);

	@Test
	void test_checkProgress() {
		
		result.getBoard().drawMyMark(1, Mark.X);
		System.out.println(result.analyzeResult(1, Mark.X));
		result.getBoard().drawMyMark(2, Mark.X);
		System.out.println(result.analyzeResult(2, Mark.X));
		result.getBoard().drawMyMark(3, Mark.X);
		System.out.println(result.analyzeResult(3, Mark.X));
		String expected = "PROGRESS";
		ResultType actual = result.getResult();
		assertEquals(expected, actual);
		System.out.println();

	}

	@Test
	void test_checkWin() {
		result.getBoard().drawMyMark(1, Mark.X);
		System.out.println(result.analyzeResult(1, Mark.X));
		result.getBoard().drawMyMark(2, Mark.X);
		System.out.println(result.analyzeResult(2, Mark.X));
		result.getBoard().drawMyMark(0, Mark.X);
		System.out.println(result.analyzeResult(0, Mark.X));
		String expected = "WIN";
		ResultType actual = result.getResult();
		assertEquals(expected, actual);
		System.out.println();

	}

	@Test
	void test_checkDraw() {
		result.getBoard().drawMyMark(0, Mark.X);
		System.out.println(result.analyzeResult(0, Mark.X));

		result.getBoard().drawMyMark(1, Mark.O);
		System.out.println(result.analyzeResult(1, Mark.O));

		result.getBoard().drawMyMark(2, Mark.X);
		System.out.println(result.analyzeResult(2, Mark.X));

		result.getBoard().drawMyMark(3, Mark.O);
		System.out.println(result.analyzeResult(3, Mark.O));

		result.getBoard().drawMyMark(5, Mark.X);
		System.out.println(result.analyzeResult(5, Mark.X));

		result.getBoard().drawMyMark(4, Mark.O);
		System.out.println(result.analyzeResult(4, Mark.O));

		result.getBoard().drawMyMark(6, Mark.X);
		System.out.println(result.analyzeResult(6, Mark.X));

		result.getBoard().drawMyMark(8, Mark.O);
		System.out.println(result.analyzeResult(8, Mark.O));


		result.getBoard().drawMyMark(7, Mark.X);
		System.out.println(result.analyzeResult(7, Mark.X));

		String expected = "DRAW";
		ResultType actual = result.getResult();
		assertEquals(expected, actual);

	}

}
