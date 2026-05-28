package com.shoppingbackend.Shopping.Website.controller;

import com.shoppingbackend.Shopping.Website.model.ApplicationUser;
import com.shoppingbackend.Shopping.Website.service.AllUserDetails;
import com.shoppingbackend.Shopping.Website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private AllUserDetails allservice;
    @Autowired
    private UserService service;
    @PostMapping("/api/register/user")
    public String registerUser(@RequestBody ApplicationUser user)
    {
        service.createUser(user);

        return "User Register Successfully";
    }

    @GetMapping("/api/getuser")
    public ApplicationUser getUser(@RequestParam String email)
    {
       ApplicationUser user = service.getUser(email);
       return user;

    }
    @PutMapping("api/user/update")
    public ApplicationUser updateUser(@RequestBody ApplicationUser user,@RequestParam String email)
    {
        service.updateUser(user,email);
        return service.getUser(email);
    }

    @DeleteMapping("api/user/delete")
    public String deleteUser(@RequestParam String email)
    {
        service.deleteUser(email);

        return "User Deleted Successfully";
    }

    @GetMapping("/api/user/details")
    public List<String> getDetails()
    {
      return  allservice.getDetails();
    }
}
