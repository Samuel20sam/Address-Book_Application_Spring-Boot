package com.bridgelabz.addressbook.DTO;

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

    public AddressBookDTO(String firstName, String lastName, String gender, //LocalDate dOD,
                          String emailID, long phoneNumber, long alternatePhoneNumber, String address, String city,
                          String state, String pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
//        this.dOB = dOD;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
        this.alternatePhoneNumber = alternatePhoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
//                ", dOB=" + dOB +
                ", emailID='" + emailID + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", alternatePhoneNumber=" + alternatePhoneNumber +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}