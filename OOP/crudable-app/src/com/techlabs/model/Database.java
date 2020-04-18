package com.techlabs.model;

public class Database {
	public void doOperations(ICrudable obj) {
		obj.Create();
		obj.Read();
		obj.Update();
		obj.Delete();
	}

}
