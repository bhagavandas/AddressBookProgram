package com.bl.AddressBook;

public class AddressBookMain {

	public static void main(String[] args) {

		//System.out.println("Welcome to Address Book Program");
		Contact contact = new Contact();
		Collection obj = new Collection();
		// contact.addNewContact();
		// contact.createContacts();
		// contact.editContact();

		// contact.display();
		// obj.addPerson();
		// obj.addMultipleContacts();
		// obj.addMultipleAddressBook();

		AddressBook addressbook = new AddressBook();
		//addressbook.addressBook();
		
		Person person = new Person();
		person.CheckPersonName();
		person.equals(obj);
	}
}
