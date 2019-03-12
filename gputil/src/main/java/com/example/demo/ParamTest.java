package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/3/8 9:48
 */
public class ParamTest {
  // 首先要明白一点java在参数传递的时候并不是把实参传递给了形参，
  // 而是建立了实参的副本，然后将副本传递给形参(这是值传递的精髓)。
//  public static void main(String[] args) {
//    String str = "zhangsan";
//    System.out.println("NO1 - " + str);
//    update(str);
//    System.out.println("NO2 - " + str);
//  }
//
//  public static void update(String str) {
//    str = "lisi";
//  }


  public static void main(String[] args) {
    List<String> list = new ArrayList();
    list.add("zhangsan");
    System.out.println("NO1 - " + list.hashCode() +
      ", list size = " + list.size());
    update(list);
    System.out.println("NO2 - " + list.hashCode() +
      ", list size = " + list.size());
  }

  public static void update(List<String> list) {
//    list = new ArrayList<>();
    list.add("lisi");
  }
}
