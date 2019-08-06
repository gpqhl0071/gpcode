package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:56
 */
public interface MessageService {
  void sendMessage(String msg, String rec);
}
