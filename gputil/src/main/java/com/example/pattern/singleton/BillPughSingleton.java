package com.example.pattern.singleton;

/**
 * <p>项目启动时候，不初始化实例，当调用SingletonHelper.INSTANCE的时候，才实例化到内存中</p>
 * <p>创建单例模式，比较常用的方式</p>
 * @author gao peng
 * @date 2019/7/15 17:04
 */
public class BillPughSingleton {
  private BillPughSingleton() {
  }

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
