package com.example.springsecuritybasic.UserInfoDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins= {"*"}, maxAge = 2400, allowCredentials = "false" )
@RestController
public class UserInfoDetailsController {
    @Autowired
    private UserInfoDetailsRepository userDetailsRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;



    @PostMapping("/adduser")
    public String addUser(@RequestBody UserInfoDetails user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDetailsRepository.save(user);
        return "Saved...";
    }

    @GetMapping("/User")
    public String viewUser(){
        return "Hii user.";
    }
}
