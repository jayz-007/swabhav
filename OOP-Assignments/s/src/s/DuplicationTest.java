package s;

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
	@Before
	public void setup(){
		Inventory inventory = new Inventory();
		boolean expected = false, actual = true;

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar whatSimonLikes = inventory.getGuitar("12EW");
		GuitarSpec guitar = whatSimonLikes.getSpec();
	}
	@Test
	void test_checkPriceIs15000_ForWhatSimonLikes_WithBuilderType_Martin() {
		
	
		if(guitar.getBuilder()==Builder.MARTIN) {
			 expected = true;
		}
		assertEquals(expected, actual);
	}
	
	@Test
	void test_checkPriceIs15000_ForWhatSimonLikes_WithSerialNum12EW() {
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

}
