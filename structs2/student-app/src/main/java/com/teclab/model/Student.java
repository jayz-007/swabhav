package com.teclab.model;

import java.util.UUID;

public class Student {
	private String name;
	private String gender;
	private String id;
	private int rollNo;
	private int age;
	private double cgpa;

	public Student(String name, String gender, int rollno, int age, double cgpa) {
		// TODO Auto-generated constructor stu
		this.name = name;
		this.gender = gender;
		this.id = UUID.randomUUID().toString();
		this.rollNo = rollno;
		this.age = age;
		this.cgpa = cgpa;
	}

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

	public String getId() {
		return id;
	}

	public String getCgpa() {
		return String.valueOf(cgpa);
	}

	public String getRollno() {
		return String.valueOf(rollNo);
	}

	public String getAge() {
		return String.valueOf(age);
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