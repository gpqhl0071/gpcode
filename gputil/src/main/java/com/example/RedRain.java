package com.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gao peng
 * @date 2018/12/11 17:34
 */
public class RedRain {

  public static void main(String[] args) {
    Red r = new Red();
    r.init();

    int i = 0;
    while (i < 100) {
      i++;
      getRandomN();
    }
  }

  private static synchronized void getRandomN() {
    Map<Integer, Integer> map = Red.redMap;
    List<Integer> list = new LinkedList<Integer>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

      if (entry.getKey() != 10 && entry.getValue() == 0) {
        // 移除没有红包的项目
        Red.redMap.remove(entry.getKey());
      }
      list.add(entry.getKey());
      int n = core((Integer[]) list.toArray());

      System.out.println("随机获取数字：" + n);
    }
  }

  private static int core(Integer[] arr) {
    int index = (int) (Math.random() * arr.length);
    return arr[index];
  }
}
