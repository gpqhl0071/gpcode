package com.example.socket;

import com.example.demo.Demo;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gao peng
 * @date 2019/9/7 8:38
 */
public class EchoTest {
  public static void main(String[] args) {
    try {
      // 115.28.214.108
      Socket echoSocket = new Socket("192.168.9.10", 9600);
      OutputStream os = echoSocket.getOutputStream();
      DataInputStream is = new DataInputStream(echoSocket.getInputStream());

      int c;
      String responseLine;
//      String demoStr = DemoSTR.getStr();

//      os.write(demoStr.getBytes());
//
//      os.flush();
//      responseLine = is.readLine();
//      System.out.println("echo: " + responseLine);
      while ((c = System.in.read()) != -1) {
        os.write((byte)c);
        if (c == '\n') {
          os.flush();
          responseLine = is.readLine();
          System.out.println("echo: " + responseLine);
        }
      }




      os.close();
      is.close();
      echoSocket.close();
    } catch (Exception e) {
      System.err.println("Exception:  " + e);
    }
  }
}
