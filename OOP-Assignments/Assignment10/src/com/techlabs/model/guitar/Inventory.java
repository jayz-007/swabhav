package com.techlabs.model.guitar;

import java.util.*;

public class Inventory {

	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);

	}

	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	/*
	 * public List search(GuitarSpec searchSpec) { List matchingGuitars = new
	 * LinkedList(); for (Iterator i = inventory.iterator(); i.hasNext();) { Guitar
	 * guitar = (Guitar) i.next(); if (guitar.getSpec().matches(searchSpec))
	 * matchingGuitars.add(guitar); } return matchingGuitars; }
	 * 
	 * public List search(MandolinSpec searchSpec) { List matchingMandolins = new
	 * LinkedList(); for (Iterator i = inventory.iterator(); i.hasNext();) {
	 * Mandolin mandolin = (Mandolin) i.next(); if
	 * (mandolin.getSpec().matches(searchSpec)) matchingMandolins.add(mandolin); }
	 * return matchingMandolins; }
	 */

	public List search(InstrumentSpec searchSpec) {
		List matchingInstruments = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
	}
}