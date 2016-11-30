package com.zkn.learnspringboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb-zhangkenan on 2016/11/30.
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("home")
    public String getHome(){

        return "home";
    }
}
