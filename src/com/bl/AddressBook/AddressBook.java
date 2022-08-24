package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bl.AddressBook.Contact;

public class AddressBook {

	private static final Scanner SC = new Scanner(System.in);
	public static Map<String, ArrayList<Contact>> map = new HashMap<>();

	public static void addressBook() {

		Contact contact = new Contact();

		int choose = 0;

		do {
			Contact add;
			System.out.println("1.addAddressBook \n 2.display\n 3.exit");

			choose = SC.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Give unique address book name");
				String addressBookName = SC.next();
				if (map.containsKey(addressBookName)) {
					System.out.println("Please enter unique address book name");
				} else {
					ArrayList<Contact> contactList = new ArrayList<>();
					int choice = 0;
					do {
						System.out.println("1.add\n 2.display\n 3.exit\n 4.update\n 5.delete contact");
						System.out.println("Enter choice");
						choice = SC.nextInt();
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
							String nameReplace = SC.next();
							for (int i = 0; i < contactList.size(); i++) {
								System.out.println(contactList.get(i));
								Contact editContact = contactList.get(i);
								if (nameReplace.equals(editContact.getFirstName())) {
									System.out.println("Enter a first name: ");
									editContact.setFirstName(SC.next());
									System.out.println("Enter a last name: ");
									editContact.setLastName(SC.next());
									System.out.println("Enter an address: ");
									editContact.setAddress(SC.next());
									System.out.println("Enter a city: ");
									editContact.setCity(SC.next());
									System.out.println("Enter a state: ");
									editContact.setState(SC.next());
									System.out.println("Enter a zip: ");
									editContact.setZip(SC.nextInt());
									System.out.println("Enter a phone number: ");
									editContact.setPhoneNumber(SC.nextLong());
									System.out.println("Enter an email ID: ");
									editContact.setEmail(SC.next());
									contactList.set(i, editContact);
								}
							}
							break;

						case 5:
							System.out.println("Enter name which you want to delete: ");
							String nameDelete = SC.next();
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

}
