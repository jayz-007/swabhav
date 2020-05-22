  
package com.techlabs.model.ISP;

public class Cat implements IPet {

	@Override
	public void feed() {
		System.out.println("Feeding Dog");

	}

	@Override
	public void groom() {
		System.out.println("Grooming Dog");

	}

}