package com.Addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import com.bl.AddressBook.Contact;

public class AddresbookService {
	
	Scanner scan = new Scanner(System.in);

	public AddresbookService() {
		super();
		
	}

	public static void addContact(com.Addressbook.Contact contact) {

		MultipleAddressbook multipleAddressbook = new MultipleAddressbook();

			Addressbook adBook = findAddressBook();

			if (adBook == null) {
				return;
			}

			HashMap<String, ArrayList<com.Addressbook.Contact>> cityPersonMap = multipleAddressbook.getCityPersonMap();
			HashMap<String, ArrayList<com.Addressbook.Contact>> statePersonMap = MultipleAddressbook.getStatePersonMap();

			if(!cityPersonMap.containsKey(contact.getCity()) )
				
				cityPersonMap.put(contact.getCity(), new ArrayList<com.Addressbook.Contact>());
			cityPersonMap.get(contact.getCity()).add(contact);

			if(!statePersonMap.containsKey(contact.getState()) )
				statePersonMap.put(contact.getState(), new ArrayList<com.Addressbook.Contact>());
			statePersonMap.get(contact.getState()).add(contact);

			HashSet<Contact> contacts = adBook.getContacts();

			Contact newContact = contact;
			if (!contacts.add(newContact))
				System.out.println(" A contact of this name already exists!");

			adBook.setContacts(contacts);

			System.out.println(newContact);
		}

		

	public void printContacts() {

		HashSet<Addressbook> temp = MultipleAddressbook.getAddressBookList();

		for (Addressbook addressBook : temp) {
			System.out.println(" ******** " + addressBook.getName() + " ********");
			for (Contact contact : addressBook.getContacts()) {
				System.out.println(contact);
			}
		}
	}

	private Contact findContact(Addressbook adBook) {

		System.out.print(" Please enter the name of the contact: ");
		String name = scan.next();

		HashSet<Contact> contacts = adBook.getContacts();
		int count = 0;
		Contact temp = null;

		for (Contact contactPerson : contacts) {
			if (contactPerson.getFirstName().equals(name)) {
				count++;
				temp = contactPerson;
			}
		}

		if (count < 2) {
			return temp;
		}

		System.out.print(" There are multiple contacts with that name.\n Please enter their email id to confirm: ");
		String checkEmail = scan.next();
		for (Contact contactPerson : contacts) {
			if (contactPerson.getFirstName().equals(name) && contactPerson.getEmail().equals(checkEmail)) {
				return contactPerson;
			}
		}

		return null;
	}

	private static Addressbook findAddressBook() {

		HashSet<Addressbook> temp = MultipleAddressbook.getAddressBookList();

		if (temp.size() == 0) {
			System.out.println(" Please create an address book first!");
			return null;
		}

		System.out.print(" Please enter the name of the address book: ");
		String adBookName = scan.next();

		for (Addressbook addressBook : temp) {
			if (addressBook.getName().equals(adBookName)) {
				return addressBook;
			}
		}

		System.out.println(" Address book does not exist!");
		return null;
	}

	
}
