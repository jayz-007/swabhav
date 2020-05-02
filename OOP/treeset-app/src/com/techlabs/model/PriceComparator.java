package com.techlabs.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		if (item1.getPrice() > item2.getPrice())
			return 1;
		if (item1.getPrice() < item2.getPrice())
			return -1;

		return 0;
	}

}
