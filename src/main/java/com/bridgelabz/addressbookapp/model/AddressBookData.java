package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	
	int id;
	String firstName;
	String lastName;
	String address;
	
	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
