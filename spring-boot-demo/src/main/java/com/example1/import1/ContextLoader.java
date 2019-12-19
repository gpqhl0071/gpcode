package com.example1.import1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoader {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);

    Car car = (Toyota)context.getBean("toyota");
    car.print();

    car = (Volkswagen)context.getBean("volkswagen");
    car.print();

    context.close();
  }

}
