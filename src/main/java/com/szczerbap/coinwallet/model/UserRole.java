package com.szczerbap.coinwallet.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Przemek on 29.09.2017.
 */
@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
    /////////////////////////////////////////////////////////////////////////////////////////


    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
