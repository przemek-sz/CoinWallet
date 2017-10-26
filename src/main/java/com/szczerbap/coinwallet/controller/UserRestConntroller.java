package com.szczerbap.coinwallet.controller;

import com.szczerbap.coinwallet.dto.UserDto;
import com.szczerbap.coinwallet.model.User;
import com.szczerbap.coinwallet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemek on 01.10.2017.
 */
@RestController
@RequestMapping("/api/user")
public class UserRestConntroller {

    @Autowired
    UserService userService;



    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
        System.out.print("Dodawanie");
    }

    public void updateUser(){

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getAllUsers(){

        return userService.getAllUsers();

    }

    //public User getUserByUserName(String userName){

       // return userService.getByUsername(userName);
   // }
}
