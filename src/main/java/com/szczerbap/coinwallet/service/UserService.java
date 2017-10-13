package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Przemek on 29.09.2017.
 */
public interface UserService {

    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(User user);
    public List<User> getAllUsers();
    public User getByUserName(String username);
}
