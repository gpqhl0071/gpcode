package com.example.util;

import cn.hutool.json.JSONUtil;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/5/24 14:51
 */
public class WebJsonUtil {

  public static void main(String[] args) {

    Map<String, Object> bodyMap = new HashMap<String, Object>();
    bodyMap.put("name", "zhangsan");
    bodyMap.put("age", "11");

    String code = "success";
    String message = "成功";

    String str = message(code, message, bodyMap);

    System.out.println(str);
  }

  private static String message(String code, String message, Map<String, Object> bodyMap) {
    RetMessage retMessage = new RetMessage();
    retMessage.setHeader(new Header(code, message));
    retMessage.setBody(bodyMap);
    return JSONUtil.toJsonStr(retMessage);
  }
}

@Setter
@Getter
class RetMessage {
  private Header header;
  private Map<String, Object> body;
}

@Setter
@Getter
class Header {

  Header(String retCode, String retMsg) {
    this.retCode = retCode;
    this.retMsg = retMsg;
  }

  private String retCode;
  private String retMsg;
}