package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author gao peng
 * @date 2018/8/20 9:46
 */
@Component
public class TestServiceImpl {

  @Reference(version = "1.0.0")
  TestDubboService testDubboService;

  public String test() {
    return testDubboService.test();
  }
}
