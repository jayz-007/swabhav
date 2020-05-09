package com.techlabs.model;

public class ClassA {
	private IDecoupling decoupling;

	public ClassA(IDecoupling decoupling) {
		this.decoupling = decoupling;
	}

	public void bar() {
		decoupling.foo();
	}

}
