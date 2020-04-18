package com.techlabs.model;

public abstract class Employee {
	private int id;
	private String name;
	protected float basicSalary;
	private String gender;
	private double netSalary;
	private String[] allowances;
	protected String employeeRole;//this to add and a getter

	public Employee(int id, String name, float basicSalary, String gender) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.gender = gender;
		this.netSalary = calculateNetSalary();
		this.allowances= calculateAllowances();

	}
	

	protected abstract float calculateNetSalary();
	
	protected abstract String[] calculateAllowances();
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public String getGender() {
		return gender;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	public String[] getAllownaces() {
		return allowances;
	}
	
	public String getEmployeeRole() {
		return employeeRole;
	}//change
}
