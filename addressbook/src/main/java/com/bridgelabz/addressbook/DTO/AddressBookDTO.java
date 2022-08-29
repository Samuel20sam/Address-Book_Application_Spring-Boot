package com.bridgelabz.addressbook.DTO;

import lombok.Data;

@Data
public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String gender;
    //    @JsonFormat(pattern = "dd-MM-yyyy")
    //    public LocalDate dOB;
    public String emailID;
    public long phoneNumber;
    public long alternatePhoneNumber;
    public String address;
    public String city;
    public String state;
    public String pincode;
    
}