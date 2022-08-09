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
		//addressbook.add(read());

	}

	public void addMultipleContacts() {
		
		List<String> addressbook = new ArrayList<String>();
		List<String> addressbook1 = new ArrayList<String>();
		
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

		addressbook1.add("Kiran");
		addressbook1.add("K");
		addressbook1.add("Madyapradesh");
		addressbook1.add("MP");
		addressbook1.add("MP");
		addressbook1.add("kiran@gmail.com");
		Collections.addAll(addressbook1, "9545514155", "500001");
		
		//collection.addPerson();
		
		
		System.out.println(" \n " + addressbook);
		System.out.println(" Successfully added contact to addressbook");
	}
	
	public void addMultipleAddressBook() {
		Contact contact = new Contact();
        // Initializing a Dictionary
        Dictionary geek = new Hashtable();
 
        
        //geek.put(contact.read(), geek);
       
        geek.put(contact.read(), "AddressBook1");
        geek.put(contact.read(), "AddressBook2");
        
 
        // elements() method :
        for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
        	//addressbook.add(read());
            System.out.println("Address Book Name : " + i.nextElement());
            }
        
            for (Enumeration i1 = geek.elements(); i1.hasMoreElements();)
            {
            	addressbook.add(read());
                System.out.println("Address Book Name : " + i1.nextElement());
           
        
        }   
            System.out.println("geek : " + geek);
	}
}
