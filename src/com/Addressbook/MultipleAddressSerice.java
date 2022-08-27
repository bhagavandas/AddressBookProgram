package com.Addressbook;

import java.util.HashSet;
import java.util.Scanner;

public class MultipleAddressSerice {

	static Scanner scan = new Scanner(System.in);

	public void addAddressBook() {
		System.out.print(" Please enter new address book name : ");
		String name = scan.next();

		HashSet<Addressbook> temp = MultipleAddressbook.getAddressBookList();

		if (!temp.add(new Addressbook(name)))
			System.out.println(" An address book of this name already exists! ");

		MultipleAddressbook.setAddressBookList(temp);

	}

	public static void searchPersonAll(String name, String ch) {

		switch (ch) {
		case "c":
		case "city":
			System.out.print(" Please enter the name of the city: ");
			String city = scan.next();
			for (Addressbook adbook : MultipleAddressbook.getAddressBookList()) {
				adbook.getContacts().stream().filter(contact -> contact.getCity().equals(city))
						.filter(contact -> contact.getFirstName().equals(name))
						.forEach(contact -> System.out.println(contact));
			}
			break;
		case "s":
		case "state":
			System.out.print(" Please enter the name of the state: ");
			String state = scan.next();
			for (Addressbook adbook : MultipleAddressbook.getAddressBookList()) {
				adbook.getContacts().stream().filter(contact -> contact.getState().equals(state))
						.filter(contact -> contact.getFirstName().equals(name))
						.forEach(contact -> System.out.println(contact));
			}
			break;

		}
	}

	public static void viewPersonAll(String ch) {

		switch (ch) {
		case "c":
		case "city":
			System.out.print(" Please enter the name of the city: ");
			String city = scan.next();
			MultipleAddressbook.getCityPersonMap().entrySet().stream().filter(contact -> contact.getKey().equals(city))
					.forEach(contact -> System.out.println(contact.getValue()));
			break;
		case "s":
		case "state":
			System.out.print(" Please enter the name of the state: ");
			String state = scan.next();
			MultipleAddressbook.getStatePersonMap().entrySet().stream()
					.filter(contact -> contact.getKey().equals(state))
					.forEach(contact -> System.out.println(contact.getValue()));
			break;

		default:
			System.out.println(" Please enter a valid choice!");
		}
	}

	public static void countPersons(String ch) {
		switch (ch) {
		case "c":
		case "city":
			System.out.println(" Please enter the name of the city: ");
			String city = scan.next();
			MultipleAddressbook.getCityPersonMap().entrySet().stream().filter(contact -> contact.getKey().equals(city))
					.forEach(contact -> System.out
							.println("Number of ppl in " + city + ": " + contact.getValue().size()));
			break;
		case "s":
		case "state":
			System.out.println(" Please enter the name of the state: ");
			String state = scan.next();
			MultipleAddressbook.getStatePersonMap().entrySet().stream()
					.filter(contact -> contact.getKey().equals(state)).forEach(contact -> System.out
							.println("Number of ppl in " + state + ": " + contact.getValue().size()));
			break;
		default:
			System.out.println(" Please enter a valid choice!");
		}
	}

	public static void main(String[] args) {
		searchPersonAll("Das", "Ong");
		countPersons("c");
		viewPersonAll("c");
	}
}
