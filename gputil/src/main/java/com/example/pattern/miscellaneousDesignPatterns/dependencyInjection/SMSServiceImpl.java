package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:57
 */
public class SMSServiceImpl implements MessageService {
  @Override
  public void sendMessage(String msg, String rec) {
    //logic to send SMS
    System.out.println("SMS sent to " + rec + " with Message=" + msg);
  }

}
