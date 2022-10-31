package com.security.example.repository;

import com.security.example.entity.RoleForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleForm,Integer> {
}
