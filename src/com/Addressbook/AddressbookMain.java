package com.Addressbook;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AddressbookMain {
	
	public static Contact readContactInfo() {

		Scanner scan = new Scanner(System.in);

		System.out.print(" Please enter the first name: ");
		String firstName = scan.next();

		System.out.print(" Please enter the last name: ");
		String lastName = scan.next();

		System.out.print(" Please enter the address: ");
		String address = scan.next();

		System.out.print(" Please enter the city: ");
		String city = scan.next();

		System.out.print(" Please enter the state: ");
		String state = scan.next();

		System.out.print(" Please enter the zip: ");
		int zip = scan.nextInt();

		System.out.print(" Please enter the phone number: ");
		int phoneNumber = scan.nextInt();

		System.out.print(" Please enter the email: ");
		String email = scan.next();

		return new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

	}
/* searching the person by name and state using switch case*/
	public static void main(String[] args) {

		AddresbookService addresbookService = new AddresbookService();
		addresbookService.printContacts();

		System.out.println(" Welcome to Address Book Program");
		
		readContactInfo();
		Set<Contact> addressbook = new LinkedHashSet<>();
		//adding the user details in set of addressbook
		addressbook.add(readContactInfo());
		//printing the addressbook 
		System.out.println(addressbook);
		MultipleAddressSerice addressRegisterSerice = new MultipleAddressSerice();
		addressRegisterSerice.countPersons("das");
		addressRegisterSerice.searchPersonAll("Das", "Ongole");
		
		Scanner scan = new Scanner(System.in);
		String option;

		

		while (true) {
			System.out.println(
					" 1. Search a person by City/State\n 2. Exit ");
			System.out.print(" Please enter your choice: ");

			option = scan.next();

			switch (option) {
			
			case "1":
				System.out.print(" Please enter the name of the person: ");
				String name = scan.next();
				
				System.out.print(" Do you want to search by city or state: ");
				String choice = scan.next();
				if(addressbook.contains(name)) {
					System.out.println(addressbook);
				}
				
				break;
			case "2": 
				System.out.println(" Thank you ");
				scan.close();
				return;
			default:
				System.out.println(" Please enter a valid input");
			}
		}
		
		
	}
	
	

}
