package com.example.demo;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sun.deploy.net.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/4/15 17:36
 */
public class Http {

  // c143d5cbfb6649c99feddd9807d3540e
  public static void main(String[] args) {
    String host = "https://ali-waihui.showapi.com";
    String path = "/waihui-transform";
    String method = "GET";
    String appcode = "c143d5cbfb6649c99feddd9807d3540e";
    Map<String, String> headers = new HashMap<String, String>();
    headers.put("Authorization", "APPCODE " + appcode);
    Map<String, Object> querys = new HashMap<String, Object>();
    querys.put("fromCode", "USD");
    querys.put("money", "1");
    querys.put("toCode", "CNY");
    try {
//      HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);

      HttpRequest http = new HttpRequest(host + path);
      http.header("Authorization", "APPCODE " + appcode);
      http.timeout(10000);
      String str = http.form(querys).execute().body();

      //获取response的body
//      String str = EntityUtils.toString(response.getEntity());
      JSONObject bdJson = JSONUtil.parseObj(str);
      String exchange = bdJson.getJSONObject("showapi_res_body").getStr("money");
      System.out.println(Double.parseDouble(exchange));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }










}
