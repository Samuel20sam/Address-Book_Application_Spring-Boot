package com.bridgelabz.addressbook.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@ToString
@NoArgsConstructor
public class Address_Book_DTO {
    public String firstName;
    public String lastName;
    public String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    public LocalDate dOB;
    public String emailID;
    public Long phoneNumber;
    public Long alternatePhoneNumber;
    public String address;
    public String city;
    public String state;
    public Long pincode;
}