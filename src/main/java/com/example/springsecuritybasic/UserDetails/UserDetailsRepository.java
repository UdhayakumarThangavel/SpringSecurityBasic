package com.example.springsecuritybasic.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
    public default UserDetails findByEmail(String username){
        UserDetails user = new UserDetails();
        user.setEmail("dev.udhayakumar");
        user.setId(1L);
        user.setFirstName("udhaya");
        user.setLastName("T");
        user.setPassword("123456");
        user.setRoles("USER");
        return user;
    }
}
