package com.scheduled.propertiesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scheduled2.xml");

    applicationContext.getBean(DemoServicePropertiesExample.class);
  }
}
