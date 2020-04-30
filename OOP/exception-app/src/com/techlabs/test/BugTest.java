package com.techlabs.test;

public class BugTest {
	public static void main(String args[]) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;

		} catch (NumberFormatException e) {
			System.out.println("Input cannot be character");
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No input passed");
		} finally {
			System.out.println("End main");
		}

	}
}
