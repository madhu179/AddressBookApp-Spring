package com.bridgelabz.addressbookapp.controller;

import java.util.List;

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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getAddressBookData(){
		return  new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookDataForID(@PathVariable("id") int id){
		return  new ResponseEntity<String>("Get Call Success for the id "+id, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody String str){
		return  new ResponseEntity<String>("Create Call Success for data "+str, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateAddressBookData(@PathVariable("id") int id){
		return  new ResponseEntity<String>("Update Call Success for data "+id, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAddressBookDataForID(@PathVariable("id") int id){
		return  new ResponseEntity<String>("Delete Call Success for the id "+id, HttpStatus.OK);
	}

}
