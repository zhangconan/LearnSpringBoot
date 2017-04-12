package com.zkn.learnspringboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by wb-zhangkenan on 2016/11/30.
 */
@ApiIgnore
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("home")
    public String getHome(){

        return "home";
    }
}
