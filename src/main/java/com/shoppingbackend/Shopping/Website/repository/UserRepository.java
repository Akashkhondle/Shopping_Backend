package com.shoppingbackend.Shopping.Website.repository;

import com.shoppingbackend.Shopping.Website.model.ApplicationUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {

    HashMap<String, ApplicationUser> userDB = new HashMap<>();

    public void  saveUser(ApplicationUser user)
    {
        String mail = user.getEmail();
        userDB.put(mail,user);
    }

    public ApplicationUser getUser(String email) {
        ApplicationUser user = userDB.get(email);
        return user;

    }

    public void updateUser(ApplicationUser user,String email) {
        userDB.put(email,user);

    }

    public void deleteUser(String email) {
        userDB.remove(email);
    }

    public HashMap<String, ApplicationUser> getDetails() {
        return userDB;
    }
}
