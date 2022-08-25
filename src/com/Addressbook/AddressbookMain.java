package com.Addressbook;

import java.util.Scanner;

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

	public static void main(String[] args) {

		System.out.println(" Welcome to Address Book Program");

		Scanner scan = new Scanner(System.in);
		String ch;

		AddresbookService obj = new AddresbookService();
		AddressRegisterSerice adObj = new AddressRegisterSerice();

		while (true) {
			System.out.println(
					" 1. Search by City/State\n 2. Exit ");
			System.out.print(" Please enter your choice: ");

			ch = scan.next();

			switch (ch) {
			
			case "1":
				System.out.print(" Please enter the name of the person: ");
				String name = scan.next();
				System.out.print(" Do you want to search by city or state: ");
				String choice = scan.next();
				adObj.searchPersonAll(name, choice);
				break;
			case "2": 
				System.out.println(" Good bye!! ");
				scan.close();
				return;
			default:
				System.out.println(" Please enter a valid input");
			}
		}
	}

}
