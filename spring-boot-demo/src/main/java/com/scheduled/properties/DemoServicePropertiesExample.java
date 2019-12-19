package com.scheduled.properties;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoServicePropertiesExample {

  @Scheduled(cron = "${cron.expression}")
  public void demoServiceMethod() {
    System.out.println("Method executed at every 5 seconds. Current time is :: " + new Date());
  }
}
