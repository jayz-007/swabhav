package com.techlabs.model;

public class Manager extends Employee {
	private static final float HRA = 0.50f;
	private static final float TA = 0.40f;
	private static final float DA = 0.10f;

	public Manager(int id, String name, float basicsalary, String gender) {
		super(id, name, basicsalary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateNetSalary() {

		return (((basicSalary * HRA) + (basicSalary * TA) + (basicSalary * DA) + basicSalary) * 12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = {"HRA is " + (HRA * basicSalary)," TA is " + (TA * basicSalary)," DA is " + (DA * basicSalary)};

		return allowances;
	}

}
