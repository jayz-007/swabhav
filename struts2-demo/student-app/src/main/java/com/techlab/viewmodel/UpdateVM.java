package com.techlab.viewmodel;

public class UpdateVM {
	private String id;
	private String name, gender;
	private int age, rollno;
	private double cgpa;;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setdAge(int age) {
		this.age = age;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getRollno() {
		return rollno;
	}

	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}


}
