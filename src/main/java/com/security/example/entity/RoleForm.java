package com.security.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoleForm {

    @Id
    @GeneratedValue
    private int id;
    private String roles;
    public RoleForm()
    {

    }
    public RoleForm(String role)
    {
        this.roles=role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
