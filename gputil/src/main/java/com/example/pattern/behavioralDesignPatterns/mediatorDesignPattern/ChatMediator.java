package com.example.pattern.behavioralDesignPatterns.mediatorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:36
 */
public interface ChatMediator {
  public void sendMessage(String msg, User user);

  void addUser(User user);
}
