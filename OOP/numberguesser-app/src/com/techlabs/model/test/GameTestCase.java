package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Game;

class GameTestCase {

	@Test
	void test_GetStateLOW_ForInput1LessThanRandomNum_ReturnLOW() {
		Game g = new Game();
		g.generateRandomn();
		int smaller = g.getRadnomNum() - 1;
		String actualState = g.checkGuessedNo(smaller);
		String expectedState = "LOW";
		assertEquals(expectedState, actualState);

	}

	@Test
	void test_GetStateHigh_ForInput1GreaterThanRandomNum_ReturnHIGH() {
		Game g = new Game();
		g.generateRandomn();
		int greater = g.getRadnomNum() + 1;
		String actualState = g.checkGuessedNo(greater);
		String expectedState = "HIGH";
		assertEquals(expectedState, actualState);

	}

	@Test
	void test_GetStateEQUALS_ForInputEqualToThanRandomNum_ReturnEQUALS() {
		Game g = new Game();
		g.generateRandomn();
		int equals = g.getRadnomNum();
		String actualState = g.checkGuessedNo(equals);
		String expectedState = "EQUAL";
		assertEquals(expectedState, actualState);

	}

}
