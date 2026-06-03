package com.shoppingbackend.Shopping.Website.service;

import com.shoppingbackend.Shopping.Website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository item;
    public void createUser(ApplicationUser user) {
        item.saveUser(user);
    }

    public ApplicationUser getUser(String email) {
        ApplicationUser user =item.getUser(email);
        return user;
    }


    public void updateUser(ApplicationUser user,String email) {
        item.updateUser(user,email);
    }

    public void deleteUser(String email) {
        item.deleteUser(email);
    }


}
