package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.DTO.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address_book")
public class AddressBookController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO response_dto = new ResponseDTO("Created a new Address Book Entry ", addressBookData);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<ResponseDTO> readAddressBookData() {
        AddressBookData addressBookdata = new AddressBookData(1, new AddressBookDTO
                ("Samuel", "Elijah", "Male", //LocalDate.parse("20-01-1994"),
                        "samuel20sam@gmail.com", 9600020569L, 7043132427L,
                        "OMR", "Chennai", "TN", 600119));
        ResponseDTO response_dto = new ResponseDTO("Read a Address Book Entry ", addressBookdata);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @GetMapping("/read/{addressBookID}")
    public ResponseEntity<ResponseDTO> readAddressBookDataByName(@PathVariable("addressBookID") int addressBookID) {
        AddressBookData addressBookdata = new AddressBookData(addressBookID, new AddressBookDTO
                ("Samuel", "Elijah", "Male", //LocalDate.parse("20-01-1994"),
                        "samuel20sam@gmail.com", 9600020569L, 7043132427L,
                        "OMR", "Chennai", "TN", 600119));
        ResponseDTO response_dto = new ResponseDTO
                ("Successfully read the Address Book Entry of ID ", addressBookdata);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @PutMapping("/update/{addressBookID}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("addressBookID") int addressBookID,
                                                             @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookID, addressBookDTO);
        ResponseDTO response_dto = new ResponseDTO
                ("Successfully updated the Address Book Entry ", addressBookData);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressBookID}")
    public ResponseEntity<ResponseDTO> deleteAddressBookDataByName(@PathVariable("addressBookID") String firstName) {
        ResponseDTO responseDTO = new ResponseDTO("Delete Call Success for id: " + firstName, HttpStatus.OK);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}