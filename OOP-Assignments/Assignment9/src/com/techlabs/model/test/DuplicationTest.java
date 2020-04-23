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
	
@Before 
public GuitarSpec setup() {
	inventory.addGuitar("12EW", 15000,
			new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
	Guitar whatSimonLikes = inventory.getGuitar("12EW");
	GuitarSpec guitar = whatSimonLikes.getSpec();
	return guitar;
}
	
	
	
	
	@Test
	void test_checkPriceIs15000_ForWhatSimonLikes_WithBuilderType_Martin() {
		GuitarSpec guitar = setup();
		if(guitar.getNumStrings()==18) {
			 expected = true;
		}
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void test_checkPriceIs15000_ForWhatSimoLikes_WithBuilderType_Martin() {
		
		GuitarSpec guitar = setup();
		if(guitar.getBuilder()==Builder.MARTIN) {
			 expected = true;
		}
		assertEquals(expected, actual);
		
		
	}
	
	
	
	

}
