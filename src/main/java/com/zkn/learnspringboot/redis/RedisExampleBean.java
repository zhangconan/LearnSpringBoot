package com.zkn.learnspringboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zkn on 2016/8/14.
 */
@Component
@ConfigurationProperties(prefix = "redis.")
public class RedisExampleBean {

    @Autowired
    private RedisArguments redisArguments;
    @Bean
    private JedisPool getJedisPoll(){

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        String[] strServer = redisArguments.getServerName().split(":");
        jedisShardInfoList.add(new JedisShardInfo(strServer[0], Integer.parseInt(strServer[1])));
        return new JedisPool(jedisPoolConfig,jedisShardInfoList);
    }

}
