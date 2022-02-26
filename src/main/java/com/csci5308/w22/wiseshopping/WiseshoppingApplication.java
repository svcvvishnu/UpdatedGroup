package com.csci5308.w22.wiseshopping;



import com.csci5308.w22.wiseshopping.runner.Runner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WiseshoppingApplication {


    public static void main(String[] args) {
        SpringApplication.run(WiseshoppingApplication.class, args);
    }

    @Profile("!dev")
    @Bean
    public Runner getRunner(){
        return new Runner();
    }
}
