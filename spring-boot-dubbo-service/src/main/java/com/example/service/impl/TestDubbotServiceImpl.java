package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.TestDubboService;

/**
 * @author gao peng
 * @date 2018/8/20 9:19
 */
@Service(version = "1.0.0")
public class TestDubbotServiceImpl implements TestDubboService {
  @Override
  public String test() {
    return " i am dubbo service";
  }
}
