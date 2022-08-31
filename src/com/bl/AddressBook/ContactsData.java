package com.bl.AddressBook;

public class ContactsData {

	

	/**
	 * @param firstName
	 * @param lastName
	 * @param city
	 * @param state
	 * @param phoneNum
	 * @param zip
	 */
	public ContactsData(String firstName, String lastName, String city, String state, long phoneNum, int zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.phoneNum = phoneNum;
		this.zip = zip;
	}
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public long phoneNum;
	public int zip;
	@Override
	public String toString() {
		return "ContactsData [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", phoneNum=" + phoneNum + ", zip=" + zip + "]";
	}

}
