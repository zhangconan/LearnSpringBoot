package com.zkn.learnspringboot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by zkn on 2017/8/29.
 */
@ConfigurationProperties("profile.test")
@Component
public class ProfileDomain implements Serializable {

    private static final long serialVersionUID = 2092752356451204202L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "ProfileDomain{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
