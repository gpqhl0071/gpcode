package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gao peng
 * @date 2018/11/13 11:35
 */
@Controller
public class ControllerA {

  @RequestMapping("/test")
  public void test(){
    System.out.println("A============");
  }
}
