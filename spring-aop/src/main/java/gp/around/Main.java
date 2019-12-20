package gp.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("spring-around.xml");

    EmployeeManager manager = context.getBean(EmployeeManager.class);

    manager.getAllEmployee();
  }
}
