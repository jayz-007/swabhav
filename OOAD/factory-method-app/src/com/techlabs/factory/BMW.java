package com.techlabs.factory;

class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Bmw started");

	}

	@Override
	public void stop() {
		System.out.println("Bmw Stopped");

	}

}
