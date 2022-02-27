package com.csci5308.w22.wiseshopping.screens;

import com.csci5308.w22.wiseshopping.exceptions.MenuInterruptedException;
import com.csci5308.w22.wiseshopping.service.MerchantService;
import com.csci5308.w22.wiseshopping.service.UserService;
import com.csci5308.w22.wiseshopping.utils.Constants;
import com.csci5308.w22.wiseshopping.factory.ScreenFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

/**
 * @author Elizabeth James
 */
@Component
public class LoginScreen implements Screen{
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginScreen.class);

    private List<String> validScreens;

    private Scanner scanner;

    private MerchantService merchantService;

    private UserService userService;



    @Autowired
    public LoginScreen(Scanner scanner, MerchantService merchantService, UserService userService) {
        this.scanner = scanner;
        this.merchantService = merchantService;
        this.userService = userService;
        validScreens = List.of("register" ,"dummy");

    }

    @Override
    public void render(ScreenFactory screenFactory) {
        LOGGER.info("***LOGIN Screen****");
        LOGGER.info("use : for additional navigation");
        try{
        String input = "";
        LOGGER.info("Are you a merchant or a user?");
        input = scan(scanner);
        LOGGER.info("Enter <username> <password>");
        String username =scan(scanner);
        String password = scan(scanner);
        if (Constants.MERCHANT.equalsIgnoreCase(input)){
            merchantService.loginMerchant(username, password);
        }
        if (Constants.USER.equalsIgnoreCase(input)){
            userService.loginUser(username, password);
        }}
        catch (MenuInterruptedException e){
            getNavigations(screenFactory,validScreens,LOGGER,scanner);
        }
    }



   
}
