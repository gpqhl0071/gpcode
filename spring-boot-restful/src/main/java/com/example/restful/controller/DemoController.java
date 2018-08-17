package com.example.restful.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/8/17 16:36
 */
@RestController
public class DemoController {

  @RequestMapping(value = "/demo/getinfo/{name}/{sex}", method = RequestMethod.GET)
  public Map getInfo(@PathVariable("name") String name, @PathVariable("sex") String sex) {
    Map map = new HashMap();
    map.put("name", name);
    map.put("sex", sex);

    return map;
  }
}
