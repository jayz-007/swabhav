package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Person;
import com.techlabs.model.Professor;

class ProfessorTest {
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Professor professor = new Professor(new Person(12, "zy", "12/19/1998"), 1000);

	@Test
	void test_checkSalaryPerHouris1000() {
		assertEquals(1000, professor.getSalaryPerHour());

	}

	@Test
	void test_checkNetSalaryis12000_forSalaryPerHour1000_HoursWorked12() {
		professor.updateSalary(12);
		assertEquals(12000, professor.getNetSalary());
	}

	@Test
	void test_checkDateOfBirth() throws ParseException {
	
		assertEquals(formatter.parse("12/19/1998"), professor.getPerson().getDateOfBirth());

	}
}
