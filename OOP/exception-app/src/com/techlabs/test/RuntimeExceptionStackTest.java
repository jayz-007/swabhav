package com.techlabs.test;

import java.io.IOException;

public class RuntimeExceptionStackTest {
	public static void main(String args[])  {
		m1();
		System.out.println("End main");

	}

	public static void m1()  {
		System.out.println("Inside m1");
		m2();
	}

	public static void m2()   {
		System.out.println("inside m2");
		m3();
	}

	public static void m3()  {
		System.out.println("inside m3");
		try {
			throw new IOException();
			
		} catch (Exception e) {
			System.err.println("Exception in thread \"main\" inside m3");
			e.printStackTrace();
			
		}
	}

}
