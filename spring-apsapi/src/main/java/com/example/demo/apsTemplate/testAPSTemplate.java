package com.example.demo.apsTemplate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingJsonFactory;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/4/26 11:27
 */
public class testAPSTemplate {

  public static void main(String[] args) {
    ApsCommonMsg msg = new ApsCommonMsg();
    Map map = init(msg);

    message(EnumRetCode.USER_INTEGRAL_CHARGE_QUERY_SUCCESS.retCodeVal(),
        EnumRetCode.USER_INTEGRAL_CHARGE_QUERY_SUCCESS.retMsgVal(),
        msg.getHeader());

    map.put("name", "zhangsan");
    map.put("sex", "boy");

    MappingJsonFactory f = new MappingJsonFactory();
    StringWriter sw = new StringWriter();
    try {
      JsonGenerator generator = f.createGenerator(sw);
      generator.writeObject(msg);
      generator.close();
    } catch (Exception var4) {
    }

    System.out.println(sw);
  }

  private static void message(int code, String message, Header header) {
    header.setRetCode(code);
    header.setRetMsg(message);
  }

  private static Map init(ApsCommonMsg msg) {
    Map map = new HashMap();

    Header header = new Header();
    msg.setHeader(header);
    msg.setBody(map);
    return map;
  }

}
