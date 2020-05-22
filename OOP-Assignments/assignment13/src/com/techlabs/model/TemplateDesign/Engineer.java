package com.techlabs.model.TemplateDesign;

public class Engineer extends Career {

	@Override
	public void createCareer() {
		System.out.println("Career is Engineer");
		
	}

	@Override
	public void showCareerTask() {
		System.out.println("To design various tools and gadgets to ease human life");
		
	}

	@Override
	public void showEstimatedSalary() {
		System.out.println("Salary is 50k - 60k");
		
	}

}
