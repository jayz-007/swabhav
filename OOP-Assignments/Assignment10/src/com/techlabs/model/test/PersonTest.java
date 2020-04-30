package com.techlabs.model.test;

import java.text.ParseException;

import com.techlabs.model.Branch;
import com.techlabs.model.Person;
import com.techlabs.model.Professor;
import com.techlabs.model.Student;

public class PersonTest {
	public static void main(String args[])  {
		Student student = new Student(new Person(12, "xyz", "12/12/1998"), Branch.Chemical);
		printInfo(student);

		Professor professor = new Professor(new Person(12, "xyz", "12/19/1986"), 1000);
		professor.updateSalary(30);
		printInfo(professor);
	}

	public static String printInfo(Person person) {
		return (("id is :" + person.getId() + " Address is : " + person.getAddress() + " Date of birth is: "
				+ person.getDateOfBirth()));
	}

	public static void printInfo(Student student) {
		System.out.println(printInfo(student.getPerson()) + " Branch is: " + student.getBranch());
	}

	public static void printInfo(Professor professor) {
		System.out.println(printInfo(professor.getPerson()) + "Salary is :" + professor.getNetSalary());
	}

}
