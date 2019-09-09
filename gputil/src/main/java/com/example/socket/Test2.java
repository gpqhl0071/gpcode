package com.example.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gao peng
 * @date 2019/9/7 9:04
 */
public class Test2 {
  public static void main(String[] args) throws Exception {
    int c;
    Socket s = new Socket("115.28.214.108", 9600);
    InputStream in = s.getInputStream();
    OutputStream out = s.getOutputStream();
    String str = DemoSTR.getStr();
    System.out.println("1：" + str);
    byte buf[] = str.getBytes();
    out.write(buf);

    String jsonStr = DemoSTR.getJsonStr();
    System.out.println("2：" + jsonStr);
    out.write(jsonStr.getBytes());

    while ((c = in.read()) != -1) {
      System.out.print((char) c);
    }
    s.close();
  }
}
