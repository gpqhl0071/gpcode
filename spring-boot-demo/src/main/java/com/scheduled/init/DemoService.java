package com.scheduled.init;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoService {

  //  @Scheduled(cron = "*/5 * * * * ?")
  //  @Scheduled(fixedDelay = 5000)
//  @Scheduled(fixedRate = 5000)
  public void demoServiceMethod() {
    System.out.println("Method executed at every 5 seconds. Current time is :: " + new Date());
  }

}
