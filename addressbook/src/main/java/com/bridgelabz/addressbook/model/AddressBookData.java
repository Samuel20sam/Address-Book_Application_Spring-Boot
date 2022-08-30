package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "addressBook")
@NoArgsConstructor
public class AddressBookData {
    @Id
    @GeneratedValue()
    @Column(name = "Id")
    private int addressBookID;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Date_of_Birth")
    private LocalDate dOB;
    @Column(name = "E_Mail_ID")
    private String emailID;
    @Column(name = "Phone_Number")
    private String phoneNumber;
    @Column(name = "Alternate_Phone_Number")
    private String alternatePhoneNumber;
    @Column(name = "Address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Pincode")
    private String pincode;


    public AddressBookData(int addressBookID, AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.gender = addressBookDTO.gender;
        this.dOB = addressBookDTO.dOB;
        this.emailID = addressBookDTO.emailID;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.alternatePhoneNumber = addressBookDTO.alternatePhoneNumber;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.pincode = addressBookDTO.pincode;
    }
}