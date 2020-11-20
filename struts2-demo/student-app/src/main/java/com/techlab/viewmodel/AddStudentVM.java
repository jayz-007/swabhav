package com.techlab.viewmodel;


public class AddStudentVM {

	private String name;
	private String gender;
	private int rollNo;
	private int age;
	private double cgpa;

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return this.gender;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getRollno() {
		return rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setRollno(int rollno) {
		this.rollNo = rollno;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
