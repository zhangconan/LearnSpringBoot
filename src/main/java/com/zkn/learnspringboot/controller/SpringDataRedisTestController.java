package com.zkn.learnspringboot.controller;

import com.zkn.learnspringboot.domain.PersonDomain;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkn on 2016/8/21.
 */
@Controller
@ResponseBody
public class SpringDataRedisTestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("putSpringRedisTemplemetSave.do")
    public String putSpringRedisTemplemet(){
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();
        StringRedisSerializer serializer = new StringRedisSerializer();
        stringRedisTemplate.setKeySerializer(serializer);
        stringRedisTemplate.setValueSerializer(serializer);
        PersonDomain personDomain = new PersonDomain();
        personDomain.setId(1);
        personDomain.setPassWord("zhangsanlisia");
        personDomain.setUserName("张三娜丽丝");
        valueOperations.set("1",personDomain.getUserName());
        return "保存成功了！！！！";
    }
    @RequestMapping("getSpringRedisTemplemetSave.do")
    public String getSpringRedisTemplemet(HttpServletRequest request){
        String str = request.getParameter("key");
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();
        return (String) valueOperations.get(str);
    }
}
