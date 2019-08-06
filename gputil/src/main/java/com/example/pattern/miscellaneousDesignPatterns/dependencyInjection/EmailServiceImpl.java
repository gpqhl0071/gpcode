package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:56
 */
public class EmailServiceImpl implements MessageService {
  @Override
  public void sendMessage(String msg, String rec) {
    //logic to send email
    System.out.println("Email sent to " + rec + " with Message=" + msg);
  }
}
