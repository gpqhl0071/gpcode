package com.example.demo.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author gao peng
 * @date 2019/1/7 15:53
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
  @RabbitHandler
  public void process(String hello) {
    System.out.println("Receiver : " + hello);
  }
}
