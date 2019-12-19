package com.scheduled.propertiesContext;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoServicePropertiesExample {

  public void demoServiceMethod() {
    System.out.println("propertiesContext | Method executed at every 5 seconds. Current time is :: " + new Date());
  }
}
