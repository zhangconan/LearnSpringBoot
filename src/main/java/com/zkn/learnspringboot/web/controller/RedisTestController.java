package com.zkn.learnspringboot.web.controller;

import com.zkn.learnspringboot.redis.RedisStringUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by zkn on 2016/8/15.
 */
@Controller
@ResponseBody
public class RedisTestController {

    @Autowired
    private RedisStringUtil redisStringUtil;

    @ApiIgnore
    @RequestMapping("/putStringkey.do")
    public String putString(@RequestParam String key) {
        redisStringUtil.putString(key, key);
        return "保存成功";
    }

    /**
     * @ApiImplicitParams 用在方法上包含一组参数说明
     * @ApiImplicitParam 用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
     * paramType：参数放在哪个地方
     * header–>请求参数的获取：@RequestHeader
     * query–>请求参数的获取：@RequestParam
     * path（用于restful接口）–>请求参数的获取：@PathVariable
     * body（不常用）
     * form（不常用）
     * name：参数名
     * dataType：参数类型
     * required：参数是否必须传
     * value：参数的意思
     * defaultValue：参数的默认值
     * @ApiOperation 用在方法上，说明方法的作用
     */
    @RequestMapping("/getStringkey.do")
    @ApiOperation(value = "根据传入的参数获取相应的值", notes = "根据传入的参数获取相应的值", produces = MediaType.APPLICATION_JSON_VALUE,
        httpMethod = "GET")
    @ApiImplicitParams(value = {
        @ApiImplicitParam(name = "key", value = "Redis中的键", required = true, dataType = "String", paramType = "query")
    })
    public String getString(@RequestParam String key) {

        return redisStringUtil.getString(key);
    }
}
