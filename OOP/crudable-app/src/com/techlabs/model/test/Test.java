package com.techlabs.model.test;

import com.techlabs.model.AddressDB;
import com.techlabs.model.CustomerDB;
import com.techlabs.model.Database;
import com.techlabs.model.OrderDB;

public class Test {
	public static void main(String args[]) {
		Database db = new Database();
		db.doOperations(new OrderDB());
		db.doOperations(new AddressDB());
		db.doOperations(new CustomerDB());
	}

}
