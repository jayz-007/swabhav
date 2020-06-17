package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Cell;
import com.techlabs.model.Mark;

class CellTest {
	Cell one = new Cell();

	@Test
	void test_ifInitialMarkIs_Empty() {
		Mark expected = Mark.Empty;
		Mark actual = one.getMark();
		assertEquals(expected, actual);
	}
	@Test
	void Test_IfDrawMyMarkCalledOnEmptyMark_makesMarkX_forIMarkX() {
		one.checkMark(Mark.X);
		Mark expected = Mark.X;
		Mark actual = one.getMark();
		assertEquals(expected, actual);
	}
	@Test
	void Test_IfDrawMyMarkCalledOnAlreadyMarkedCellAsIMarkX_doesNotChange()  {
		try {
			one.checkMark(Mark.X);
			one.checkMark(Mark.O);
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	
		
	}

}
