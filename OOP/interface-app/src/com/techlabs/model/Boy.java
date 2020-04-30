package com.techlabs.model;

public class Boy implements IMannerable, IEmotional {

	@Override
	public void cry() {
		System.out.println("Boy is crying");

	}

	@Override
	public void laughs() {
		System.out.println("Boy is laughin");
	}

	@Override
	public void wish() {
		System.out.println("Boy is wishing");
	}

	@Override
	public void depart() {
		System.out.println("Boy is departing");
	}

}
