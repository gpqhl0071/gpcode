package com.example.demo.config;

import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gao peng
 * @date 2019/1/7 15:54
 */
@Configuration
public class RabbitConfig {
  @Bean
  public Queue helloQueue() {
    return new Queue("hello");
  }
}
