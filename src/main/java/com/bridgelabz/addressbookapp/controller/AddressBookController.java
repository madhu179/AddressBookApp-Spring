package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Miles", "Morales","1/14 elm street New York"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookDataForID(@PathVariable("id") int id){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Miles", "Morales","1/14 elm street New York"));
		ResponseDTO respDTO = new ResponseDTO("Get Call For Id "+id+"Successful", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);	
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookDataForID(@PathVariable("id") int id){
		ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook Data Successfully", "Deleted ID : "+id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
