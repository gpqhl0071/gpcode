package com.example.demo;


import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {
    System.out.println(JSONUtil.toJsonStr(new HashMap()));
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





