package com.security.example.repository;

import com.security.example.entity.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserForm,Integer> {



    Optional<UserForm> findByUserName(String userName);
}
