package com.techlabs.model.TemplateDesign.test;

import com.techlabs.model.TemplateDesign.Career;
import com.techlabs.model.TemplateDesign.Doctor;
import com.techlabs.model.TemplateDesign.Engineer;

public class Test {
	public static void main (String args[]) {
		Career engineer = new Engineer();
		engineer.createCareer();
		engineer.showCareerTask();
		engineer.showEstimatedSalary();
		System.out.println();
		
		Career doctor = new Doctor();
		doctor.createCareer();
		doctor.showCareerTask();
		doctor.showEstimatedSalary();
	}

}
