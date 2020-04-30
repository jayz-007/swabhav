package com.techlabs.model.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.model.guitar.Builder;
import com.techlabs.model.guitar.Instrument;
import com.techlabs.model.guitar.InstrumentSpec;
import com.techlabs.model.guitar.InstrumentType;
import com.techlabs.model.guitar.Inventory;
import com.techlabs.model.guitar.Type;
import com.techlabs.model.guitar.Wood;

public class GuitarTest {

		public static void main(String[] args) {
			Inventory inventory = new Inventory();
			initializeInventory(inventory);

			Map properties = new HashMap();
			properties.put("builder", Builder.GIBSON);
			properties.put("backWood", Wood.MAPLE);
			InstrumentSpec clientSpec = new InstrumentSpec(properties);

			List matchingInstruments = (List) (inventory.search(clientSpec));
			if (!matchingInstruments.isEmpty()) {
				System.out.println("You might like these instruments:");

				for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
					Instrument instrument = (Instrument) i.next();
					InstrumentSpec spec = instrument.getSpec();
					System.out.println("We have a "
							+ spec.getProperty("instrumentType")
							+ " with the following properties:");
					for (Iterator j = spec.getProperties().keySet().iterator(); j
							.hasNext();) {
						String propertyName = (String) j.next();
						if (propertyName.equals("instrumentType"))
							continue;
						System.out.println("   " + propertyName + ": "
								+ spec.getProperty(propertyName));
					}
					System.out.println(" You can have this "
							+ spec.getProperty("instrumentType") + " for $"
							+ instrument.getPrice() + "\n---");

				}
			} else {
				System.out.println("Sorry, we have nothing for you.");

			}
		}

		private static void initializeInventory(Inventory inventory) {
			Map properties = new HashMap();
			properties.put("instrumentType", InstrumentType.GUITAR);
			properties.put("builder", Builder.COLLINGS);
			properties.put("model", "CJ");
			properties.put("type", Type.ACOUSTIC);
			properties.put("numStrings", 6);
			properties.put("topWood", Wood.INDIAN_ROSEWOOD);
			properties.put("backWood", Wood.SITKA);
			inventory.addInstrument("11277", 3999.95,
					new InstrumentSpec(properties));

			properties.put("builder", Builder.MARTIN);
			properties.put("model", "D-18");
			properties.put("topWood", Wood.MAHOGANY);
			properties.put("backWood", Wood.ADIRONDACK);
			inventory.addInstrument("122784", 5699.95, new InstrumentSpec(
					properties));

			properties.put("builder", Builder.FENDER);
			properties.put("model", "Stratocastor");
			properties.put("type", Type.ELECTRIC);
			properties.put("topWood", Wood.ALDER);
			properties.put("backWood", Wood.ALDER);
			inventory.addInstrument("V9512", 1549.95,
					new InstrumentSpec(properties));

			properties.put("builder", Builder.GIBSON);
			properties.put("model", "Les Paul");
			properties.put("topWood", Wood.MAPLE);
			properties.put("backWood", Wood.MAPLE);
			inventory.addInstrument("709512", 2299.95, new InstrumentSpec(
					properties));

			properties.put("model", "SG '61 Reissue");
			properties.put("topWood", Wood.MAHOGANY);
			properties.put("backWood", Wood.MAHOGANY);
			inventory.addInstrument("8279512", 1890.95, new InstrumentSpec(
					properties));

			properties.put("instrumentType", InstrumentType.MANDOLIN);
			properties.put("type", Type.ACOUSTIC);
			properties.put("model", "F-5G");
			properties.put("topWood", Wood.MAPLE);
			properties.put("backWood", Wood.MAPLE);
			properties.remove("numStrings");
			inventory.addInstrument("90199277", 5495.95, new InstrumentSpec(
					properties));

			properties.put("instrumentType", InstrumentType.BANJO);
			properties.put("model", "RB-3 Wreath");
			properties.remove("topWood");
			properties.put("numStrings", 5);
			inventory.addInstrument("890077", 2495.95, new InstrumentSpec(
					properties));
		}
	}

