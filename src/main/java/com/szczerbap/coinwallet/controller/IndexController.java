package com.szczerbap.coinwallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Przemek on 28.09.2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){

        return "/static/index.html";
    }
}
