package com.example.springsecuritybasic.Config.UserDetailsConfig;

import com.example.springsecuritybasic.UserInfoDetails.UserInfoDetails;
import com.example.springsecuritybasic.UserInfoDetails.UserInfoDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsConfigService implements UserDetailsService {

    @Autowired
    UserInfoDetailsServices userInfoDetailsServices;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfoDetails user= userInfoDetailsServices.getUserByEmail(username);
        UserDetailsConfig configUser = new UserDetailsConfig();
        configUser.setUserName(user.getEmail());
        configUser.setPassword(user.getPassword());
        configUser.setRole(user.getRole());
        return configUser;
    }
}
