package com.zkn.learnspringboot.controller;

import com.zkn.learnspringboot.domain.PersonDomain;
import com.zkn.learnspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkn on 2016/8/11.
 */
@Controller
@ResponseBody
public class ConfigPropertiesController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/configProperties.do")
    public PersonDomain home(){

        return personService.getPersonDomain();
    }

    @RequestMapping("/configPropertiesString.do")
    public String home1(){

        return "读取配置问";
    }

}
