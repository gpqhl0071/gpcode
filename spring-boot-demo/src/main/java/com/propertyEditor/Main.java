package com.propertyEditor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-property.xml");

    EmployeeDto employeeDTO = (EmployeeDto) context.getBean("employeeDTO");

    System.out.println(employeeDTO.getDateOfBirth());
  }
}
