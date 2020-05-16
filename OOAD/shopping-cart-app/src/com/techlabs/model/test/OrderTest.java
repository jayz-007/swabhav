package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

class OrderTest {
	Product pen = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "pen", 100, 20f);
	LineItem pens = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 10, pen);
	Order order1 = new Order("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "12/2/2019");

	@Before
	void setup() {
		order1.addItem(pens);
	}

	@Test
	void test_checkIfPen_getUUID() {
		UUID expected = UUID.fromString("9fb01de0-1d63-4d09-9415-90e0b4e93b9a");
		UUID actual = pen.getId();
		assertEquals(expected, actual);
		
	}

}
