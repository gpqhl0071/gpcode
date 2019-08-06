package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:57
 */
public class MyDIApplication implements Consumer {
  private MessageService service;

  public MyDIApplication(MessageService svc) {
    this.service = svc;
  }

  @Override
  public void processMessages(String msg, String rec) {
    //do some msg validation, manipulation logic etc
    this.service.sendMessage(msg, rec);
  }

}
