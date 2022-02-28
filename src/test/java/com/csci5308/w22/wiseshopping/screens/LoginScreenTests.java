package com.csci5308.w22.wiseshopping.screens;

import com.csci5308.w22.wiseshopping.factory.ScreenFactory;
import com.csci5308.w22.wiseshopping.models.Merchant;
import com.csci5308.w22.wiseshopping.models.User;
import com.csci5308.w22.wiseshopping.repository.LocationRepository;
import com.csci5308.w22.wiseshopping.service.MerchantService;
import com.csci5308.w22.wiseshopping.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.mockito.Mockito.when;

/**
 * @author Elizabeth James
 */
@ExtendWith(MockitoExtension.class)
public class LoginScreenTests {

    @Mock
    private LocationRepository mockedLocationRepository;

    @Mock
    private Scanner scanner;

    @Mock
    private MerchantService merchantService;

    @Mock
    private UserService userService;

    @Mock
    private Merchant merchant;
    @Mock
    private User user;
    @InjectMocks
    private LoginScreen loginScreen;

    @Mock
    private ScreenFactory screenFactory;

    @BeforeEach
    public void setUp() {
        loginScreen.setMerchant(merchant);
        loginScreen.setUser(user);
    }
    @Test
    public void testLoginForMerchant(){
        Assertions.assertTrue(true);
        when(scanner.next()).thenReturn("merchant").thenReturn("zil zil@zil.com zil");
        Assertions.assertTrue(loginScreen.render(screenFactory));
    }

    @Test
    public void testLoginForUser(){
        Assertions.assertTrue(true);
        when(scanner.next()).thenReturn("user").thenReturn("zil zil@zil.com zil");
        Assertions.assertTrue(loginScreen.render(screenFactory));
    }
}
