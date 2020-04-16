package com.techlabs.model.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.junit.JUnit;

class AreaTestPass {

	@Test
	void test() {
		
		JUnit testcase = new JUnit();
		assertEquals(30, testcase.areaOfRectangle(5, 6));
	}

}
