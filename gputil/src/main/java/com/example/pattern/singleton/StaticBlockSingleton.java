package com.example.pattern.singleton;

/**
 * <p>Static block initialization</p>
 * <p>类似于饿汉式，唯一的区别，提供了实例化时的异常处理。</p>
 * @author gao peng
 * @date 2019/7/15 16:48
 */
public class StaticBlockSingleton {
  private static StaticBlockSingleton instance;

  private StaticBlockSingleton() {
  }

  //static block initialization for exception handling
  static {
    try {
      instance = new StaticBlockSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  public static StaticBlockSingleton getInstance() {
    return instance;
  }
}
