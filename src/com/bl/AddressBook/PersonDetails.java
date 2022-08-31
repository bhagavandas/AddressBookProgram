package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonDetails {

	// sorting the person details in addressbook using stream functions of sorted
	public static void sortPersonDetails() {
		
		Contact contact = new Contact();

		/*
		 * created an arraylist added user details it adds the read method in Contact
		 * class
		 */
		List<Contact> addressbook1 = new ArrayList<Contact>();
		System.out.println("Addressbook1: ");		
		addressbook1.add(contact.read());

		/*
		 * created an arraylist added user details it adds the read method in Contact
		 * class and stored in contacts array list
		 */
		ArrayList<Contact> addressbook2 = new ArrayList<>(Arrays.asList());
		System.out.println("Addressbook2: ");	
		addressbook2.add(contact.read());

		// created an arraylist to add multiple contacts in it
		ArrayList<Contact> contacts = new ArrayList<Contact>();

		contacts.addAll(addressbook1);
		contacts.addAll(addressbook2);
		
		System.out.println(contacts);

//
//		List<Contact> sortedList = contacts.stream().sorted().collect(Collectors.toList());
//		 

		// sorting the entries in addressbook the address book by name
		System.out.println("Sorted by person name: ");
		
		List<Contact> sortedList = contacts.stream().sorted(Comparator.comparing(Contact::getFirstName))
				.collect(Collectors.toList());

		sortedList.forEach(System.out::println);
		System.out.println(".....................");

		// sorting the entries in addressbook the address book by City
		System.out.println("Sorted by city: ");

		List<Contact> sortedList1 = contacts.stream().sorted(Comparator.comparing(Contact::getCity))
				.collect(Collectors.toList());

		sortedList1.forEach(System.out::println);
		System.out.println(".....................");

		// sorting the entries in addressbook the address book by State
		System.out.println("Sorting by state: ");
						
		List<Contact> sortedList2 = contacts.stream().sorted(Comparator.comparing(Contact::getState))
				.collect(Collectors.toList());

		sortedList2.forEach(System.out::println);
		System.out.println(".....................");

		// sorting the entries in addressbook the address book by zip
		System.out.println("Sorting by zip: ");
								
		List<Contact> sortedList3 = contacts.stream().sorted(Comparator.comparing(Contact::getZip))
				.collect(Collectors.toList());

		sortedList3.forEach(System.out::println);
		System.out.println(".....................");

	}

	// UC-11 & 12 using stream function
	public static void main(String[] args) {
		// calling the method
		sortPersonDetails();
	}

}
