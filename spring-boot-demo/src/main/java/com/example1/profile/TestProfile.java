package com.example1.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example1.profile")
public class TestProfile {

  public TestProfile() {
    System.out.println("TestConfiguration容器启动初始化。。。");
  }

//  @Bean
//  @Scope("prototype")
//  public Person testPerson() {
//    return new Person();
//  }

}
