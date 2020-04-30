package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Branch;
import com.techlabs.model.Person;
import com.techlabs.model.Student;

class StudentTest {
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Student student = new Student(new Person(12, "zy", "12/19/1998"), Branch.Chemical);

	@Test
	void test_checkBranchisChemical() {
		assertEquals(Branch.Chemical, student.getBranch());
	}
}
