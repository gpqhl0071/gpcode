package gp.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gp.introduction.EmployeeDTO;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("spring-xml.xml");

    EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");

    manager.getEmployeeById(1);

    manager.createEmployee(new EmployeeDTO());

    manager.deleteEmployee(100);

  }
}
