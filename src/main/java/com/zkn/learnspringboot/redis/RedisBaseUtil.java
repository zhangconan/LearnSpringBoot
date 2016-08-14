package com.zkn.learnspringboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by zkn on 2016/8/14.
 */
public class RedisBaseUtil {

    @Autowired
    private ShardedJedisPool shardedJedisPool;

    public static ShardedJedis getShardedJedis(){

        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        if(shardedJedis == null)
            return null;
        return shardedJedis;
    }

    public static void releaseShardedJedis(ShardedJedis shardedJedis){

        if(shardedJedis = null)
            return;
        if(shardedJedisPool.getResource() == null)
            return;
        shardedJedisPool.getResource().close();
    }
}
