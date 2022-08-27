package com.Addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MultipleAddressbook {
	
	public static HashMap<String, ArrayList<Contact>> CityPersonMap = new HashMap<>();
	public static HashMap<String, ArrayList<Contact>> StatePersonMap = new HashMap<>();

	public static HashMap<String, ArrayList<Contact>> getCityPersonMap() {
		return CityPersonMap;
	}

	public static void setCityPersonMap(HashMap<String, ArrayList<Contact>> cityPersonMap) {
		CityPersonMap = cityPersonMap;
	}

	public static HashMap<String, ArrayList<Contact>> getStatePersonMap() {
		return StatePersonMap;
	}

	public static void setStatePersonMap(HashMap<String, ArrayList<Contact>> statePersonMap) {
		StatePersonMap = statePersonMap;
	}

	private static HashSet<Addressbook> AddressBookList = new HashSet<>();

	public static HashSet<Addressbook> getAddressBookList() {
		return AddressBookList;
	}

	public static void setAddressBookList(HashSet<Addressbook> addressBookList) {
		AddressBookList = addressBookList;
	}


}
