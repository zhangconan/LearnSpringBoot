package com.zkn.learnspringboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2016/8/21.
 */
@Component
public class RedisTemplementFactory {

    @Autowired
    private JedisConnectionFactory jedisConnectionFactory;

    @Bean
    private StringRedisTemplate getStringRedisTemplate(){

        return new StringRedisTemplate(jedisConnectionFactory);
    }
}
