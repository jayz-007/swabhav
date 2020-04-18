package com.techlabs.model;

public class AddressDB  implements ICrudable{

	@Override
	public void Create() {
		System.out.println("Creating Address");
		
	}

	@Override
	public void Read() {
		System.out.println("Reading Address");		
	}

	@Override
	public void Update() {
		System.out.println("Updating Address");
		
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Address");
		
	}

}
