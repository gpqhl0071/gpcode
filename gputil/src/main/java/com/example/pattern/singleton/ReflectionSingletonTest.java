package com.example.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * <p>通过反射瓦解单例模式</p>
 * @author gao peng
 * @date 2019/7/15 17:06
 */
public class ReflectionSingletonTest {

  public static void main(String[] args) {
    EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
    EagerInitializedSingleton instanceTwo = null;
    try {
      Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        //Below code will destroy the singleton pattern
        constructor.setAccessible(true);
        instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(instanceOne.hashCode());
    System.out.println(instanceTwo.hashCode());
  }

}
