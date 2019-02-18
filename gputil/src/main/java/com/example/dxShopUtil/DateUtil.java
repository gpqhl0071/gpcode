package com.example.dxShopUtil;

import cn.hutool.core.date.DateTime;

/**
 * @author gao peng
 * @date 2019/2/15 11:04
 */
public class DateUtil {

  public static void main(String[] args) {
    DateTime d = cn.hutool.core.date.DateUtil.date(1547215088 * 1000l);
    System.out.println(d.toString());
  }
}
