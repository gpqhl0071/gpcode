package com.example.pattern.miscellaneousDesignPatterns.dependencyInjection;

/**
 * @author gao peng
 * @date 2019/8/6 15:57
 */
public interface Consumer {
  void processMessages(String msg, String rec);
}
