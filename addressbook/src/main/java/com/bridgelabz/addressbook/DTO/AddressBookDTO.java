package com.bridgelabz.addressbook.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "User's first name is Invalid")
    @NotEmpty(message = "Address-book name cannot be null")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "User's first name is Invalid")
    public String lastName;
    @Pattern(regexp = "Male|Female", message = "Gender needs to be male or female")
    public String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @PastOrPresent(message = "dOB should be past or today's date")
    public LocalDate dOB;
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "Email Id Is Invalid")
    public String emailID;
    @Pattern(regexp = "^[7-9][0-9]{9}$", message = "phone-number is invalid")
    public String phoneNumber;
    @Pattern(regexp = "^[7-9][0-9]{9}$", message = "phone-number is invalid")
    public String alternatePhoneNumber;
    @NotEmpty(message = "Address-book address cannot be null")
    public String address;
    @Pattern(regexp = "^[A-Z][a-z]+$", message = "City Name is Invalid")
    public String city;
    @Pattern(regexp = "([a-zA-Z]+|[a-zA-Z]+\s[a-zA-Z]+)", message = "State Name is Invalid")
    public String state;
    @Pattern(regexp = "^[1-9][0-9]{2}\\s?[0-9]{3}$", message = "Zip Code Is Invalid")
    public String pincode;
}