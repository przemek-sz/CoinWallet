package com.szczerbap.springsecurityangularjs.service;

import com.szczerbap.springsecurityangularjs.dto.AllUserDto;
import com.szczerbap.springsecurityangularjs.dto.UserRegistrationDto;
import com.szczerbap.springsecurityangularjs.model.User;

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
