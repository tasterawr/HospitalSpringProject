package org.loktevik.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = {"/hello"})
    public String hello(){
        int i = 5;
        return "index";
    }
}
