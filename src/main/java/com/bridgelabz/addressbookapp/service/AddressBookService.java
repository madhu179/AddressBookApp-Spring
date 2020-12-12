package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> contactList = new ArrayList<>();
		contactList.add(new AddressBookData(1, new AddressBookDTO("Miles", "Morales","1/14 elm street New York")));
		return contactList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Miles", "Morales","1/14 elm street New York"));
		return contactData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1,addressBookDTO);
		return contactData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1,addressBookDTO);
		return contactData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		
	}

}
