package com.shoppingbackend.Shopping.Website.exception;


public class UserNotFound extends RuntimeException {
    public UserNotFound(String message) {
        super(message);
    }
}
