package com.springdemo.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
}
