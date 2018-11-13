package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

/**
 * @author gao peng
 * @date 2018/11/13 10:52
 */

@Service("redisService")
public class RedisService {
  @Autowired //操作字符串的template，StringRedisTemplate是RedisTemplate的一个子集
  private StringRedisTemplate stringRedisTemplate;

  @Autowired  // RedisTemplate，可以进行所有的操作
  private RedisTemplate<Object, Object> redisTemplate;

  public Object get(String key) {
    return stringRedisTemplate.opsForValue().get(key);
  }

  public Set getAllKey(String pattern) {
    Set set = stringRedisTemplate.keys(pattern);
    return set;
  }

  public void setStr(String key, String value) {
    stringRedisTemplate.opsForValue().set(key, value);
  }
}
