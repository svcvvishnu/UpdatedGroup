package com.csci5308.w22.wiseshopping.runner;

import com.csci5308.w22.wiseshopping.service.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;

/**
 * @author Elizabeth James
 */
@Slf4j
public class Runner implements CommandLineRunner {

    @Autowired
    MerchantService merchantService;

    @Override
    public void run(String... args) {
        //TODO: Dummy code to validate jar
        merchantService.registerMerchant("John Doe","johndoe@xyz.com","password123");
        try {
            // TODO: Scanner code
        }
        catch (DataAccessException e){
            log.error(e.getMessage());
        }
    }
}
