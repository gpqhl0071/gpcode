package gp.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-introduction.xml");

    EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);

    manager.getEmployeeById(1);
  }
}
