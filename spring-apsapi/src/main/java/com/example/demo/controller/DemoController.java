package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gao peng
 * @date 2019/6/19 14:36
 */
@RestController()
@RequestMapping(value = "/demoController")
public class DemoController {

  @RequestMapping(value = "/json", produces = "application/json;charset=UTF-8")
  public String testNullParam(HttpServletResponse response,
      HttpServletRequest request,
      @RequestBody DemoVo demoVo) throws Exception {
    System.out.println(demoVo.toString());

    return "success";
  }
}
