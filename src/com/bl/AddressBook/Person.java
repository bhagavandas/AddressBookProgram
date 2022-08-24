package com.bl.AddressBook;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
	// checking the duplicate entry of person name in addressbook
	public static void CheckPersonName() {

		// String name;
		Set<String> addressbook = new LinkedHashSet<>();

		addressbook.add("A");
		addressbook.add("B");
		addressbook.add("C");
		addressbook.add("D");
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name to search: ");
		String n = sc.next();
		if(addressbook.contains(n)) {
			System.out.println("Searched name is found!");
		}else {
			System.out.println("Searched name is not found!");
		}
		
		System.out.println("Enter name to add: ");
		String name = sc.next();
		if (addressbook.contains(name)) {
			System.out.println("Entered name already exists");
		} 
		else {
			addressbook.add(name);
		}

		System.out.println(addressbook);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.CheckPersonName();
		Address address = new Address();
		//address.addressBook();
		address.addEntry();
		Address.search();
		
	}
}
