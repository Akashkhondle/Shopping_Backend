package com.shoppingbackend.Shopping.Website.controller;

import com.shoppingbackend.Shopping.Website.exception.UserNotFound;
import com.shoppingbackend.Shopping.Website.exception.WrongCredential;
import com.shoppingbackend.Shopping.Website.model.AppUser;
import com.shoppingbackend.Shopping.Website.service.CommonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class commonController {

     @Autowired
     private CommonUserService commonUserService;

    @GetMapping("/login")
    public String authenticate(@RequestHeader String token)
    {
        try{
            String result = commonUserService.authenticate(token);
            return result;
        }catch (WrongCredential e)
        {
            return e.getMessage();
        }catch(UserNotFound e)
        {
            return e.getMessage();
        }
    }

    @PostMapping("/register")
    public void register(@RequestBody AppUser appUser)
    {

    }
}
