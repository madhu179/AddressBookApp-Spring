package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
	
	public String firstName;
	public String lastName;
	public String address;

	public AddressBookDTO(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + address + "]";
	}

}
