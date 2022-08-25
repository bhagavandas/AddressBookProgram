package com.Addressbook;

import java.util.HashSet;

public class MultipleAddressbook {
	
	private static HashSet<Addressbook> AddressBookList = new HashSet<>();

	public static  HashSet<Addressbook> getAddressBookList() {
		return AddressBookList;
	}

	public static void setAddressBookList(HashSet<Addressbook> addressBookList) {
		AddressBookList = addressBookList;
	}

}
