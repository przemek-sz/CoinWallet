package com.szczerbap.springsecurityangularjs.controller;

import com.szczerbap.springsecurityangularjs.dto.AllUserDto;
import com.szczerbap.springsecurityangularjs.dto.UserRegistrationDto;
import com.szczerbap.springsecurityangularjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Przemek on 01.10.2017.
 */
@RestController
@RequestMapping("/api/user")
public class UserRestConntroller {

    @Autowired
    UserService userService;


    //==============================================================================
    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody UserRegistrationDto userDto){

        userService.addUser(userDto);
    }
    //==============================================================================
    public void updateUser(){

    }
    //==============================================================================
    @RequestMapping(method = RequestMethod.GET)
    public List<AllUserDto> getAllUsers(){

        return userService.getAllUsers();

    }
    //==============================================================================
    //public User getUserByUserName(String userName){

       // return userService.getByUsername(userName);
   // }
    //==============================================================================
    @RequestMapping(value="/{userName}",method = RequestMethod.DELETE)
    public void removeUser(@PathVariable String userName){
        System.out.println(userName);
        userService.removeUser(userService.getByUserName(userName));
}
    //==============================================================================
}
