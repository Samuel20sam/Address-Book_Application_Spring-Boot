package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService_Implementation implements AddressBookService{

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        return new AddressBookData(1, addressBookDTO);
    }

    @Override
    public AddressBookData readAddressBookDataByID(int addressBookID) {
        return new AddressBookData(1, new AddressBookDTO
                ("Samuel", "Elijah", "Male", //LocalDate.parse("20-01-1994"),
                        "samuel20sam@gmail.com", 9600020569L, 7043132427L,
                        "OMR", "Chennai", "TN", 600119));
    }

    @Override
    public List<AddressBookData> readAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO
                ("Samuel", "Elijah", "Male", //LocalDate.parse("20-01-1994"),
                        "samuel20sam@gmail.com", 9600020569L, 7043132427L,
                        "OMR", "Chennai", "TN", 600119)));
        return addressBookDataList;
    }

    @Override
    public AddressBookData updateAddressBookDataByID(int addressBookID, AddressBookDTO addressBookDTO) {
        return new AddressBookData(addressBookID, addressBookDTO);
    }

    @Override
    public AddressBookData deleteAddressBookDataByID(int addressBookID, AddressBookDTO addressBookDTO) {
        return null;
    }
}
