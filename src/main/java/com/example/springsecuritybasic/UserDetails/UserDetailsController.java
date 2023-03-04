package com.example.springsecuritybasic.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    @PostMapping("/adduser")
    public String addUser(UserDetails user){
        userDetailsRepository.save(user);
        return "Saved...";
    }
}
