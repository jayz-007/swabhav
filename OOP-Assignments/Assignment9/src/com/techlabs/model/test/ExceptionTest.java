package com.techlabs.model.test;

import com.techlabs.model.exception.Divisibilty;

public class ExceptionTest {
	public static void main(String args[]) {
		int b = 0;
		if (b == 0) {
			try {

				throw new Divisibilty(b);
			} catch (Exception e) {
				System.out.println("Can't Divide by zero /n Number set to 1");
				b = 1;
				System.out.println(10 / b);
			}

		}
		else
			System.out.println("Answer is : "+ 10/b);
	}
}
