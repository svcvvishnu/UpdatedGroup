package com.csci5308.w22.wiseshopping.service;

import com.csci5308.w22.wiseshopping.models.Location;
import com.csci5308.w22.wiseshopping.models.Merchant;
import com.csci5308.w22.wiseshopping.models.Store;
import com.csci5308.w22.wiseshopping.models.User;
import com.csci5308.w22.wiseshopping.repository.StoreRepository;
import com.csci5308.w22.wiseshopping.repository.UserRepository;
import com.csci5308.w22.wiseshopping.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * @author Pavithra Gunasekaran
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTests {

    @Mock
    UserRepository mockedUserRepository;

    @InjectMocks
    private UserService userService;

    private User user;


    @BeforeEach
    public void setUp(){
        user = new User("John Doe","Password123!");
    }

    @Test
    public void testLoginUser() throws Exception {
        Boolean user;
        user = userService.loginUser("johndoe@xyz.com",  "Password123!");
        Assertions.assertTrue(user);

    }
}