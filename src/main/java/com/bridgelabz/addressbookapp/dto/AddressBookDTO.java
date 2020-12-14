package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="First Name Invalid")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Last Name Invalid")
	public String lastName;
	
	@Pattern(regexp = "[A-Za-z,/:.0-9\\s]{3,}", message="Address Invalid")
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
