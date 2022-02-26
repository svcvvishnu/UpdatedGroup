package com.csci5308.w22.wiseshopping.runner;

import com.csci5308.w22.wiseshopping.service.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;

import java.util.Scanner;

/**
 * @author Elizabeth James
 */
@Slf4j
public class Runner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    @Autowired
    MerchantService merchantService;

    @Override
    public void run(String... args) {
        LOGGER.info("Dummy log");

        Scanner scanner = new Scanner(System.in);
       
    }
}
