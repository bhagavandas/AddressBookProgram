package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private Long phoneNumber;
	private String email;
	
	protected ArrayList<Contact> addressbook = new ArrayList<>();
	
	
//	public void createContacts() {
//		
//		String[][] addressbooks = new String[10][8];
//		
//		addressbooks[0][0] = "First Name";
//		addressbooks[0][1] = "Last Name";
//		addressbooks[0][2] = "Address";
//		addressbooks[0][3] = "City";
//		addressbooks[0][4] = "State";
//		addressbooks[0][5] = "Zip";
//		addressbooks[0][6] = "Phone Number";
//		addressbooks[0][7] = "Email";
//
//		addressbooks[1][0] = "Bravo";
//		addressbooks[1][1] = "K";
//		addressbooks[1][2] = "ECIL,Hyderabad";
//		addressbooks[1][3] = "Hyderabad";
//		addressbooks[1][4] = "Telangana";
//		addressbooks[1][5] = "500001";
//		addressbooks[1][6] = "5846985485";
//		addressbooks[1][7] = "bl@gmail.com";
//
//		addressbooks[2][0] = "David";
//		addressbooks[2][1] = "Hussey";
//		addressbooks[2][2] = "Ongole, Andhra Pradesh";
//		addressbooks[2][3] = "Ongole";
//		addressbooks[2][4] = "AP";
//		addressbooks[2][5] = "523001";
//		addressbooks[2][6] = "9584258466";
//		addressbooks[2][7] = "hussey@yahoo.com";
//
//		System.out.println(addressbooks[1][0] + " " + addressbooks[1][1] + "\t" + addressbooks[1][2] + ", " + "\n\t"
//				+ addressbooks[1][3] + "\n\t" + addressbooks[1][4] + ", " + addressbooks[1][5] + "  Ph.No: "
//				+ addressbooks[1][6] + "\n\t" + addressbooks[1][7]);
//
//		System.out.println(addressbooks[2][0] + " " + addressbooks[2][1] + "\t" + addressbooks[2][2] + ", " + "\n\t"
//				+ addressbooks[2][3] + "\n\t" + addressbooks[2][4] + ", " + addressbooks[2][5] + "  Ph.No: "
//				+ addressbooks[2][6] + "\n\t" + addressbooks[2][7]);
//
//	}

	public void addNewContact() {
		
		addressbook.add(read());
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void editContact() {
		Scanner input = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("\n1 - Edit Contact \n2 - Delete Contact ");
		System.out.print("\n");
		System.out.print("\nChoose your option: ");

		int option = input.nextInt(3);
		int option1 = option;
		switch(option1) {
		//while (option1 == 1) {
		case 1:
			System.out.println("Enter the details to edit contact: ");
			System.out.print("\nPlease enter your First Name : ");
			String firstName = input.next();
			System.out.print("\nPlease enter your Last Name : ");
        	String lastName = input.next();
        	System.out.print("\nPlease enter your Address : ");
        	String address = input.next();
        	System.out.print("\nPlease enter your City : ");
        	String city = input.next();
        	System.out.print("\nPlease enter your State : ");
        	String state = input.next();
        	System.out.print("\nPlease enter your Zip : ");
        	String zip = input.next();
        	System.out.print("\nPlease enter your Phone Number : ");
        	String phoneNumber = input.next();
        	System.out.print("\nPlease enter your Email : ");
        	String email = input.next();
        	
			option1++;
		
		System.out.println("Edited Contact Details : " + firstName + " " + lastName + " " + address + " " + city + " "+ state + " " + zip + " " + phoneNumber + " " + email);
		case 2:
			System.out.print("\nPlease enter your First Name to delete : ");
			 firstName = input.next();
			if( firstName == firstName) {
			 System.out.println("Your contact is deleted!");
			}
			else {
				System.out.println("User not found!!!");
			}
			break;
		} 
	}
	
	public void display() {
		for(Contact contact:addressbook) {
			System.out.println(contact.getFirstName() + " " + contact.getLastName()+ " " + contact.getAddress() + " " + contact.getCity() + " " + contact.getState() + " " + contact.getZip() + " "+ contact.getPhoneNumber() + " " + contact.getEmail());
		}
	}

	public Contact read() {
		
		Contact contact = new Contact();
		System.out.println("To Create contact, Enter the Details:");
		Scanner add = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		firstName = add.next();
		contact.setFirstName(firstName);
		System.out.println("Enter Last Name : ");
		lastName = add.next();
		contact.setLastName(lastName);
		System.out.println("Enter Address : ");
		address = add.next();
		contact.setAddress(address);
		System.out.println("Enter City : ");
		city = add.next();
		contact.setCity(city);
		System.out.println("Enter State : ");
		state = add.next();
		contact.setState(state);
		System.out.println("Enter Zip : ");
		zip = add.nextInt();
		contact.setZip(zip);
		System.out.println("Enter Phone Number : ");
		phoneNumber = add.nextLong();
		contact.setPhoneNumber(phoneNumber);
		System.out.println("Enter Email : ");
		email = add.next();
		contact.setEmail(email);

		System.out.println("New Contact Details : ");

		System.out.println(firstName + " " + lastName + "\t" + address + ", " + "\n\t" + city + "\n\t" + state + ", "
				+ zip + "  Ph.No: " + phoneNumber + "\n\t" + email);
		return contact;
		
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email;
	}

	

	
	

}
