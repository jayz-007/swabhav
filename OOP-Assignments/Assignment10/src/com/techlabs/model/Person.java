package com.techlabs.model;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
	private int id;
	private String address;
	private Date dob;

	public Person(int id, String address, String dob) {
		this.id = id;
		this.address = address;
		this.dob = validateDate(dob);
		

	}
	
	private Date validateDate(String dob) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date dateOfBirth;
		try {

			dateOfBirth= formatter.parse(dob);
			

		} catch (Exception e) {
			System.out.println("Enter date in mm/dd/yyyy format");
			Scanner sc = new Scanner (System.in);
			 dateOfBirth = validateDate(sc.nextLine());

		}
		return dateOfBirth;
		
	}
	
	public String getAddress() {
		return address;

	}

	public int getId() {
		return id;
	}

	public Date getDateOfBirth() {
		return dob;
	}
}
