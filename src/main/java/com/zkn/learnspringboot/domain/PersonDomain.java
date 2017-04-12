package com.zkn.learnspringboot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by zkn on 2016/8/11.
 */
@ConfigurationProperties(prefix = "person")
@Component
@ApiModel(value = "PersonDomain",description = "人员信息的处理类")
public class PersonDomain implements Serializable{

    /**
     * id
     */
    @ApiModelProperty(name = "id",value = "主键ID",required = true,dataType = "Integer")
    private Integer id;
    /**
     * 用户名
     */
    @ApiModelProperty(name = "userName",value = "用户姓名",allowableValues = "zhangsan,lisi,wang",dataType = "String")
    private String userName;
    /**
     * 密码
     */
    @ApiModelProperty(name = "passWord",value = "密码",dataType = "String")
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
    @Override
    public String toString() {
        return "PersonDomain{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
