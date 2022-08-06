package com.bl.AddressBook;

import java.util.ArrayList;

public class AddressBookMain {
	

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
		Contact contact = new Contact();
		contact.addNewContact();
		contact.createContacts();
		contact.editContact();
		contact.display();
		
		
	}
}
