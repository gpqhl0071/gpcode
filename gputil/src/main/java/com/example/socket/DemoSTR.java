package com.example.socket;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.HexUtil;

/**
 * @author gao peng
 * @date 2019/9/7 8:41
 */
public class DemoSTR {

  private static String str = "{\"BankName\":\"\",\"AccNo\":\"\",\"SignMac\":\"\",\"AccType\":\"\",\"BatchNo\":\"\",\"ProductId\":\"\",\"OrgAccType\":\"\",\"ProvinceName\":\"\",\"NotifyUrl\":\"\",\"Cnaps\":\"\",\"MobileNo\":\"\",\"SerialNo\":\"\",\"SubBranchName\":\"\",\"AgentOrgCode\":\"\",\"CityName\":\"\",\"TxnOrderId\":\"\",\"IdType\":\"\",\"AccName\":\"\",\"CardNo\":\"\",\"TxnTime\":\"\",\"CurrType\":\"\",\"MerCode\":\"\",\"TermCode\":\"\",\"TxnAmt\":\"\",\"IdNo\":\"\"}";

  private static String strHex = HexUtil.encodeHexStr(str);

  public static String getStr1() {

    String hex = HexUtil.toHex(11);
    if (hex.length() == 1) {
      hex = "0" + hex;
    }
    return hex.toUpperCase();
  }

  public static String getStr2() {

    StringBuffer jsonLenStr = new StringBuffer();
    String jsonLenHex = HexUtil.toHex(Convert.toInt(strHex.length()));
    if (jsonLenHex.length() < 8) {
      int num = 8 - jsonLenHex.length();
      for (int i = 0; i < num; i++) {
        jsonLenStr.append("0");
      }
    }
    jsonLenStr.append(jsonLenHex);

    return jsonLenStr.toString().toUpperCase();
  }

  public static String getStr3() {
    StringBuffer commandStr = new StringBuffer();
    String commandHex = HexUtil.toHex(3002);
    if (commandHex.length() < 8) {
      int num = 8 - commandHex.length();
      for (int i = 0; i < num; i++) {
        commandStr.append("0");
      }
    }
    commandStr.append(commandHex);
    return commandStr.toString().toUpperCase();

  }

  public static String getJsonStr() {
    String strHex = HexUtil.encodeHexStr(str);
    return strHex.toUpperCase();
  }
}
