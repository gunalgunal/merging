package com.security.example.securityconfig;

import com.security.example.entity.RoleForm;
import com.security.example.entity.UserForm;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {

    private UserForm use;
    public MyUserDetails()
    {

    }
    public MyUserDetails(UserForm use)
    {
        this.use=use;
    }

    public UserForm getUse() {
        return use;
    }

    public void setUse(UserForm use) {
        this.use = use;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       List<GrantedAuthority> list=new ArrayList<>();
   //     return use.getRole().stream().map(role -> new SimpleGrantedAuthority("ROLE_"+role)).collect(Collectors.toList());
          // list.add(new SimpleGrantedAuthority());
    //    });
       for(RoleForm role:use.getRole())
      {
         System.out.println(role.getRoles());
         System.out.println("hello");
         list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoles()));
       }
     //   list=Arrays.stream(use.getRole())
     //           .map(SimpleGrantedAuthority::new)
     //           .collect(Collectors.toList());
        //for(RoleForm role:use.getRole())
     // {
      //    System.out.println(role.getRoles());
         // list.add(new SimpleGrantedAuthority("ADMIN"));
      // }
        return list;
    }

    @Override
    public String getPassword() {
        return use.getPassword();
    }

    @Override
    public String getUsername() {
        return use.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
