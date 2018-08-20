package com.example;

import com.example.service.TestServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDubboClientApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(SpringBootDubboClientApplication.class, args);

    TestServiceImpl t = run.getBean(TestServiceImpl.class);
    System.out.println(t.test());
  }
}
