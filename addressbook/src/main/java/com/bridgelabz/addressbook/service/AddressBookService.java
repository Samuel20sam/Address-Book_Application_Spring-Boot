package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

import java.util.List;

public interface AddressBookService {
    AddressBookData createAddressBookData (AddressBookDTO addressBookDTO);
    AddressBookData readAddressBookDataByID (int addressBookID);
    List<AddressBookData> readAddressBookData ();
    AddressBookData updateAddressBookDataByID (int addressBookID, AddressBookDTO addressBookDTO);
    void deleteAddressBookDataByID (int addressBookID);
}
