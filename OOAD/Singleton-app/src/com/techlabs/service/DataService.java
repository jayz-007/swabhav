package com.techlabs.service;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class DataService {
	private static DataService bucket;

	private DataService() {
		System.out.println("Service created");
	}
	
	public void doSomething() {
		System.out.println("work done by "+ this.hashCode());
	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
			return bucket;
		}
		return bucket;
	}

}
