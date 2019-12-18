package com.example1.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
    Cat cat = (Cat) applicationContext.getBean("cat");
    cat.say();
  }
}
