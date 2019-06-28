package com.example.demo;


import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {


    System.out.println(DateUtil.format(DateUtil.offsetDay(new Date(), -1), "yyyy-MM-dd 00:00:00"));
    System.out.println(DateUtil.format(new Date(), "yyyy-MM-dd 00:00:00"));

  }

}
