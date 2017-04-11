package com.zkn.learnspringboot.web.controller;

import com.zkn.learnspringboot.domain.PersonDomain;
import com.zkn.learnspringboot.service.PersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkn on 2016/8/11.
 */
@Controller
@ResponseBody
public class ConfigPropertiesController {

    @Autowired
    private PersonService personService;

    @ApiOperation(value = "测试接口1", notes = "简单接口描述 userName必填", code = 200, produces = MediaType.APPLICATION_JSON_VALUE,httpMethod="GET")
    @RequestMapping(value = "/configProperties.do")
    public PersonDomain home() {

        return personService.getPersonDomain();
    }

    @ApiOperation(value = "测试接口2", notes = "参数描述", code = 200, produces = MediaType.APPLICATION_JSON_VALUE,httpMethod = "GET")
    @RequestMapping("/configPropertiesString.do")
    public String home1() {

        return "读取配置问";
    }

}
