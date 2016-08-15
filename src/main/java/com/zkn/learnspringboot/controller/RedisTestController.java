package com.zkn.learnspringboot.controller;

import com.zkn.learnspringboot.redis.RedisStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkn on 2016/8/15.
 */
@Controller
@ResponseBody
public class RedisTestController {

    @Autowired
    private RedisStringUtil redisStringUtil;

    @RequestMapping("/putStringkey.do")
    public String putString(@RequestParam String key){
        redisStringUtil.putString(key,key);
        return "保存成功";
    }

    @RequestMapping("/getStringkey.do")
    public String getString(@RequestParam String key){

        return redisStringUtil.getString(key);
    }
}
