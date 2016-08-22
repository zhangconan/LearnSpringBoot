package com.zkn.learnspringboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by zkn on 2016/8/14.
 */
@Component
public class RedisExampleBean {

    @Autowired
    private RedisArguments redisArguments;
    @Bean
    private JedisPool getJedisPoll(){

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        String[] strServer = redisArguments.getServerName().split(":");
        return new JedisPool(jedisPoolConfig,strServer[0],Integer.parseInt(strServer[1]));
    }
    @Bean
    private JedisConnectionFactory getJedisConnectionFactory(){
        String[] strServer = redisArguments.getServerName().split(":");
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(strServer[0]);
        jedisConnectionFactory.setPort(Integer.parseInt(strServer[1]));
        jedisConnectionFactory.setTimeout(redisArguments.getTimeout());
        return jedisConnectionFactory;
    }


}
