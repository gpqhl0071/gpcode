package com.scheduled.properties;

import com.scheduled.init.DemoService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scheduled1.xml");

    applicationContext.getBean(DemoServicePropertiesExample.class);
  }
}
