package com.csci5308.w22.wiseshopping.screens;

import com.csci5308.w22.wiseshopping.exceptions.MenuInterruptedException;
import com.csci5308.w22.wiseshopping.factory.ScreenFactory;
import com.csci5308.w22.wiseshopping.models.Merchant;
import com.csci5308.w22.wiseshopping.models.User;
import com.csci5308.w22.wiseshopping.service.LocationService;
import com.csci5308.w22.wiseshopping.service.MerchantService;
import com.csci5308.w22.wiseshopping.service.StoreService;
import com.csci5308.w22.wiseshopping.service.UserService;
import com.csci5308.w22.wiseshopping.utils.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.when;

/**
 * @author Elizabeth James
 */

@ExtendWith(MockitoExtension.class)
public class RegistrationScreenTests {
    @Mock
    private Scanner scanner;
    @Mock
    private MerchantService merchantService;

    @Mock
    private Merchant merchant;
    @Mock
    private User user;

    @Mock
    private ScreenFactory screenFactory;

    @Mock
    private LocationService locationService;
    @Mock
    private StoreService storeService;
    @Mock
    private UserService userService;

    @Mock
    private Logger logger;


    @InjectMocks
    private RegistrationScreen registrationScreen;

    @InjectMocks
    private StoreScreen storeScreen;
    @InjectMocks
    private MerchantMenuScreen merchantMenuScreen;


    @BeforeEach
    public void setUp() {
        registrationScreen.setMerchant(merchant);
        registrationScreen.setUser(user);
    }

    @Test
    public void testRenderForMerchant() {
        when(screenFactory.getScreen(Constants.STORE_MENU)).thenReturn(storeScreen);
        when(screenFactory.getScreen(Constants.MERCHANT_MENU)).thenReturn(merchantMenuScreen);
        when(scanner.next()).thenReturn("merchant").thenReturn("zil").thenReturn("zil@zil.com").thenReturn("zil").thenReturn("1").thenReturn("add").thenReturn("s s 11 11 s").thenReturn("d d d d");
        Assertions.assertTrue(registrationScreen.render(screenFactory));
    }

    @Test
    public void testRenderForUser() {
        when(scanner.next()).thenReturn("user").thenReturn("zil").thenReturn("zil@zil.com").thenReturn("zil");
        //TODO : write scanner inputs post implementation
        Assertions.assertTrue(registrationScreen.render(screenFactory));

    }

    //@Test
    public void testNavigation(){
        List<String> list = List.of("register","login");
        when(scanner.next()).thenReturn("login");
        Assertions.assertTrue(registrationScreen.getNavigations(screenFactory, list,logger, scanner));

    }

}
