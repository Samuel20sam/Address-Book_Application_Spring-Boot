package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.exception.AddressBookException;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService_Implementation implements AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;
    private final List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        System.out.println("Initial List size " +addressBookDataList.size());
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size() + 1,
                addressBookDTO);
        addressBookDataList.add(addressBookData);
        System.out.println("Final List size " +addressBookDataList.size());
        log.debug("Address Book : " +addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData readAddressBookDataByID(int addressBookID) {
        return addressBookRepository.findById(addressBookID).orElseThrow(() -> new AddressBookException
                ("User Not Found"));
    }

    @Override
    public List<AddressBookData> readAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData updateAddressBookDataByID(int addressBookID, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.readAddressBookDataByID(addressBookID);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookDataByID(int addressBookID) {
        AddressBookData addressBookData = this.readAddressBookDataByID(addressBookID);
        addressBookRepository.delete(addressBookData);
    }
    @Override
    public List<AddressBookData> sortAddressBookByCity() {
        return addressBookRepository.sortByCity();
    }

    @Override
    public List<AddressBookData> getAddressBookByCity(String city) {
        return addressBookRepository.findAllByCity(city);
    }

    @Override
    public List<AddressBookData> sortAddressBookByState() {
        return addressBookRepository.sortByState();
    }

    @Override
    public List<AddressBookData> getAddressBookByState(String state) {
        return addressBookRepository.findAllByState(state);
    }

    @Override
    public List<AddressBookData> sortAddressBookByZip() {
        return addressBookRepository.sortByZip();
    }

    @Override
    public List<AddressBookData> getAddressBookByZip(String zip) {
        return addressBookRepository.findAllByZip(zip);
    }

    @Override
    public List<AddressBookData> sortAddressBookByName() {
        return addressBookRepository.sortByName();
    }
}