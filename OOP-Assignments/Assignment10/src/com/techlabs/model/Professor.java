package com.techlabs.model;

import java.text.ParseException;

public class Professor {
	private double netSalary = 0;
	private final double SALARY_PERHOUR;
	private Person person;

	public Professor(Person person, double salaryPerHour)  {
		this.person = person;
		this.SALARY_PERHOUR = salaryPerHour;
	}

	public void updateSalary(int hours) {
		this.netSalary = salaryCalculator(hours);

	}

	private double salaryCalculator(int hours) {
		return (hours * SALARY_PERHOUR);
	}

	public double getNetSalary() {
		return netSalary;
	}
	
	public double getSalaryPerHour() {
		return SALARY_PERHOUR;
	}
	
	public Person getPerson() {
		return person;
	}

}
