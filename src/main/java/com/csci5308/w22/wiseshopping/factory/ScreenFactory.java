package com.csci5308.w22.wiseshopping.factory;

import com.csci5308.w22.wiseshopping.exceptions.InvalidScreenException;
import com.csci5308.w22.wiseshopping.screens.LoginScreen;
import com.csci5308.w22.wiseshopping.screens.RegistrationScreen;
import com.csci5308.w22.wiseshopping.screens.Screen;
import com.csci5308.w22.wiseshopping.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Elizabeth James
 */
@Service
public class ScreenFactory {

    @Autowired
    private LoginScreen loginScreen;
    @Autowired
    private RegistrationScreen registrationScreen;




    public Screen getScreen(String screen){
        switch (screen){
            case Constants.LOGIN: return loginScreen;
            case Constants.REGISTER: return registrationScreen;
            default: throw new InvalidScreenException("No such screen");
        }
    }


}
