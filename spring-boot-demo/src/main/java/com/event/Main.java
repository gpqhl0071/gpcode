package com.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("spring-event.xml");

    EmployeeController controller = applicationContext.getBean(EmployeeController.class);

    controller.createNewEmployee();

    System.out.println("over ");

  }
}
