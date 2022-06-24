package com.bridgelabz.day28and29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class AddressBookSystemUC8 {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;

	AddressBookSystemUC8(String firstName, String lastName, String address, String state, int zip, long phoneNumber, String eMail ){
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
		return "First Name : "+firstName+" "+"\nLast Name : "+lastName+" "+"\nAddress : "+address+" "+"\nState : "+state+" "+"\nZip : "+zip+" "+"\nPhone Number : "+phoneNumber+" "+"\nEmail : "+eMail;
	}
	static class Addressbook {
		public static void main(String[] args) {
			System.out.println("Welcome to the Addres Book System");
			Collection<AddressBookSystemUC8> c = new ArrayList<AddressBookSystemUC8>();
			Collection<AddressBookSystemUC8> c1 = new ArrayList<AddressBookSystemUC8>();
			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			int choise;
			do {
				System.out.println("1.CREATE CONTACT");
				System.out.println("2.DISPLAY THE CONTACT");
				System.out.println("3.EDIT THE CONTACT");
				System.out.println("4.DELETE THE CONTACT");
				System.out.println("5.SEARCH THE CONTACT");
				System.out.println("0.EXIT");
				System.out.println("Enter Your choise : ");
				choise = scan1.nextInt();

				switch(choise) {
				case 1:
					System.out.print("Enter First Name : ");
					String firstName = scan.nextLine();
					System.out.print("Enter Last Name : ");
					String lastName = scan.nextLine();
					System.out.print("Enter the Address : ");
					String address = scan.nextLine();
					System.out.print("Enter the State : ");
					String state = scan.nextLine();
					System.out.print("Enter the Zip Code : ");
					int zip = scan1.nextInt();
					System.out.print("Enter the Phone Number : ");
					long phoneNumber = scan1.nextLong();
					Iterator<AddressBookSystemUC8> i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC8 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							System.out.print("Contact is already exist");
							System.out.println("Enter the valid Phone Number : ");
							phoneNumber = scan1.nextLong();
						}
					}
					System.out.println("Enter the Email Address : ");
					String eMail = scan.nextLine();
					System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
					int opt = scan1.nextInt();
					if(opt == 1) {
						c.add(new AddressBookSystemUC8(firstName, lastName, address, state, zip, phoneNumber, eMail));
					}
					if(opt == 2) {
						c1.add(new AddressBookSystemUC8(firstName, lastName, address, state, zip, phoneNumber, eMail));
					}
					break;
				case 2:
					System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
					opt = scan1.nextInt();
					if(opt == 1) {
						i = c.iterator();
						while(i.hasNext()) {
							AddressBookSystemUC8 e = i.next();
							System.out.println(e);
						}
					}
					if(opt == 2) {
						i = c1.iterator();
						while(i.hasNext()) {
							AddressBookSystemUC8 e = i.next();
							System.out.println(e);
						}
					}
					break;
				case 3:
					boolean found = false;
					System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
					opt = scan1.nextInt();
					if(opt == 1) {
						System.out.print("Enter the Phone Number to Edit the contact: ");
						phoneNumber =  scan1.nextLong();
						ListIterator<AddressBookSystemUC8> li =  ((ArrayList<AddressBookSystemUC8>) c).listIterator();
						while(li.hasNext()) {
							AddressBookSystemUC8 e = li.next();
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
								System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
								li.set(new AddressBookSystemUC8(firstName, lastName , address, state, zip, phoneNumber, eMail));
								found = true;
							}
						}
					}
					if(opt == 2) {
						System.out.print("Enter the Phone Number to Edit the contact: ");
						phoneNumber =  scan1.nextLong();
						ListIterator<AddressBookSystemUC8> li =  ((ArrayList<AddressBookSystemUC8>) c1).listIterator();
						while(li.hasNext()) {
							AddressBookSystemUC8 e = li.next();
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
								System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
								li.set(new AddressBookSystemUC8(firstName, lastName , address, state, zip, phoneNumber, eMail));
								found = true;
							}
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
					System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
					opt = scan1.nextInt();
					if(opt == 1) {
						System.out.print("Enter the Phone Number to Delete : ");
						phoneNumber = scan1.nextLong();
						i = c.iterator();
						while(i.hasNext()) {
							AddressBookSystemUC8 e = i.next();
							if(e.getPhoneNumber() == phoneNumber) {
								i.remove();
								found = true;
							}
						}
					}
					if(opt == 2) {
						System.out.print("Enter the Phone Number to Delete : ");
						phoneNumber = scan1.nextLong();
						i = c1.iterator();
						while(i.hasNext()) {
							AddressBookSystemUC8 e = i.next();
							if(e.getPhoneNumber() == phoneNumber) {
								i.remove();
								found = true;
							}
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}else {
						System.out.println("Record is deleted successfuly");	
					}
					break;
				case 5:
					found = false;
					System.out.println("Enter the State to search : ");
					state = scan.nextLine();
					i = c.iterator();
					Iterator<AddressBookSystemUC8> i1 = c1.iterator();
					while(i.hasNext() && i1.hasNext()) {
						AddressBookSystemUC8 e = i.next();
						if(e.getState() == state) {
							System.out.println(e);
							found = true;
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}
					break;
				}
			}while(choise != 0);
		}

	}
}
