package com.csci5308.w22.wiseshopping.exceptions;

/**
 * @author Elizabeth James
 */
public class NoSuchUser extends RuntimeException{
    String message;
    public NoSuchUser(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
