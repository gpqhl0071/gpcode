package com.example.pattern.singleton;

/**
 * <p>Eager initialization<p/>
 * <p>所谓的恶汉式，在程序初始化的时候，将实例初始好。<p/>
 * @author gao peng
 * @date 2019/7/15 16:45
 */
public class EagerInitializedSingleton {
  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

  //private constructor to avoid client applications to use constructor
  private EagerInitializedSingleton() {
  }

  public static EagerInitializedSingleton getInstance() {
    return instance;
  }
}
