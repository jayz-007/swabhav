package com.techlabs.model.test;

import java.util.Iterator;

import com.techlabs.model.guitar.Builder;
import com.techlabs.model.guitar.Guitar;
import com.techlabs.model.guitar.GuitarSpec;
import com.techlabs.model.guitar.Inventory;
import com.techlabs.model.guitar.Type;
import com.techlabs.model.guitar.Wood;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		boolean expected = false, actual = true;

		Inventory inventory = new Inventory();

		inventory.addGuitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		Guitar guitar = new Guitar("12EW", 15000,
				new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER));
		GuitarSpec searchspec = new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 18, Wood.ADIRONDACK, Wood.ALDER);
		List simon = (List)inventory.search(searchspec);
		if (!simon.isEmpty()) {
			System.out.println("Ram, you might like this guitars:");

			for (Iterator i = simon.iterator(); i.hasNext();) {
				Guitar guitar1 = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				if(spec.getNumStrings()==18);
				{
					expected = true;
					System.out.println(expected);
				}
				

			}
		}
		System.out.println("List empty");
		System.out.println(expected);
	}
}
