package com.event;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {
  private static final long serialVersionUID = 1L;

  private String eventType;
  private EmployeeDTO employee;

  //Constructor's first parameter must be source
  public EmployeeEvent(Object source, String eventType, EmployeeDTO employee) {
    //Calling this super class constructor is necessary
    super(source);
    this.eventType = eventType;
    this.employee = employee;
  }

  public String getEventType() {
    return eventType;
  }

  public EmployeeDTO getEmployee() {
    return employee;
  }
}
