package com.bridgelabz.day28and29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddressBookSystemUC1 {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;

	AddressBookSystemUC1(String firstName, String lastName, String address, String state, int zip, long phoneNumber, String eMail ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public String getEMail() {
		return eMail;
	}
	public String toString() {
		return "First Name : "+firstName+" "+"Last Name : "+lastName+" "+"Address : "+address+" "+"State : "+state+" "+"Zip : "+zip+" "+"Phone Number : "+phoneNumber+" "+"Email : "+eMail;
	}
	static class Addressbook {
		public static void main(String [] args) {
			System.out.println("Welcome to the Addres Book System");
			Collection<AddressBookSystemUC1> c = new ArrayList<AddressBookSystemUC1>();
			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			int choise = 1;
			switch(choise) {
			case 1:
				System.out.println("Enter First Name : ");
				String firstName = scan.nextLine();
				System.out.println("Enter Last Name : ");
				String lastName = scan.nextLine();
				System.out.println("Enter the Address : ");
				String address = scan.nextLine();
				System.out.println("Enter the State : ");
				String state = scan.nextLine();
				System.out.println("Enter the Zip Code : ");
				int zip = scan1.nextInt();
				System.out.println("Enter the Phone Number : ");
				long phoneNumber = scan1.nextLong();
				System.out.println("Enter the Email Address : ");
				String eMail = scan.nextLine();


				c.add(new AddressBookSystemUC1(firstName, lastName, address, state, zip, phoneNumber, eMail));
				break;

			}
		}
	}
}
