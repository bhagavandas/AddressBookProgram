package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class File {
	
	 private static ArrayList<ContactsData> personsContactlList;
	    //created a constructor
	    public File() {

	    }

	    public static void main(String[] args) {
	        // taken the Arraylist
	    	personsContactlList = new ArrayList<>();
	        //created an object
	        File contactsFile = new File();
	        Scanner consoleInputReader = new Scanner(System.in);
	        //calling the methods
	        contactsFile.readPersonsContactData(consoleInputReader);
	        contactsFile.writePersonsContactData();


	    }
	/* created the method to read the employee payroll data*/
	    public void readPersonsContactData(Scanner consoleInputReader){
	        System.out.println("Enter firstName: ");
	        String firstName  = consoleInputReader.next();
	        System.out.println("Enter lastName: ");
	        String lastName = consoleInputReader.next();
	        System.out.println("Enter city: ");
	        String city = consoleInputReader.next();
	        System.out.println("Enter state: ");
	        String state = consoleInputReader.next();
	        System.out.println("Enter phoneNum: ");
	        long phoneNum = consoleInputReader.nextLong();
	        System.out.println("Enter zip: ");
	        int zip = consoleInputReader.nextInt();
	        System.out.println("Enter email: ");
	        String email = consoleInputReader.next();
	        personsContactlList.add(new ContactsData(firstName, lastName, city, state, phoneNum, zip));
	    }

	    /* created the method to write the employee payroll data*/
	    public void writePersonsContactData(){
	        System.out.println("\nWriting AddressBook with Persons Contact to Console\n" + personsContactlList);
	    }
}
