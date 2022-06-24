package com.bridgelabz.day28and29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBookSystemUC4 {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;

	AddressBookSystemUC4(String firstName, String lastName, String address, String state, int zip, long phoneNumber, String eMail ){
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
		public static void main(String[] args) {
			System.out.println("Welcome to the Addres Book System");
			Collection<AddressBookSystemUC4> c = new ArrayList<AddressBookSystemUC4>();
			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			int choise;
			do {
				System.out.println("1.CREATE CONTACT");
				System.out.println("2.DISPLAY THE CONTACT");
				System.out.println("3.EDIT THE CONTACT");
				System.out.println("4.DELETE THE CONTACT");
				System.out.println("0.EXIT");
				System.out.println("Enter Your choise : ");
				choise = scan1.nextInt();

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


					c.add(new AddressBookSystemUC4(firstName, lastName, address, state, zip, phoneNumber, eMail));
					break;
				case 2:
					Iterator<AddressBookSystemUC4> i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC4 e = i.next();
						System.out.println(e);
					}
					break;
				case 3:
					boolean found = false;
					System.out.print("Enter the Phone Number to Edit the contact: ");
					phoneNumber =  scan1.nextLong();
					ListIterator<AddressBookSystemUC4> li = ((ArrayList<AddressBookSystemUC4>) c).listIterator();
					while(li.hasNext()) {
						AddressBookSystemUC4 e = li.next();
						if(e.getPhoneNumber() == phoneNumber) {
							System.out.print("Enter new First Name : ");
							firstName = scan.nextLine();
							System.out.print("Enter new Last Name : ");
							lastName = scan.nextLine();
							System.out.print("Enter the new Address : ");
							address = scan.nextLine();
							System.out.print("Enter the new State : ");
							state = scan.nextLine();
							System.out.print("Enter the Zip new Code : ");
							zip = scan1.nextInt();
							System.out.print("Enter the new Phone Number : ");
							phoneNumber = scan1.nextLong();
							System.out.print("Enter the new Email Address : ");
							eMail = scan.nextLine();
							li.set(new AddressBookSystemUC4(firstName, lastName , address, state, zip, phoneNumber, eMail));
							found = true;
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}else {
						System.out.println("Record is Updated successfuly");	
					}
					break;
				case 4:
					found = false;
					System.out.print("Enter the Phone Number to Delete : ");
					phoneNumber = scan1.nextLong();
					i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC4 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							i.remove();
							found = true;
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}else {
						System.out.println("Record is deleted successfuly");	
					}
					break;
				}
			}while(choise != 0);
		}
	}
}
