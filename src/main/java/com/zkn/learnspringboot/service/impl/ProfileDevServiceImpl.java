package com.zkn.learnspringboot.service.impl;

import com.zkn.learnspringboot.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/8/29.
 * 这里的注解可以不用Service，使用Configuration注解也可以。
 */
@Profile(value = "dev")
@Service
public class ProfileDevServiceImpl implements ProfileService {

    public ProfileDevServiceImpl() {

        System.out.println("我是开发环境。。。。。");
    }

    @Override
    public String getProfileDomain() {
        StringBuilder sb = new StringBuilder();
        sb.append("我在开发环境，").append("我只能吃加班餐：大米饭。。。。");
        return sb.toString();
    }
}
