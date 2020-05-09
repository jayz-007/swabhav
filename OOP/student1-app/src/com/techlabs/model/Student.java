package com.techlabs.model;

public class Student implements Comparable<Student> {

	private int rollno;
	private int standard;
	private String name;
	private float cgpa;

	public Student(int rollno, int standard, String name, float cgpa) {
		this.rollno = rollno;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;

	}

	@Override
	public int compareTo(Student student) {
		if (this.rollno == student.rollno && this.standard == student.standard)
			return 0;

		return 1;

	}

	@Override
	public int hashCode() {
		return (this.rollno + this.standard);
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;

		return (this.rollno == student.rollno && this.standard == student.standard && this.cgpa == student.cgpa
				&& this.name == student.name);
	}

}
