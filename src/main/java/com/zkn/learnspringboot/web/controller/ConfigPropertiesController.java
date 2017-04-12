package com.zkn.learnspringboot.web.controller;

import com.zkn.learnspringboot.domain.PersonDomain;
import com.zkn.learnspringboot.service.PersonService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkn on 2016/8/11.
 * https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X
 */
@Controller
@ResponseBody
public class ConfigPropertiesController {

    @Autowired
    private PersonService personService;

    @ApiOperation(value = "测试属性值", notes = "测试属性值",produces = MediaType.APPLICATION_JSON_VALUE,httpMethod="GET")
    @RequestMapping(value = "/configProperties.do")
    public PersonDomain home() {

        return personService.getPersonDomain();
    }

    @ApiOperation(value = "测试接口2", notes = "参数描述",produces = MediaType.APPLICATION_JSON_VALUE,httpMethod = "GET")
    @RequestMapping("/configPropertiesString.do")
    public String home1() {

        return "读取配置问";
    }
    @RequestMapping("testApiModel")
    @ApiOperation(value = "用来测试@ApiModel",notes = "用来测试@ApiModel",produces = MediaType.APPLICATION_JSON_VALUE,httpMethod = "POST")
    @ApiResponses(value = {
        @ApiResponse(code = 2000,message = "请求正常返回"),
        @ApiResponse(code = 404,message = "找不到请求页面")
    })
    public PersonDomain testApiModel(PersonDomain personDomain) {

        return new PersonDomain();
    }
}
