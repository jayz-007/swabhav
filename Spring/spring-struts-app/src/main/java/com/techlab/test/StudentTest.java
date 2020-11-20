package com.techlab.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlab.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentService svc = obj.getBean("studentssvc", StudentService.class);
		System.out.println(svc.getStudents().size());
		System.out.println(svc.hashCode());

		StudentService svc1 = obj.getBean("studentssvc", StudentService.class);
		System.out.println(svc1.getStudents().size());
		System.out.println(svc1.hashCode());
	}
}