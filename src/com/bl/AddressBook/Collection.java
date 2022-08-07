package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Collection extends Contact {
	public void addPerson() {
//		AddressBookMain obj = new AddressBookMain();
//
		addressbook.add(read());

	}

	public void addMultipleContacts() {
		List<String> addressbook = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		Collection collection = new Collection();
		AddressBookMain obj = new AddressBookMain();

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
		
		collection.addPerson();
		
		
		System.out.println(" \n " + addressbook);
	}
	
	public void addMultipleAddressBook() {
		Contact contact = new Contact();
		//contact.read();

        // Initializing a Dictionary
        Dictionary geek = new Hashtable();
 
        // put() method
        geek.put(contact.read(), geek);
        geek.put("123", "AddressBook1");
        geek.put("456", "AddressBook2");
 
        // elements() method :
        for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
        	addressbook.add(read());
            System.out.println("Address Book Name : " + i.nextElement());
            addressbook.add(read());
            System.out.println("Address Book 2 : " + i.nextElement());
        }
       
	}
}
