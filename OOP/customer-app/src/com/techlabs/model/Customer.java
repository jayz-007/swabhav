package com.techlabs.model;

public class Customer {
	private String id  ;
	private String name;
	private int orders;
	private static int incrementid ;
	
	
	static {
		incrementid = 0;
		
	}
	
	public Customer(String name , int orders) {
		this.name = name;
		this.orders= orders;
		incrementid++;
		this.id = "C"+ (1000 + incrementid);
		
	}
	
	public String getId() {
		return id;
	}
	
	public int orders () {
		return orders;
	}
	public String getName() {
		return name;
	}

}
