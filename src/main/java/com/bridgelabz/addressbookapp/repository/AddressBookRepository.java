package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

}
