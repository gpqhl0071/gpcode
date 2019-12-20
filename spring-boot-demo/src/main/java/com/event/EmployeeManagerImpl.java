package com.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager, ApplicationEventPublisherAware {

  @Autowired
  private EmployeeDao dao;

  private ApplicationEventPublisher publisher;

  //You must override this method; It will give you acces to ApplicationEventPublisher
  public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  public EmployeeDTO createNewEmployee() {
    EmployeeDTO employee = dao.createNewEmployee();

    //publishing the veent here
    publisher.publishEvent(new EmployeeEvent(this, "ADD", employee));

    return employee;
  }

}
