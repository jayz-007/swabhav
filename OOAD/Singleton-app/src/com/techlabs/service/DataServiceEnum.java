package com.techlabs.service;

public enum DataServiceEnum {
	INSTANCE;
	
	public void doSomething() {
		System.out.println("Work done by " + this.hashCode());
	}
	
	

}
