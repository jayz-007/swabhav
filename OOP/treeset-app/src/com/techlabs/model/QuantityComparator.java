package com.techlabs.model;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem item1, LineItem item2) {
		if (item1.getQuantity() > item2.getQuantity())
			return 1;
		if (item1.getQuantity() < item2.getQuantity())
			return -1;

		return 0;
	}
	

}
