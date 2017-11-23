package com.szczerbap.coinwallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * Created by Przemek on 16.11.2017.
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public Principal login(Principal user){


        return user;
    }

}
