package com.example.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.setting.SettingUtil;
import com.example.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gao peng
 * @date 2018/11/13 10:56
 */
@RestController()
@RequestMapping(value = "/redis")
public class RedisController {
  @Autowired
  private RedisService redisService;

  @RequestMapping(value = "/getRedisKey/{key}", method = RequestMethod.GET)
  public void getRedisKey(@PathVariable("key") String key, HttpServletResponse response) throws Exception {
//    redisService.setStr("test", "test");

    Object o = redisService.get(key);

    response.getOutputStream().write(String.valueOf(o).getBytes());
  }

  @RequestMapping(value = "/getAllKey/{pattern}", method = RequestMethod.GET)
  public void getAllKey(@PathVariable("pattern") String pattern, HttpServletResponse response) throws Exception {

    Object o = redisService.getAllKey(pattern);

    String json = JSONUtil.toJsonPrettyStr(o);

    response.getOutputStream().write(json.getBytes());
  }


}
