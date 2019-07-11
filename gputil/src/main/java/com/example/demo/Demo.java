package com.example.demo;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {

    Date d = DateUtil.offsetDay(new Date(), -1);

    System.out.println(DateUtil.format(d, DatePattern.NORM_DATETIME_FORMAT));
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

