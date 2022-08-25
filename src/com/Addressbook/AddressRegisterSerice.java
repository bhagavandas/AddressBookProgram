package com.Addressbook;

import java.util.HashSet;
import java.util.Scanner;

public class AddressRegisterSerice {
	
	Scanner scan = new Scanner(System.in);

	public void addAddressBook() {
		System.out.print(" Please enter the name of the new address book: ");
		String name = scan.next();

		HashSet<Addressbook> temp = MultipleAddressbook.getAddressBookList();

		if (!temp.add(new Addressbook(name)))
			System.out.println(" An address book of this name already exists! ");

		MultipleAddressbook.setAddressBookList(temp);

	}

	public void searchPersonAll(String name, String ch) {

		switch(ch) {
		case "c":
		case "city":
			System.out.print(" Please enter the name of the city: ");
			String city = scan.next();
			for (Addressbook adbook : MultipleAddressbook.getAddressBookList()) {
					adbook.getContacts().stream()
					.filter(contact -> contact.getCity().equals(city))
					.filter(contact -> contact.getFirstName().equals(name))
					.forEach(contact -> System.out.println(contact));
			}
			break;
		case "s":
		case "state":
			System.out.print(" Please enter the name of the state: ");
			String state = scan.next();
			for (Addressbook adbook : MultipleAddressbook.getAddressBookList()) {
				adbook.getContacts().stream()
					.filter(contact -> contact.getState().equals(state))
					.filter(contact -> contact.getFirstName().equals(name))
					.forEach(contact -> System.out.println(contact));
			}
			break;

		}
	}

}
