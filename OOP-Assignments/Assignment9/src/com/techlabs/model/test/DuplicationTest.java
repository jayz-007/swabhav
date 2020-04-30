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

class DuplicationTest {

	Inventory inventory = new Inventory();
	boolean expected = false, actual = true;
	GuitarSpec guitar= null;

	@Before
	public void setup() {
		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar whatSimonLikes = inventory.getGuitar("12EW");
	 guitar = whatSimonLikes.getSpec();
		System.out.println("hello");
		
	}

	@Test
	void test_getGuitar_ForWhatSimonLikes_WithStringNumber18() {
		
		if (guitar.getNumStrings() == 18) {
			expected = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	void test_getGuitar_ForWhatSimoLikes_WithBuilderType_Martin() {

		
		if (guitar.getBuilder() == Builder.MARTIN) {
			expected = true;
		}
		assertEquals(expected, actual);

	}

}
