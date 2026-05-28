package com.shoppingbackend.Shopping.Website.service;

import com.shoppingbackend.Shopping.Website.model.ApplicationUser;
import com.shoppingbackend.Shopping.Website.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository item = new UserRepository();
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
}
