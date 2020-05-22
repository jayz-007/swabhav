
package com.techlabs.dependencyinversionprinciple.model;

public class FrontendDeveloper implements IDeveloper {

	@Override
	public void develop() {
		System.out.println("Frontend Developer is developing app");

	}

}