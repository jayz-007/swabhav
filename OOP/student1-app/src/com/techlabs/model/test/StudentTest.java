package com.techlabs.model.test;

import java.util.HashMap;
import java.util.TreeMap;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main (String args[]) {
		Student s1 = new Student(1, 10, "ABc", 7.0f);
		Student s2 = new Student(1, 10, "Xyz", 7.0f);
		Student s3 = new Student(10, 1, "ABc", 7.0f);
		
		//HashMap<Student, Student> map = new HashMap<Student, Student>();
		TreeMap<Student, Student> map = new TreeMap<Student, Student>();
		
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		
		System.out.println(map.size());
		
		
		
		
	}

}
