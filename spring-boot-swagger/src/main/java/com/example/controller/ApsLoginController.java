package com.example.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletResponse;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
@RestController()
@RequestMapping(value = "/apsLogin")
public class ApsLoginController {

    @RequestMapping(value = "/{url}/{key}", method = RequestMethod.GET)
    public void apsLogin(@PathVariable("key") String key,
                         @PathVariable("url") String url,
                         HttpServletResponse response){

        System.out.println("request param url = "+url+", key = " +key);

        Map jsonMap = new HashMap();

        jsonMap.put("clientVersionName","1.3.3");
        jsonMap.put("verNo","2.6");
        jsonMap.put("clientOSVersion","4.4.4");
        jsonMap.put("clientVersionCode",16);
        jsonMap.put("clientModel","HM NOTE 1LTE");
        jsonMap.put("userName","15600000002");
        jsonMap.put("clientPlatform",2);
        jsonMap.put("password",123456);

        Map map = new HashMap();

        map.put("dxjcontent", encrypt(JSONUtil.toJsonStr(jsonMap), key));

//        HttpUtil.post("https://"+url+"/user/login/", map);
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
