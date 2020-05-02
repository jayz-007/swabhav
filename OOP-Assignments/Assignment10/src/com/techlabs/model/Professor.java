package com.techlabs.model;

import java.text.ParseException;

public class Professor {
	private double netSalary = 0;
	
	private Person person;

	public Professor(Person person, double salaryPerHour)  {
		this.person = person;
		this.SALARY_PERHOUR = salaryPerHour;
	}

	public void updateSalary(int hours) {
		this.netSalary = salaryCalculator(hours);

	}

	

	public double getNetSalary() {
		return netSalary;
	}
	
	
	
	public Person getPerson() {
		return person;
	}

}
