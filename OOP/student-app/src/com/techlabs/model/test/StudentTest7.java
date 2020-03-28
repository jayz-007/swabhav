package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest7 {
	public static void main (String args[]) {
		Student s1 = new Student(101, "xyz");
		System.out.println(s1.getStudentCount());
		
		System.out.println(Student.headcount());
		
		Student s2 = new Student(102, "xyz");
		System.out.println(s2.getStudentCount());
		
		Student s3 = new Student(103, "imno", 8.0f);
		System.out.println(s3.getStudentCount());
		
	}


}
