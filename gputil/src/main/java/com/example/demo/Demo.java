package com.example.demo;


import cn.hutool.core.codec.Base64;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  private static String key = "0C3C2748E17622F42CC658F01645C5B3";
  private static final String OFFSET = "0000000000000000";

  private static String mer_code = "103473055410001";

  public static void main(String[] args) throws Exception {

    String str = "2019-10-10 00:00:00";

    System.out.println(StrUtil.sub(str, 0, 10));

  }

}





