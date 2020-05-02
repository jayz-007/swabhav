package com.techlabs.model;

public interface SalariedEmployee {
	public static final double SALARY_PERHOUR = 0;
	
	static double salaryCalculator(int hours) {
		return (hours * SALARY_PERHOUR);
	}
	
	public static  double getSalaryPerHour() {
		return SALARY_PERHOUR;
	}
	

}
