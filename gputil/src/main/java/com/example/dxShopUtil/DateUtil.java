package com.example.dxShopUtil;

import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONUtil;

import java.util.Date;
import java.util.HashMap;

/**
 * @author gao peng
 * @date 2019/2/15 11:04
 */
public class DateUtil {

  public static void main(String[] args) {
    DateTime d = cn.hutool.core.date.DateUtil.date();
    System.out.println(cn.hutool.core.date.DateUtil.format(new Date(), "yyyy-MM-dd"));

  }
}






