package com.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController {
  @Autowired
  private EmployeeManager manager;

  public EmployeeDTO createNewEmployee() {
    manager.createNewEmployee();

    System.out.println("over controller");
    return null;
  }
}
