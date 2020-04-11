package com.techlabs.model;

public class Analyst extends Employee{
	private static final float PERKS = 0.40f;

	public Analyst(int id, String name, float basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public float calculateNetSalary() {
		return (((PERKS*basicSalary)+basicSalary)*12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = {"Perks are : " + (PERKS * basicSalary)};

		return allowances;
	}

}
