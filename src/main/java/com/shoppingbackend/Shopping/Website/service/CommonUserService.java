package com.shoppingbackend.Shopping.Website.service;

import com.shoppingbackend.Shopping.Website.exception.UserNotFound;
import com.shoppingbackend.Shopping.Website.exception.WrongCredential;
import com.shoppingbackend.Shopping.Website.model.AppUser;
import com.shoppingbackend.Shopping.Website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CommonUserService {

    @Autowired
    private UserRepository userRepository;

    public String authenticate(String token)
    {
        String [] userCredentials= token.split(":");
        String userEmail = userCredentials[0];
        String  userPassword = userCredentials[1];

        AppUser appUser = userRepository.findByEmail(userEmail);
        if(appUser == null)
        {
            throw new UserNotFound(String.format("User with email %s does not exist in system",userEmail));

        }
        String originalPassword = appUser.getPassword();
        if(originalPassword.equals(userPassword))
        {
            return "Authentication Successful";
        }
        else {
            throw  new WrongCredential("Wrong credentials entered by user");

        }




    }
    public AppUser getUserById(UUID Id)
    {
        AppUser appUser = userRepository.findById(Id).orElse(null);
        return appUser;
    }

    public  void register()
    {

    }
}
