package com.shoppingbackend.Shopping.Website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    //http://localhost:8080/hello

    @GetMapping("/hello")
    public String SayHello()
    {
        return "Hey this is Akash first spring boot project";
    }

    @PostMapping("/api/register")
    public void createAccount(@RequestBody ApplicationUser user)
    {
       System.out.println(user.getFirstName());
       System.out.println(user.getLastName());
       System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());


    }
}
