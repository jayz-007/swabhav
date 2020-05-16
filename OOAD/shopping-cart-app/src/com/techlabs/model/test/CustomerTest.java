package com.techlabs.model.test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

class CustomerTest {
	Product pen = new Product("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "pen", 100, 20f);
	LineItem pens = new LineItem("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", 10, pen);
	Order order1 = new Order("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "12/2/2019");

	Customer jay = new Customer("9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "jay", "mumbai");

	@Before
	void setup() {
		order1.addItem(pens);
		jay.addOrder(order1);
	}

	@Test
	void test_checkIfJay_getUUID() {
		UUID expected = UUID.fromString("9fb01de0-1d63-4d09-9415-90e0b4e93b9a");
		UUID actual = pen.getId();
		assertEquals(expected, actual);

	}

	@Test
	void test_checkIfJay_getName_isJay() {
		String expected = "jay";
		String actual = jay.getName();
		assertEquals(expected, actual);

	}

	@Test
	void test_checkIfJay_getAddress_isMumbai() {
		String expected = "mumbai";
		String actual = jay.getAddress();
		assertEquals(expected, actual);

	}

	

}
