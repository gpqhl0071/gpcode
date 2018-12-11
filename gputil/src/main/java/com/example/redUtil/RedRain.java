package com.example.redUtil;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/12/11 17:34
 */
public class RedRain {

  public static void main(String[] args) {
    Red r = new Red();
    r.init();

    int i = 0;
    Date d1 = new Date();
    while (i < 1000) {
      i++;
      Thread t = new Thread() {
        @Override
        public void run() {
          getRandomN();
        }
      };
      t.start();
    }
    Date d2 = new Date();

    System.out.println("耗时:" + (d2.getTime() - d1.getTime()) + "ms");
  }

  private static synchronized void getRandomN() {
    Map<Integer, Integer> map = Red.redMap;
    List<Integer> list = new LinkedList<Integer>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

      if (entry.getKey() != 10 && entry.getValue() == 0) {
        // 移除没有红包的项目
        Red.redMap.remove(entry.getKey());
        continue;
      }
      list.add(entry.getKey());
    }
    int n = core(list.toArray());
    Red.redMap.put(n, Red.redMap.get(n) - 1);
    System.out.println("随机获取数字：" + n);
  }

  private static int core(Object[] arr) {
    int index = (int) (Math.random() * arr.length);
    return Integer.parseInt(String.valueOf(arr[index]));
  }
}
