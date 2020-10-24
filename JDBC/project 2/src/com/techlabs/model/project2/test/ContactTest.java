package com.techlabs.model.project2.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.model.project2.Contact;

public class ContactTest {
	public static void main(String args[]) throws SQLException {
		Contact contact = new Contact();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			System.out.println("Enter operation \n1.Display Data \n2.Enter new contact \n3.Delete Contact \n4.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Displaying data ");
				contact.display();
				System.out.println();
				break;

			case 2:
				System.out.println("Enter first name");
				String fname = sc.next();
				System.out.println("Enter last name");
				String lname = sc.next();
				System.out.println("Enter phone number");
				String phone = sc.next();
				System.out.println("Enter email");
				String email = sc.next();
				contact.addContact(fname, lname, phone, email);
				System.out.println("Data Entered");
				break;

			case 3:
				System.out.println("Enter fist name of contact to be deleted");
				String delete = sc.next();
				contact.delete(delete);
				System.out.println("Data deleted with first name " + delete);
				break;

			case 4:
				System.out.println("Application closed");
				break;

			default:
				System.out.println("Enter valid choice");
				break;
			}
		}

	}

}
