package com.example.demo;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {
    Date a = new Date();

    String[] strs = new String[]{"123","456"};
    List<String> list = CollectionUtil.toList(strs);
    for (String str : list){
      System.out.println(str);
    }
  }

}

class DemoVo {

  private int count;

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}

