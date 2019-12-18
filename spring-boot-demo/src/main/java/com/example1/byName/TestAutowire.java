package com.example1.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean1.xml");

    EmployeeBean employeeBean = (EmployeeBean) applicationContext.getBean("employee");
    System.out.println(employeeBean.getFullName());

    System.out.println(employeeBean.getDepartmentBean().getName());
  }
}
