package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.database.ContactsCRUD;
import com.techlabs.model.Contact;

public class ContactService {
	private List<Contact> contacts = new ArrayList<Contact>();
	private static ContactService instance = new ContactService();
	private Contact contact;
	private ContactsCRUD contactsCRUD;
	public  ContactService() {
		// TODO Auto-generated constructor stub
		System.out.println("Contact service contstr");
		contactsCRUD = new ContactsCRUD();	
	}
	
	public void addStudent(String firstName,String middleName,String lastName,String phone,String email) {
		contactsCRUD.addContact(firstName, middleName, lastName, phone, email);;
		
	}
	public List<Contact> getContacts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		for (Contact contact : contactsCRUD.selectAllContacts()) {
		}
		
		return contactsCRUD.selectAllContacts();
		
	}
	public Contact getContactUsingId(String id) {
		return contactsCRUD.selectUsingId(Integer.parseInt(id));
	}
	
	public void updateContact(String id,String firstName,String middleName,String lastName,String phone,String email) {
		contactsCRUD.updateContact(Integer.parseInt(id), firstName, middleName, lastName, phone, email);;
		
	}
	public void deleteContact(String id) {
		contactsCRUD.deleteContact(Integer.parseInt(id));
	}
	
	
	public static ContactService getInstance(){
	      return instance;
	   }
}
