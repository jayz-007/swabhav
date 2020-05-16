package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

class LineItemTest {
	Product pen = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "pen", 100, 20f);
	LineItem pens = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 10, pen);

	@Test
	void test_checkIfPens_getUUID() {
		UUID expected = UUID.fromString("9fb01de0-1d63-4d09-9415-90e0b4e93b9a");
		UUID actual = pen.getId();
		assertEquals(expected, actual);
		
	}
	@Test
	void test_checkIfPens_getQuantity_Is10() {
		int expected = 10;
		int actual = pens.getQuantity();
		assertEquals(expected, actual);
	}
	@Test
	void test_checkIfPens_getProduct_equalsPen(){
		Product actual = pen;
		Product expected = pens.getProduct();
		assertEquals(expected, actual);
		
	}
	@Test
	void test_checkIfPens_calculateItemCost_Is800() {
		double expected = 800;
		double actual = pens.calculateItemCost();
		assertEquals(expected, actual);
	}

}
