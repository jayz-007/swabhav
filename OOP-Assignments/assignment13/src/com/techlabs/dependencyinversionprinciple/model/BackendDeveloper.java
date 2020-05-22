package com.techlabs.dependencyinversionprinciple.model;

public class BackendDeveloper implements IDeveloper {

	@Override
	public void develop() {
		System.out.println("Backend Developer is developing app");

	}

}