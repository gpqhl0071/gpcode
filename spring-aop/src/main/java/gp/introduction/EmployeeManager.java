package gp.introduction;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
  public EmployeeDTO getEmployeeById(Integer employeeId) {
    System.out.println("Method getEmployeeById() method ");
    return new EmployeeDTO();
  }
}
