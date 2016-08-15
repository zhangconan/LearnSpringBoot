package com.zkn.learnspringboot.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2016/8/14.
 */
@ConfigurationProperties(prefix = "redis")
@Component
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

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
