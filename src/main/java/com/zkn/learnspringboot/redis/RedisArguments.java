package com.zkn.learnspringboot.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zkn on 2016/8/14.
 */
@ConfigurationProperties(prefix = "redis.")
public class RedisArguments {

    /**
     * redis的服务地址
     */
    private String serverName;
    /**
     * 超时时间
     */
    private Integer timeout;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
