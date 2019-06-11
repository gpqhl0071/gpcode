package com.example.demo.task;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;

import org.apache.commons.codec.binary.Base64;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author gao peng
 * @date 2019/6/11 14:30
 */
@Component
public class ApsSignTask {

  private final String apsUrl = "";

  int count = 0;

  @Scheduled(cron = "0 0 9 1/1 * ?")
  private void process() {
    Map jsonMap = new HashMap();

    jsonMap.put("clientVersionName", "1.3.3");
    jsonMap.put("verNo", "2.6");
    jsonMap.put("clientOSVersion", "4.4.4");
    jsonMap.put("clientVersionCode", 16);
    jsonMap.put("clientModel", "HM NOTE 1LTE");
    jsonMap.put("clientPlatform", 2);
    jsonMap.put("userName", "15652377458");
    jsonMap.put("password", "123456");

    Map map = new HashMap();

    map.put("dxjcontent", encrypt(JSONUtil.toJsonStr(jsonMap), "Zi1qJmtGJk02MHghZSRyNQ=="));

    String url = "/user/login/";

    String result = HttpUtil.post(apsUrl + url + RandomUtil.randomNumbers(10), map);

    result = decrypt(result, "SCpqJmtEdSZNNjd4I2Ukcg==");
    JSON json = JSONUtil.parse(result);
    String token = Convert.toStr(json.getByPath("body.token"));

    url = "/userIntegral/userIntegralSignIn/";
    jsonMap.put("token", token);
    map.put("dxjcontent", encrypt(JSONUtil.toJsonStr(jsonMap), "Zi1qJmtGJk02MHghZSRyNQ=="));
    String result1 = HttpUtil.post(apsUrl + url + RandomUtil.randomNumbers(10), map);
    result1 = decrypt(result1, "SCpqJmtEdSZNNjd4I2Ukcg==");

    System.out.println(result1);
  }

  public static String encrypt(String data, String key) {
    try {
      byte[] dataBytes = data.getBytes("UTF-8");
      byte[] keyBytes = Base64.decodeBase64(key);
      return Base64.encodeBase64String(encrypt(dataBytes, keyBytes));
    } catch (Exception var4) {
      return null;
    }
  }

  public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
    Key k = new SecretKeySpec(key, "AES");
    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(1, k);
    return cipher.doFinal(data);
  }

  private static String decrypt(byte[] data, byte[] key) throws Exception {
    Key k = new SecretKeySpec(key, "AES");
    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(2, k);
    return new String(cipher.doFinal(data), "UTF-8");
  }

  public static String decrypt(String data, String key) {
    try {
      return decrypt(Base64.decodeBase64(data), Base64.decodeBase64(key));
    } catch (Exception var3) {
      return null;
    }
  }
}
