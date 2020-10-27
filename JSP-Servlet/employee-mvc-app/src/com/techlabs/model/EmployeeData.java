package com.techlabs.model;

import java.util.Arrays;
import java.util.List;


public class EmployeeData {

    public List < Employee > getEmployees() {
        return Arrays.asList(new Employee(1, "Jay", "Developer"), new Employee(2, "Vinit", "Developer"),
            new Employee(3, "Pawan", "Analyst"),new Employee(4, "Prasad", "Tester"),new Employee(5, "Murtuza", "Manager"));
    }
}
