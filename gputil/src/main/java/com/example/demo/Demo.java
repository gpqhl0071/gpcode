package com.example.demo;


import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  private static String key = "0C3C2748E17622F42CC658F01645C5B3";
  private static final String OFFSET = "0000000000000000";

  private static String mer_code = "103473055410001";

  public static void main(String[] args) throws Exception {

    String result = "{\"orderId\":\"101909205510227_20190920091359\",\"preBind\":\"succ\"}";

    String preBind = JSONUtil.parseObj(result).getStr("preBind");
    String bindOrderId = JSONUtil.parseObj(result).getStr("orderId");
    String secondPay = JSONUtil.parseObj(result).getStr("secondPay", "");

    System.out.println(preBind);
    System.out.println(bindOrderId);
    System.out.println(secondPay);

  }

}





