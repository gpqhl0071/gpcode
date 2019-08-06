package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:54
 */
public class MyApplication {
  private EmailService email = null;

  public MyApplication(EmailService svc){
    this.email=svc;
  }

  public void processMessages(String msg, String rec){
    //do some msg validation, manipulation logic etc
    this.email.sendEmail(msg, rec);
  }
}
