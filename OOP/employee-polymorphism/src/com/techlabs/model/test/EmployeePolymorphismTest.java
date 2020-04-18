package com.techlabs.model.test;

import com.techlabs.model.Analyst;
import com.techlabs.model.Developer;
import com.techlabs.model.Employee;
import com.techlabs.model.Manager;

public class EmployeePolymorphismTest {
	public static void main(String args[]) {
		Employee m1 = new Manager(01, "Manager", 400000, "male");
		printInfo(m1);

		Employee d1 = new Developer(02, "Developer", 300000, "female");
		printInfo(d1);

		Employee a1 = new Analyst(03, "Analyst", 200000, "male");
		printInfo(a1);
		System.out.println();
	}

	public static void printInfo(Employee emp) {
		System.out.println("Employee id : " + emp.getId() + " Employee name : " + emp.getName()
				+ " Employee basic salary : " + emp.getBasicSalary() + " Employee gender : " + emp.getGender()
				+ " Employe net Salary :  " + emp.getNetSalary());
		printAllowances(emp.getAllownaces());
	}
	public static void printAllowances(String[] allowances) {
		for(String allowance : allowances) {
			System.out.print(allowance);
		}
		System.out.println();
	}

}
