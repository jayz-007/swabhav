package com.techlabs.model;

import java.text.ParseException;

public class Professor extends Person  {
	private double netSalary = 0;
	private final double SALARY_PERHOUR;

	

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
