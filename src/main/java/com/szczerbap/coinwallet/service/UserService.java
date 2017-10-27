package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.dto.AllUserDto;
import com.szczerbap.coinwallet.dto.UserRegistrationDto;
import com.szczerbap.coinwallet.model.User;

import java.util.List;

/**
 * Created by Przemek on 29.09.2017.
 */
public interface UserService {

    public void addUser(UserRegistrationDto user);
    public void updateUser(User user);
    public void removeUser(User user);
    public List<AllUserDto> getAllUsers();
    public User getByUserName(String username);
}
