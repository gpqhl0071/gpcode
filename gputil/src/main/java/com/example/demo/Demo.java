package com.example.demo;


import cn.hutool.core.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String args[]) {
    List list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);


    System.out.println(CollectionUtil.sub(list, 0, 5));

  }
}






