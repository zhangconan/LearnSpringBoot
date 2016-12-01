package com.zkn.learnspringboot.web.controller;

import com.zkn.learnspringboot.domain.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wb-zhangkenan on 2016/12/1.
 */
@RestController
@RequestMapping("/jsonp")
public class JsonpTestController {
    @Autowired
    private PersonDomain personDomain;

    @RequestMapping(value = "/testJsonp",produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDomain testJsonp(){

        return personDomain;
    }
}
