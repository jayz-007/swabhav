package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {
	private List<Contact> contacts = new ArrayList<Contact>();
	private  static ContactService contactService ;

	public ContactService() {
		// TODO Auto-generated constructor stub
		contacts.add(new Contact("ac", "as", "asd", "asd", "asd"));
		System.out.println("New Object");
	}
	
	public ContactService getIntance() {
		if (contactService == null) {
			contactService = new ContactService();

		}
		return contactService;
	}
	
	public List<Contact> getContacts(){
		return contacts;
	}

	public void addContact(String fname, String lname, String mname, String phoneNo, String emailId) {
		contacts.add(new Contact(fname, lname, mname, phoneNo, emailId));
	}

	public void deleteContact(String emailId) {
		for (Contact contact : contacts) {
			if (contact.getEmailId().equals(emailId)) {
				this.contacts.remove(contact);
			}
		}
	}

	public void editContact(String fname, String lname, String mname, String phoneNo, String emailId,String editcontact) {
		for (Contact contact : contacts) {
			if (contact.getEmailId().equals(editcontact)) {
				contact.setFname(fname);
				contact.setEmailId(emailId);
				contact.setLname(lname);
				contact.setMname(mname);
				contact.setPhoneNo(phoneNo);
				System.out.println("Edoted");
			}
		}

	}
}
