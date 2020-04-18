package com.techlabs.model;

public class OrderDB implements ICrudable {

	@Override
	public void Create() {
		System.out.println("Creating Order");
		
	}

	@Override
	public void Read() {
		System.out.println("Reading Order");
		
	}

	@Override
	public void Update() {
		System.out.println("Updating Order");
		
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Order");
		
	}

}
