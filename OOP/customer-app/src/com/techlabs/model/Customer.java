package com.techlabs.model;

public class Customer {
	private String id  ;
	private String name;
	private int orders;
	private static int count ;
	
	
	static {
		count = 1000;
		
	}
	
	public Customer(String name , int orders) {
		this.name = name;
		this.orders= orders;
		this.id = "C"+ String.valueOf(++count);
		
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
