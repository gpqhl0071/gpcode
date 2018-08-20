package com.example.controller;


import com.example.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gao peng
 * @date 2018/8/20 9:26
 */
@RestController
public class TestController {

  @Autowired
  private TestServiceImpl testServiceImpl;

  @RequestMapping(value = "/dubbo/client", method = RequestMethod.GET)
  public String test() {
    System.out.println(testServiceImpl.test());

    return testServiceImpl.test();
  }
}
