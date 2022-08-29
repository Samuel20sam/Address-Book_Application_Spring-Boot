package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressBookApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AddressBookApplication.class, args);
        log.info("AddressBook App Started in {} Environment", applicationContext.getEnvironment().getProperty("environment"));
        log.info("AddressBook App started");
		System.out.println("\n\n ------ Welcome to Address Book Application ------");
    }
}