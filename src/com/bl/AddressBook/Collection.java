package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection extends Contact {
	public void addPerson() {
		AddressBookMain obj = new AddressBookMain();

		addressbook.add(read());

	}

	public void addMultipleContacts() {
		List<String> addressbook = new ArrayList<String>();

		addressbook.add("das");
		addressbook.add("K");
		addressbook.add("Ong");
		addressbook.add("Ong");
		addressbook.add("AP");
		addressbook.add("das@gmail.com");
		
		Collections.addAll(addressbook, "95454548445", "523251");
		//System.out.println(addressbook);

		addressbook.add("Kiran");
		addressbook.add("K");
		addressbook.add("Madyapradesh");
		addressbook.add("MP");
		addressbook.add("MP");
		addressbook.add("kiran@gmail.com");
		Collections.addAll(addressbook, "9545514155", "500001");
		System.out.println(" \n " + addressbook);

	}
}
