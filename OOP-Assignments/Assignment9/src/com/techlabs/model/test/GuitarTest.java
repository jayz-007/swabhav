package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.guitar.Builder;
import com.techlabs.model.guitar.Guitar;
import com.techlabs.model.guitar.GuitarSpec;
import com.techlabs.model.guitar.Inventory;
import com.techlabs.model.guitar.Type;
import com.techlabs.model.guitar.Wood;

class GuitarTest {

	boolean expected = false, actual = true;

	@Before
	public Guitar setup() {
		GuitarSpec spec = new GuitarSpec(Builder.ANY, "Hollow", Type.ACOUSTIC, 6, Wood.ADIRONDACK, Wood.ADIRONDACK);
		Guitar guitar = new Guitar("121EW", 18500, spec);

		return guitar;
	}

	@Test
	void test_checkPriceIs18500_ForGuitar() {
		Guitar guitar = setup();
		if (guitar.getPrice() == 18500) {
			expected = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	void test_checkPrice_ForGuitar_priceChangedTo15000() {

		Guitar guitar = setup();
		guitar.setPrice(15000);
		if (guitar.getPrice() == 15000) {
			expected = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	void test_checkSerialNumberIs121EW_ForGuitar() {

		Guitar guitar = setup();
		if (guitar.getSerialNum() == "121EW") {
			expected = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	void test_checkGuitarIsPresent_ForSerialNumber132WE_resultNotPresent() {

		Guitar guitar = setup();
		if (guitar.getSerialNum() != "132WE") {
			expected = true;
		}
		assertEquals(expected, actual);

	}
	


}
