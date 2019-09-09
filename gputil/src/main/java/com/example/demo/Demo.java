package com.example.demo;


import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.HexUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {
  private static String str = "{\"AgentOrgCode\":\"\",\"MerCode\":\"103473254110001\",\"ProductId\":\"07\"," +
      "\"OrgAccType\":\"02\",\"TxnOrderId\":\"t1565147642\",\"TxnTime\":\"20190807031402\",\"TxnAmt\":\"100\",\"CurrType\":\"01\",\"Cnaps\":\"310581000017\",\"ProvinceName\":\"广东省\",\"CityName\":\"广州市\",\"BankName\":\"上海浦东发展银行\",\"SubBranchName\":\"上海浦东发展银行股份有限公司广州分行\",\"AccType\":\"02\",\"AccNo\":\"6217921002577735\",\"AccName\":\"张小明\",\"IdType\":\"01\",\"IdNo\":\"441423199112276416\",\"MobileNo\":\"13427528469\",\"NotifyUrl\":\"\",\"SignMac\":\"10257B63EEC778D5908927FAB99E29A758237109\"}";

  public static void main(String[] args) throws Exception {

    String hostname = "192.168.9.10";
    int port = 9600;

    String strHex = HexUtil.encodeHexStr(str);

    try (Socket socket = new Socket(hostname, port)) {

      socket.setSoTimeout(10000);

      InputStream input = socket.getInputStream();

      OutputStream output = socket.getOutputStream();
      PrintWriter writer = new PrintWriter(output, false);

      BufferedReader reader = new BufferedReader(new InputStreamReader(input));

      String line = "";


      String hex = HexUtil.toHex(11);
      if (hex.length() == 1) {
        hex = "0" + hex;
      }
//      writer.println(hex.toUpperCase()); // 2个占位符 0不全

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
//      writer.println(jsonLenStr.toString().toUpperCase()); // 8个占位符 0不全
      //======================3
      StringBuffer commandStr = new StringBuffer();
      String commandHex = HexUtil.toHex(1000);
      if (commandHex.length() < 8) {
        int num = 8 - commandHex.length();
        for (int i = 0; i < num; i++) {
          commandStr.append("0");
        }
      }
      commandStr.append(commandHex);
//      writer.println(commandStr.toString().toUpperCase()); // 8个占位符 0不全
      //======================4
//      writer.println(strHex.toUpperCase());

      writer.println((hex + jsonLenStr.toString() + commandStr.toString() + strHex).toUpperCase());

      System.out.println((hex + jsonLenStr.toString() + commandStr.toString() + strHex).toUpperCase());


      line = reader.readLine();
      System.out.println("return:" + line);

    } catch (UnknownHostException ex) {

      System.out.println("Server not found: " + ex.getMessage());

    } catch (IOException ex) {

      System.out.println("I/O error: " + ex.getMessage());
    }
  }

}





