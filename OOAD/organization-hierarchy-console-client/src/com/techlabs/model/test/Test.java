package com.techlabs.model.test;

import com.techlabs.model.Employee;
import com.techlabs.model.OrganizationHierarchyBuilder;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String[] args) throws Exception {
		OrganizationHierarchyBuilder builder = new OrganizationHierarchyBuilder(new UrlLoader());
		Employee emp = builder.getPresident();
		System.out.println(emp.showXML(0));
		System.out.println();
		System.out.println(emp.show(0));
	}

}
