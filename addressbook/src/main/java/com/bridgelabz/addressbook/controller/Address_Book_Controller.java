package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.DTO.Address_Book_DTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address_book")
public class Address_Book_Controller {

    @PostMapping("/create")
    public ResponseEntity<String> createAddressBookData(@RequestBody Address_Book_DTO address_Book_DTO) {
        return new ResponseEntity<>("Created a new Address Book Entry " + address_Book_DTO, HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<String> readAddressBookData() {
        return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{firstName}")
    public ResponseEntity<String> readAddressBookDataByName(@PathVariable("firstName") String firstName) {
        return new ResponseEntity<>("Get Call Success for id: " + firstName, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody Address_Book_DTO address_Book_DTO) {
        return new ResponseEntity<>("Updated Address Book Data for: " + address_Book_DTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{firstName}")
    public ResponseEntity<String> deleteAddressBookDataByName(@PathVariable("firstName") String firstName) {
        return new ResponseEntity<>("Delete Call Success for id: " + firstName, HttpStatus.OK);
    }

}
