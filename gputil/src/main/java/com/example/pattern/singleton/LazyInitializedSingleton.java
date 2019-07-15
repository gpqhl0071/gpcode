package com.example.pattern.singleton;

/**
 * <p>懒汉式，使用的时候，才去创建实例，但是在高并发的场景，容易出现创建2个实例的情况，线程是不安全的</p>
 * @author gao peng
 * @date 2019/7/15 16:50
 */
public class LazyInitializedSingleton {

  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton() {
  }

  public static LazyInitializedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }
}
