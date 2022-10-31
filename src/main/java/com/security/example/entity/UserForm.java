package com.security.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserForm {


    @Id
     @GeneratedValue
    private int id;
    @Column(unique=true)
    private String userName;
    private String password;
    @OneToMany(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="user_id")
    private List<RoleForm> role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<RoleForm> getRole() {
        return role;
    }

    public void setRole(List<RoleForm> role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
