package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:54
 */
public class EmailService {
  public void sendEmail(String message, String receiver) {
    //logic to send email
    System.out.println("Email sent to " + receiver + " with Message=" + message);
  }
}
