package com.zkn.learnspringboot.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by wb-zhangkenan on 2016/12/1.
 */
@ControllerAdvice(basePackages = "com.zkn.learnspringboot.web.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice{

    public JsonpAdvice() {

        super("callback","jsonp");
    }
}
