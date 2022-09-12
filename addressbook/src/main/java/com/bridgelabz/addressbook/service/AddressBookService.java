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
    List<AddressBookData> sortAddressBookByCity();
    List<AddressBookData> getAddressBookByCity(String city);
    List<AddressBookData> sortAddressBookByState();
    List<AddressBookData> getAddressBookByState(String state);
    List<AddressBookData> sortAddressBookByZip();
    List<AddressBookData> getAddressBookByZip(String state);
    List<AddressBookData> sortAddressBookByName();
}
