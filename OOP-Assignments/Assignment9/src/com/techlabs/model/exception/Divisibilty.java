package com.techlabs.model.exception;

public class Divisibilty extends Exception {
	int a;

	public Divisibilty(int b) {
		if (b == 0) {
			a = b;
		}
	}

	public String toString() {
		return ("Can't Divide by   " + a);
	}
}
