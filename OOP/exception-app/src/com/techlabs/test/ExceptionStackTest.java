package com.techlabs.test;

import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionStackTest {
	public static void main(String args[])  {
		try {
			m1();
		} catch (Exception e) {
			System.err.println("Exception in thread \"main\" inside m3");
			e.printStackTrace();
		}
		System.out.println("End main");

	}

	public static void m1() throws IOException {
		System.out.println("Inside m1");
		m2();
	}

	public static void m2() throws IOException  {
		System.out.println("inside m2");
		m3();
	}

	public static void m3() throws IOException  {
		System.out.println("inside m3");
		throw new IOException();
	}
}
