package com.example.springsecuritybasic.UserInfoDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoDetailsServices{
    @Autowired
    private UserInfoDetailsRepository userDetailsRepository;


    public UserInfoDetails getUserByEmail(String email){
        List<UserInfoDetails> allUsers = userDetailsRepository.findAll();
        for (UserInfoDetails u: allUsers
             ) {
            if (u.getEmail().equals(email)){
                return u;
            }
        }
        return new UserInfoDetails();
    }
}
