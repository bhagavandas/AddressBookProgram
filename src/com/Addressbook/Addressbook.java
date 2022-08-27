package com.Addressbook;

import java.util.HashSet;
import java.util.Objects;

import com.bl.AddressBook.Contact;

public class Addressbook {
	
	 static HashSet<Contact> contacts = new HashSet<>();
	private String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Addressbook other = (Addressbook) obj;
		return Objects.equals(name, other.name);
	}

	public HashSet<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(HashSet<Contact> contacts) {
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addressbook(String name) {
		super();
		this.name = name;
	}
	
	
	


}
