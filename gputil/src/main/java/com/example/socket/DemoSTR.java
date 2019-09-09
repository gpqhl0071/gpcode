package com.example.socket;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.HexUtil;

/**
 * @author gao peng
 * @date 2019/9/7 8:41
 */
public class DemoSTR {

  private static String str = "{\"AgentOrgCode\":\"\",\"MerCode\":\"103473254110001\",\"ProductId\":\"07\"," +
      "\"OrgAccType\":\"02\",\"TxnOrderId\":\"t1565147642\",\"TxnTime\":\"20190807031402\",\"TxnAmt\":\"100\",\"CurrType\":\"01\",\"Cnaps\":\"310581000017\",\"ProvinceName\":\"广东省\",\"CityName\":\"广州市\",\"BankName\":\"上海浦东发展银行\",\"SubBranchName\":\"上海浦东发展银行股份有限公司广州分行\",\"AccType\":\"02\",\"AccNo\":\"6217921002577735\",\"AccName\":\"张小明\",\"IdType\":\"01\",\"IdNo\":\"441423199112276416\",\"MobileNo\":\"13427528469\",\"NotifyUrl\":\"\",\"SignMac\":\"10257B63EEC778D5908927FAB99E29A758237109\"}";

  public static String getStr() {
    String strHex = HexUtil.encodeHexStr(str);

    String hex = HexUtil.toHex(11);
    if (hex.length() == 1) {
      hex = "0" + hex;
    }

    //======================2
    StringBuffer jsonLenStr = new StringBuffer();
    String jsonLenHex = HexUtil.toHex(Convert.toInt(strHex.length()));
    if (jsonLenHex.length() < 8) {
      int num = 8 - jsonLenHex.length();
      for (int i = 0; i < num; i++) {
        jsonLenStr.append("0");
      }
    }
    jsonLenStr.append(jsonLenHex);
    //======================3
    StringBuffer commandStr = new StringBuffer();
    String commandHex = HexUtil.toHex(3002);
    if (commandHex.length() < 8) {
      int num = 8 - commandHex.length();
      for (int i = 0; i < num; i++) {
        commandStr.append("0");
      }
    }
    commandStr.append(commandHex);
    //======================4
//      writer.println(strHex.toUpperCase());

    return ((hex + jsonLenStr.toString() + commandStr.toString()).toUpperCase());
  }

  public static String getJsonStr() {
    String strHex = HexUtil.encodeHexStr(str);
    return strHex.toUpperCase();
  }
}
