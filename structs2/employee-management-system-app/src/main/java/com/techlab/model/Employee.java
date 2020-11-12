package com.techlab.model;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double Salary;
	private int age;
	private float rating;

	public Employee(int id, String name, String designation, double Salary,int age,float rating) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.designation = name;
		this.Salary = Salary;
		this.designation = designation;
		this.age=age;
		this.rating=rating;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return Salary;
	}
	
	public int getAge() {
		return age;
	}
	public float getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;

	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public void setRating(float rating) {
		this.rating=rating;
	}
}
