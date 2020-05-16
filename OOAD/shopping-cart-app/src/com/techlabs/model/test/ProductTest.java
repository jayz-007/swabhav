package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Product;

class ProductTest {
	Product pen = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "pen", 100, 20f);

	@Test
	void test_checkIfPen_getNameIs_Pen() {
		String expected = "pen";
		String actual = pen.getName();
		assertEquals(expected, actual);
	}
	@Test
	void test_checkIfPen_getUUID() {
		UUID expected = UUID.fromString("9fb01de0-1d63-4d09-9415-90e0b4e93b9a");
		UUID actual = pen.getId();
		assertEquals(expected, actual);
		
	}
	@Test
	void test_checkIfPen_getPrice_Is100() {
		double expected = 100;
		double actual = pen.getPrice();
		assertEquals(expected, actual);
	}
	
	@Test
	void test_checkIfPen_getDiscountedPercentage_Is20() {
		float expected = 20f;
		float actual = pen.getDiscountPercentage();
		assertEquals(expected, actual);
	}
	

	@Test
	void test_checkIfPen_totalCost_Is80() {
		double expected = 80;
		double actual = pen.totalCost();
		assertEquals(expected, actual);
	}
	
	

}
