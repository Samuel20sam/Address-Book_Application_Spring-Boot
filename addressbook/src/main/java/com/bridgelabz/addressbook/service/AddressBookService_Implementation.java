package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.exception.AddressBookException;
import com.bridgelabz.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService_Implementation implements AddressBookService {

    private final List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        System.out.println("Initial List size " +addressBookDataList.size());
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size() + 1,
                addressBookDTO);
        addressBookDataList.add(addressBookData);
        System.out.println("Final List size " +addressBookDataList.size());
        return addressBookData;
    }

    @Override
    public AddressBookData readAddressBookDataByID(int addressBookID) {
        return addressBookDataList.stream()
                .filter(addressBookData -> addressBookData.getAddressBookID() == addressBookID)
                .findFirst()
                .orElseThrow(() -> new AddressBookException("User Not Found"));
    }

    @Override
    public List<AddressBookData> readAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData updateAddressBookDataByID(int addressBookID, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.readAddressBookDataByID(addressBookID);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setGender(addressBookDTO.gender);
        addressBookData.setDOB(addressBookDTO.dOB);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setAlternatePhoneNumber(addressBookDTO.alternatePhoneNumber);
        addressBookData.setEmailID(addressBookDTO.emailID);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setPincode(addressBookDTO.pincode);
        return addressBookData;
    }

    @Override
    public AddressBookData deleteAddressBookDataByID(int addressBookID) {
        return addressBookDataList.remove(addressBookID - 1);
    }
}