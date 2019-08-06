package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:59
 */
public class MyMessageDITest {
  public static void main(String[] args) {
    String msg = "Hi Pankaj";
    String email = "pankaj@abc.com";
    String phone = "4088888888";
    MessageServiceInjector injector = null;
    Consumer app = null;

    //Send email
    injector = new EmailServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, email);

    //Send SMS
    injector = new SMSServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, phone);
  }


}
