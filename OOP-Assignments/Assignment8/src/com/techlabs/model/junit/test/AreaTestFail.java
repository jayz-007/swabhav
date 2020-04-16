package com.techlabs.model.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.junit.JUnit;

class AreaTestFail {

	@Test
	void test() {
		JUnit testcase = new JUnit();
		assertEquals(32, testcase.areaOfRectangle(5, 6));
	}

}
