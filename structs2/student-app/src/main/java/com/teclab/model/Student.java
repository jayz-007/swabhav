package com.teclab.model;

import java.util.UUID;

public class Student {
	private String name;
	private String gender;
	private String id;

	public Student(String name, String gender) {
		// TODO Auto-generated constructor stu
		this.name = name;
		this.gender = gender;
		this.id = UUID.randomUUID().toString();
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
}
