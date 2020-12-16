package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	
	int id;
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phone;
	String email;
	
	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.updateAddressBookData(addressBookDTO);
	}

	private void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phone = addressBookDTO.phone;
		this.email = addressBookDTO.email;
		
	}

}
