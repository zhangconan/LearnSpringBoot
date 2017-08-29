package com.zkn.learnspringboot.service.impl;

import com.zkn.learnspringboot.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/8/29.
 * 这里的注解可以不用Service，使用Configuration注解也可以。
 */
@Profile(value = "prod")
@Service
public class ProfileProdServiceImpl implements ProfileService {

    public ProfileProdServiceImpl() {

        System.out.println("我是生产环境。。。。。");
    }

    @Override
    public String getProfileDomain() {
        StringBuilder sb = new StringBuilder();
        sb.append("我在生产环境，").append("我可以吃鸡鸭鱼牛羊肉。。。。");
        return sb.toString();
    }
}
