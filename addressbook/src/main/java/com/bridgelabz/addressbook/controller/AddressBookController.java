package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.DTO.AddressBookDTO;
import com.bridgelabz.addressbook.DTO.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/address_book")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO response_dto = new ResponseDTO("Created a new Address Book Entry ", addressBookData);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<ResponseDTO> readAddressBookData() {
        List<AddressBookData> addressBookdata = addressBookService.readAddressBookData();
        ResponseDTO response_dto = new ResponseDTO("Read a Address Book Entry ", addressBookdata);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @GetMapping("/read/{addressBookID}")
    public ResponseEntity<ResponseDTO> readAddressBookDataByName(@PathVariable("addressBookID") int addressBookID) {
        AddressBookData addressBookdata = addressBookService.readAddressBookDataByID(addressBookID);
        ResponseDTO response_dto = new ResponseDTO("Successfully read the Address Book Entry of ID ",
                addressBookdata);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @PutMapping("/update/{addressBookID}")
    public ResponseEntity<ResponseDTO> updateAddressBookDataByID(@PathVariable("addressBookID") int addressBookID,
                                                                 @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.updateAddressBookDataByID(addressBookID, addressBookDTO);
        ResponseDTO response_dto = new ResponseDTO("Successfully updated the Address Book Entry ",
                addressBookData);
        return new ResponseEntity<>(response_dto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressBookID}")
    public ResponseEntity<ResponseDTO> deleteAddressBookDataByID(@PathVariable("addressBookID") int addressBookID) {
        addressBookService.deleteAddressBookDataByID(addressBookID);
        ResponseDTO responseDTO = new ResponseDTO("Delete Call Success for id: " + addressBookID, HttpStatus.OK);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}