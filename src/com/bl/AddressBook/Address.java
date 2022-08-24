package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.bl.AddressBook.Contact;

public class Address {
	private static String firstName;
	private static String lastName;
	private static String choice;
	private static String search;
	
	private static String city;
	private static String state;
	private static String phoneNum;
	private static String email;
	private static String zip;
	//private int answer = 0;
	
	public static Set<String> addressbook = new LinkedHashSet<>();

	private static final Scanner input = new Scanner(System.in);
	public static Map<String, ArrayList<Contact>> map = new HashMap<>();

	public static void addressBook() {

		Contact contact = new Contact();

		int choose = 0;

		do {
			Contact add;
			System.out.println("1.addAddressBook \n 2.display\n 3.exit");

			choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Give unique address book name");
				String addressBookName = input.next();
				if (map.containsKey(addressBookName)) {
					System.out.println("Please enter unique address book name");
				} else {
					ArrayList<Contact> contactList = new ArrayList<>();
					int choice = 0;
					do {
						System.out.println("1.add\n 2.display\n 3.exit\n 4.update\n 5.delete contact");
						System.out.println("Enter choice");
						choice = input.nextInt();
						switch (choice) {
						case 1:
							add = contact.read();
							contactList.add(add);
							map.put(addressBookName, contactList);
							break;

						case 2:
							for (Contact items : contactList) {
								System.out.println(items.toString());
							}
							break;

						case 3:
							System.out.println("Thank You..");
							break;

						case 4:
							System.out.println("Enter name which you want to edit: ");
							String nameReplace = input.next();
							for (int i = 0; i < contactList.size(); i++) {
								System.out.println(contactList.get(i));
								Contact editContact = contactList.get(i);
								if (nameReplace.equals(editContact.getFirstName())) {
									System.out.println("Enter a first name: ");
									editContact.setFirstName(input.next());
									System.out.println("Enter a last name: ");
									editContact.setLastName(input.next());
									System.out.println("Enter an address: ");
									editContact.setAddress(input.next());
									System.out.println("Enter a city: ");
									editContact.setCity(input.next());
									System.out.println("Enter a state: ");
									editContact.setState(input.next());
									System.out.println("Enter a zip: ");
									editContact.setZip(input.nextInt());
									System.out.println("Enter a phone number: ");
									editContact.setPhoneNumber(input.nextLong());
									System.out.println("Enter an email ID: ");
									editContact.setEmail(input.next());
									contactList.set(i, editContact);
								}
							}
							break;

						case 5:
							System.out.println("Enter name which you want to delete: ");
							String nameDelete = input.next();
							for (int i = 0; i < contactList.size(); i++) {
								System.out.println(contactList.get(i));
								Contact editContact = contactList.get(i);
								if (nameDelete.equals(editContact.getFirstName())) {
									contactList.remove(i);
								}
								System.out.println();
							}
							break;

						default:
							System.out.println("Please Enter from choice ");
							break;

						}
					} while (choice != 3);
					break;

				}

			case 2:
				for (Map.Entry addressbook : map.entrySet()) {
					System.out.println(addressbook.getKey() + ": " + addressbook.getValue());
				}
				break;

			case 3:
				System.out.println("Thank you!!!");
				break;

			default:
				System.out.println("Choose from options");
				break;
			}

		} while (choose != 3);
	}

	//search for person in addressbook
	public static int search() {
	 
		System.out.println("Search Menu: 1.Search First Name\n 2.Search Last\r\n"
				+ "Name\n 3.Search City\n 4.Search State\n 5.Search Zip Code\n 6.Search Phone Number\n 7.Search Email");
	      
		
	     System.out.print("Please Enter Field to Search: ");
	    choice = input.nextLine();

	    System.out.print("Please Enter Value to Search For: ");
	    search = input.nextLine();

	    switch (choice)
	    {
	      case "1":
	    	  if(addressbook.contains(firstName))
	    	  System.out.println(firstName + addressbook);
	        break;
	      case "2":
	    	  System.out.println(lastName + addressbook);
	        break;
	      case "3":
	    	  System.out.println(city + addressbook);
	        break;
	      case "4":
	    	  System.out.println(state + addressbook);
	        break;
	      case "5":
	    	  System.out.println(zip + addressbook);
	        break;
	      case "6":
	    	  System.out.println(phoneNum + addressbook);
	      default:
	    	  //System.out.println(addressbook);
	        break;
	    }
	    return -2;
	  }

	//enter the person details
	public void addEntry() {
		
				
		System.out.print("Please Enter First Name: ");
		firstName = input.nextLine();
		addressbook.add(firstName);
		
		System.out.print("Please Enter Last Name: ");
		lastName = input.nextLine();
		addressbook.add(lastName);
		
		System.out.print("Please Enter City: ");
		city = input.nextLine();
		addressbook.add(city);
		
		System.out.print("Please Enter state: ");
		state = input.nextLine();
		addressbook.add(state);
		
		System.out.print("Please Enter Zip Code: ");
		zip = input.nextLine();
		addressbook.add(zip);
		
		System.out.print("Please Enter Phone number: ");
		phoneNum = input.nextLine();
		addressbook.add(phoneNum);
		
		System.out.print("Please Enter email: ");
		email = input.nextLine();
		addressbook.add(email);
		
		
	}
	// maintaining Dictionary to store the person and states
	public void maintainDictionary() {
		Dictionary phoneBook = new Hashtable();

        // put() method
        phoneBook.put("Das", "Karnataka");
        phoneBook.put("Michael", "Mumbai");
        phoneBook.put("Darwin", "Kolkata");
        phoneBook.put("Ricky", "Telangana");

        //print out Hashtable out
        System.out.println(phoneBook);
        System.out.println("Enter name to search from given addressbook: ");
        String name = input.next();
        
        if(((Hashtable) phoneBook).containsKey(name)) {
        System.out.println("He is from " + phoneBook.get(name));
        }
      
    }
	

}
