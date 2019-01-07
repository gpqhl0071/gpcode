package com.example.demo.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author gao peng
 * @date 2019/1/7 15:52
 */
@RestController
@Component
public class Sender {
  @Autowired
  private AmqpTemplate rabbitTemplate;

  @RequestMapping(method = RequestMethod.GET, path = "/send")
  public void send() {
    String context = "hello " + new Date();
    System.out.println("Sender : " + context);
    this.rabbitTemplate.convertAndSend("hello", context);
  }
}
