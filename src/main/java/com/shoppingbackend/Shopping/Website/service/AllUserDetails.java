package com.shoppingbackend.Shopping.Website.service;

import com.shoppingbackend.Shopping.Website.model.ApplicationUser;
import com.shoppingbackend.Shopping.Website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AllUserDetails {

    @Autowired
    private UserRepository i;

    public List<String> getDetails() {
        HashMap<String, ApplicationUser> ans = i.getDetails();
        List<String> names = new ArrayList<>();

        for(String user:ans.keySet())
        {
            ApplicationUser u = ans.get(user);
            String name = u.getFirstName();
            names.add(name);
        }

        return names;
    }
}
