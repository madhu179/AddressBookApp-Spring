package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="First Name Invalid")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Last Name Invalid")
	public String lastName;
	
	@Pattern(regexp = "[A-Za-z,/:.0-9\\s]{3,}", message="Address Invalid")
	public String address;
	
	public String city;
	public String state;
	public String zip;
	public String phone;
	public String email;

}
