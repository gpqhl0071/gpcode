package com.example1.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProfileMain {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestProfile.class);

    Person p = (Person) applicationContext.getBean(Person.class);

    p.speak();
  }
}
