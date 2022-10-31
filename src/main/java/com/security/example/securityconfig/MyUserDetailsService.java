package com.security.example.securityconfig;

import com.security.example.entity.UserForm;
import com.security.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<UserForm> user= repository.findByUserName(username);

       if(!user.isPresent())
           System.out.println("hello");
       MyUserDetails user1=new MyUserDetails();
       user1.setUse(user.get());
        return user1;
    }
}
