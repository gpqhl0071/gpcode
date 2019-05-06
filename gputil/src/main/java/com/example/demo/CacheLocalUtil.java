package com.example.demo;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;

import java.util.concurrent.TimeUnit;

import ch.qos.logback.core.util.TimeUtil;

/**
 * @author gao peng
 * @date 2019/5/6 10:02
 */
public class CacheLocalUtil {
  private static final TimedCache<String, String> timedCache = CacheUtil.newTimedCache(7200*1000);

  private  CacheLocalUtil(){
    timedCache.schedulePrune(7200*1000);
  }

  private static class  CacheLocalUtilInstance{

    private static final CacheLocalUtil instance=new CacheLocalUtil();
  }

  public static CacheLocalUtil getInstance(){
    return CacheLocalUtilInstance.instance;
  }

  public void  put(String k ,String v,long time){
    timedCache.put(k,v,time);
  };


  public String get(String k){
    String s = timedCache.get(k, false);
    return s;
  }

  public static void main(String[] args) throws Exception{
    CacheLocalUtil c = CacheLocalUtilInstance.instance;
//    c.put("test","hello", 60000);
//    System.out.println("get test = " + c.get("test"));

    c.put("Long.MAX_VALUE","testTimeOut hello", Long.MAX_VALUE);
    System.out.println("Long.MAX_VALUE result = "+ c.get("Long.MAX_VALUE"));
  }

}
