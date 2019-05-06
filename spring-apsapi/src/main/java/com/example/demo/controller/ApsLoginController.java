package com.example.demo.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
@RestController()
@RequestMapping(value = "/apsLogin")
public class ApsLoginController {

  @RequestMapping(produces = "application/json;charset=UTF-8")
  public String apsLogin(HttpServletResponse response,
                         HttpServletRequest request) throws Exception {

    Map jsonMap = new HashMap();

    jsonMap.put("clientVersionName", "1.3.3");
    jsonMap.put("verNo", "2.6");
    jsonMap.put("clientOSVersion", "4.4.4");
    jsonMap.put("clientVersionCode", 16);
    jsonMap.put("clientModel", "HM NOTE 1LTE");
    jsonMap.put("clientPlatform", 2);

    Enumeration enumeration = request.getParameterNames();
    Map<String, Object> modelMap = new HashMap<>();
    while (enumeration.hasMoreElements()) {
      String parameterName = (String) enumeration.nextElement();
      jsonMap.put(parameterName, request.getParameter(parameterName));
    }

    Map map = new HashMap();

    map.put("dxjcontent", encrypt(JSONUtil.toJsonStr(jsonMap), "Zi1qJmtGJk02MHghZSRyNQ=="));

    String url = request.getParameter("url");

    String result = HttpUtil.post("http://192.168.9.10:8081" + url + RandomUtil.randomNumbers(10), map);

    result = decrypt(result, "SCpqJmtEdSZNNjd4I2Ukcg==");

    return result;
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
