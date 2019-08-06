package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:58
 */
public class EmailServiceInjector implements MessageServiceInjector {
  @Override
  public Consumer getConsumer() {
    return new MyDIApplication(new EmailServiceImpl());
  }
}
