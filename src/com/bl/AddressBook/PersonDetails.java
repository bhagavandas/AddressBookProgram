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
		
		/*created an arraylist 
		 * added user details
		 * it adds the read method in Contact class
		 */
		List<Contact> contact1 = new ArrayList<Contact>();
		
		contact1.add(contact.read());
		
		/*created an arraylist 
		 * added user details
		 * it adds the read method in Contact class and stored in contacts array list
		 */
		 ArrayList<Contact> contacts2 = new ArrayList<>(Arrays.asList());
		 contacts2.add(contact.read());

		// created an arraylist to add multiple contacts in it
		 ArrayList<Contact>  contacts = 
	                new ArrayList<Contact> ();
			
			contacts.addAll(contact1);
			contacts.addAll(contacts2);

//
//		List<Contact> sortedList = contacts.stream().sorted().collect(Collectors.toList());
//		 
//				System.out.println("Sorted List: " + sortedList.toString());
//		
		        List<Contact> sortedList = contacts.stream()
					.sorted(Comparator.comparing(Contact::getFirstName))
					.collect(Collectors.toList());
		 
		        sortedList.forEach(System.out::println);
				
	}
	
	// UC-11 using stream function
	public static void main(String[] args) {
		//calling the method
		sortPersonDetails();
	}
	
	
}
