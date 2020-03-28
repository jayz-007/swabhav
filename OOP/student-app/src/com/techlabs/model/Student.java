package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int studentcount ;
	
	static {
		studentcount = 0;
		System.out.println("inside static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = checkName(name);
		this.cgpa = cgpa;
		studentcount++;
		System.out.println("inside constructor");
	}

	public Student(int id, String name) {
		this(id, name, 7.0f);
	}

	private String checkName(String name) {
		if (name != null)
			return name;
		return name = "unknown";
	}

	private double checkCgpa(double cgpa) {
		if (cgpa < 0)
			return 7.0;
		if (cgpa > 10)
			return 7.0;
		return cgpa;

	}


	public int getId() {
		return id;

	}
	

	public String getName() {
		return name;

	}

	public float getCgpa() {
		return cgpa;
	}

	public int getStudentCount() {
		return studentcount;
	}
	
	public static int headcount() {
		return studentcount;
	}
	
	public static int showId() {
		return id;
	}

}
