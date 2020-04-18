package com.techlabs.model;

public class CustomerDB implements ICrudable {

	@Override
	public void Create() {
		System.out.println("Creating Customer");
	}

	@Override
	public void Read() {
		System.out.println("Reading Customer");
	}

	@Override
	public void Update() {
		System.out.println("Updating Customer");
		
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Customer");
		
	}

}
