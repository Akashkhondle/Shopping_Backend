package com.shoppingbackend.Shopping.Website.controller;

import com.shoppingbackend.Shopping.Website.model.ApplicationUser;
import com.shoppingbackend.Shopping.Website.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService service = new UserService();
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
}
