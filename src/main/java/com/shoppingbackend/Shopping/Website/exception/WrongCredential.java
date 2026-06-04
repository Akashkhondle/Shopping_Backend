package com.shoppingbackend.Shopping.Website.exception;

public class WrongCredential extends RuntimeException {
    public WrongCredential(String message) {
        super(message);
    }
}
