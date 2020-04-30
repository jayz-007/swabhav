package com.techlabs.model;

import java.text.ParseException;

public class Student  {
	private Person person;
	private Branch branch;

	public Student(Person person,Branch branch) {
		this.person = person;
		this.branch = branch;
	}
	
	public Branch getBranch()
	{
		return branch;
	}
	public Person getPerson() {
		return person;
	}
	

}
