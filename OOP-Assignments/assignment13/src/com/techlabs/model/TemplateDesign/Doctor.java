package com.techlabs.model.TemplateDesign;

public class Doctor extends Career {

	@Override
	public void createCareer() {
		System.out.println("Career is Doctor");
		
	}

	@Override
	public void showCareerTask() {
		System.out.println("To diagnose and cure patients and develop medicines to cure diseases");
		
	}

	@Override
	public void showEstimatedSalary() {
		System.out.println("salary is 60k - 70k");
		
	}

}
