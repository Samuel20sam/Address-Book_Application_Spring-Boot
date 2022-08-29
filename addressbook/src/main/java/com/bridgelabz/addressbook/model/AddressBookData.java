package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData {
    private int addressBookID;
    private String firstName;
    private String lastName;
    private String gender;
    //    @JsonFormat(pattern = "dd-MM-yyyy")
    //    private LocalDate dOB;
    private String emailID;
    private long phoneNumber;
    private long alternatePhoneNumber;
    private String address;
    private String city;
    private String state;
    private String pincode;

    public AddressBookData(int addressBookID, AddressBookDTO address_book_dto) {
        this.addressBookID = addressBookID;
        this.firstName = address_book_dto.firstName;
        this.lastName = address_book_dto.lastName;
        this.gender = address_book_dto.gender;
//        this.dOB = address_book_dto.dOB;
        this.emailID = address_book_dto.emailID;
        this.phoneNumber = address_book_dto.phoneNumber;
        this.alternatePhoneNumber = address_book_dto.alternatePhoneNumber;
        this.address = address_book_dto.address;
        this.city = address_book_dto.city;
        this.state = address_book_dto.state;
        this.pincode = address_book_dto.pincode;
    }
}