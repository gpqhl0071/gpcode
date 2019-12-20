package com.event;

import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDao {
  @Override
  public EmployeeDTO createNewEmployee() {
    EmployeeDTO e = new EmployeeDTO();
    e.setId(1);
    e.setFirstName("Lokesh");
    e.setLastName("Gupta");
    return e;
  }

  public void initBean(){
    System.out.println("Init bean for : EmployeeDAOImpl ");
  }

  public void destoryBean(){
    System.out.println("destory bean for : EmployeeDAOImpl");
  }
}
