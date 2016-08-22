package com.zkn.learnspringboot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by zkn on 2016/8/11.
 */
@ConfigurationProperties(prefix = "person")
@Component
public class PersonDomain implements Serializable{

    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * m密码
     */
    private String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
