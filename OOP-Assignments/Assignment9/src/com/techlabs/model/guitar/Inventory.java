package com.techlabs.model.guitar;

import java.util.*;

public class Inventory {

	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNum, double price, GuitarSpec spec) {

		Guitar guitar = new Guitar(serialNum, price, spec);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNum) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNum().equals(serialNum)) {
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {
		List matchingGuitars = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}