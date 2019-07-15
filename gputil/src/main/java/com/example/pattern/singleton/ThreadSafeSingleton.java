package com.example.pattern.singleton;

/**
 * <p>优化了懒汉模式，线程安全了，由于使用了synchronized关键字，性能下去了</p>
 * @author gao peng
 * @date 2019/7/15 16:54
 */
public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {
  }

  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }

  /**
   * <p>双重检查的锁定实现。</p>
   * <p>避免方法级别的锁，导致的性能问题，只在初始化的时候，并且实例为Null的情况下，锁定资源，实例化，后续就不在需要锁了</p>
   * @return com.example.pattern.singleton.ThreadSafeSingleton
   * @param: []
   * @author gao peng
   * @date 2019/7/15 16:57
   */
  public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
