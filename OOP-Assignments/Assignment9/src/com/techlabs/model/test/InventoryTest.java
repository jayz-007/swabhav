package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import com.techlabs.model.guitar.Builder;
import com.techlabs.model.guitar.Guitar;
import com.techlabs.model.guitar.GuitarSpec;
import com.techlabs.model.guitar.Inventory;
import com.techlabs.model.guitar.Type;
import com.techlabs.model.guitar.Wood;

class InventoryTest {
	@Test
	void test_getGuitar_ForWhatSimonLikes_WithBuilderType_Martin() {
		Inventory inventory = new Inventory();
		boolean expected = false, actual = true;

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar whatSimonLikes = inventory.getGuitar("12EW");
		GuitarSpec guitar = whatSimonLikes.getSpec();
		if(guitar.getBuilder()==Builder.MARTIN) {
			 expected = true;
		}
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getGuitar_ForWhatSimonLikes_WithSerialNum12EW() {
		Inventory inventory = new Inventory();
		boolean expected = false, actual = true;

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar whatSimonLikes = inventory.getGuitar("12EW");
		if(whatSimonLikes.getPrice()==15000) {
			 expected = true;
		}
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getGuitar_ForWhatSimonLikes_WithNumberOfStrings18() {
		Inventory inventory = new Inventory();
		boolean expected = false, actual = true;

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar whatSimonLikes = inventory.getGuitar("12EW");
		GuitarSpec guitar = whatSimonLikes.getSpec();
		if(guitar.getNumStrings()==18) {
			 expected = true;
		}
		assertEquals(expected, actual);
	}

	@Test
	void test_getGuitar_withSerialNumc11_ReturnGuitar() {

		boolean expected = false, actual = true;

		Inventory inventory = new Inventory();

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar guitar = new Guitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));

		Guitar simon = (inventory.getGuitar("12EW"));
		if (simon.getSerialNum() == "12EW") {
			expected = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	void test_getGuitar_WithGuitarSpecs_whatSimonLikes() {
		boolean expected = false, actual = true;

		Inventory inventory = new Inventory();

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar guitar = new Guitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		GuitarSpec searchspec = new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK,
				Wood.ALDER);
		List whatSimonLikes = inventory.search(searchspec);
		if (!whatSimonLikes.isEmpty()) {
			System.out.println("Ram, you might like this guitars:");

			for (Iterator i = (whatSimonLikes).iterator(); i.hasNext();) {
				Guitar guitar1 = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				if (spec.getBuilder() == Builder.MARTIN && spec.getType() == Type.ACOUSTIC
						&& spec.getModel() == "Stratocastor" && spec.getNumStrings() == 18
						&& spec.getBackWood() == Wood.ADIRONDACK && spec.getTopWood() == Wood.ALDER) {
					expected = true;
				}
			}

		}
		assertEquals(expected, actual);
	}

}
