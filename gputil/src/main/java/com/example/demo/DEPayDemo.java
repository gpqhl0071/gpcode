package com.example.demo;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.json.JSONUtil;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/9/19 10:38
 */
public class DEPayDemo {
  private static String key = "C26674051C94CDD5B8C3BB2C92B9E02F";

  private static String mer_code = "103473055410001";

  private static final String OFFSET = "0000000000000000";

  public static void main(String[] args) throws Exception {

    Map<String, String> paramMap = new LinkedHashMap<String, String>();

    paramMap.put("appid", mer_code);
    paramMap.put("method", "netpay.balance.defray");
    paramMap.put("format", "json");
    paramMap.put("data", "");
    paramMap.put("timestamp", DateUtil.format(new Date(), DatePattern.PURE_DATETIME_PATTERN));
    paramMap.put("sign", "md5(appid+ data + format + method +  timestamp + secretkey )");
    paramMap.put("target", "defray");
    paramMap.put("version", "2.0.0");

    // data json param

    Map<String, String> jsonMap1 = new LinkedHashMap<String, String>();
    jsonMap1.put("ordernumber", "");
    jsonMap1.put("ordertype", "");
    jsonMap1.put("body", "大象");
    jsonMap1.put("amount", "100");
    jsonMap1.put("bankno", "308584000013");
    jsonMap1.put("bank_pro", "北京");
    jsonMap1.put("bank_city", "北京");
    jsonMap1.put("bankname", "招商银行");
    jsonMap1.put("subbankname", "招商银行海淀黄庄支行");
    jsonMap1.put("paymenttype", "balance");
    jsonMap1.put("payextraparams", getPayextraparams());


  }

  private static String getPayextraparams() {
    Map<String, String> jsonMap2 = new LinkedHashMap<String, String>();

    jsonMap2.put("cardbyname", "高鹏");
    jsonMap2.put("certype", "01");
    jsonMap2.put("cernum", "230302198811244737");
    jsonMap2.put("mobile", "15652377458");
    jsonMap2.put("cardnum", "6225880129365673");

    String payextraparams = JSONUtil.toJsonStr(jsonMap2);

    AES aes = new AES(Mode.CBC, Padding.NoPadding, key.getBytes(), OFFSET.getBytes());

    // 加密
    byte[] encrypt = aes.encrypt(payextraparams);
    return StrUtil.utf8Str(encrypt);
  }
}
