package com.csci5308.w22.wiseshopping.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;

/**
 * @author Elizabeth James
 */
@Slf4j
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        try {
            // TODO: Scanner code
        }
        catch (DataAccessException e){
            log.error(e.getMessage());
        }
    }
}
