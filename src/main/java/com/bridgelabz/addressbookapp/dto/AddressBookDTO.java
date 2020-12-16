package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="First Name Invalid")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Last Name Invalid")
	public String lastName;
	
	@Pattern(regexp = "[A-Za-z,/:.0-9\\s]{3,}", message="Address Invalid")
	public String address;
	
	@NotNull(message="city should not be Empty")
	public String city;
	
	@NotNull(message="state should not be Empty")
	public String state;
	
	@Pattern(regexp = "^[0-9]{3}[\\s]*[0-9]{2,}$", message="Zip Invalid")
	public String zip;
	
	@Pattern(regexp = "^[1-9][0-9]{9}$", message="Phone Number Invalid")
	public String phone;
	
	@Pattern(regexp = "^[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2,}$", message="Email Invalid")
	public String email;

}
