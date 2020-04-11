package com.techlabs.model;

public class Developer extends Employee {
	private static final float PA = 0.40f;
	private static final float BONUS = 0.30f;

	public Developer(int id, String name, float basicSalary, String gender) {
		super(id, name, basicSalary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateNetSalary() {
		return (((basicSalary * PA) + (basicSalary * BONUS) + basicSalary) * 12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = {"PA is " + (PA * basicSalary),"Bonus is " + (BONUS * basicSalary)};

		return allowances;
	}

}
