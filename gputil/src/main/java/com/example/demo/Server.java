package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gao peng
 * @date 2019/9/6 17:28
 */
public class Server {
  public static void main(String[] args) throws IOException {
    // 声明用来计数的int局部变量
    int count = 0;
    byte[] head = new byte[29];
    byte[] body;
    try {
      // 使用ServerSocket
      ServerSocket server = new ServerSocket(9999);
      // 打印提示信息
      System.out.println("服务器端正在对端口9999进行监听");
      // 等待客户端连接
      while (true) {
        // 若有连接返回对应的Socket对象。
        Socket sc = server.accept();
        // 获取当前链接对象的输入流
        InputStream din = sc.getInputStream();
        // 获取当前连接对象的输出流
        OutputStream dout = sc.getOutputStream();
        // 读取包头并打印包头所包含的信息
        din.read(head);
        System.out.println("==========================" + (++count)
            + "========================");
        System.out.println("客户端IP地址：" + sc.getInetAddress());
        System.out.println("客户端端口号：" + sc.getPort());
        System.out.println("本地端口号：" + sc.getLocalPort());
        System.out
            .println("接收到的数据包16进制表示为：" + byteToHexStr(head, true));

        // 判断，如果是请求包则返回一个响应
        if (head[0] == 1) {
          //临时代码,接收请求包并原样返回消息包头
          head[0] = 2;
          dout.write(head);
          System.out.println("******收到请求包，已返回响应......******");
        } else if (head[0] == 2) {
          System.out.println("************收到响应包****************");
        } else {
          System.out.println("*******数据包已损坏,接收失败************");
        }
        // 关闭流
        din.close();
        dout.close();
        // 关闭Socket连接
        sc.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //该方法将数据转为16进制显示
  public static String byteToHexStr(byte[] bArray, boolean format) {
    StringBuffer strb = new StringBuffer(bArray.length);
    String str;
    for (int i = 0; i < bArray.length; i++) {
      str = Integer.toHexString(0xFF & bArray[i]).trim();
      if (str.length() < 2) {
        str = "0" + str;
      }
      if (format) {
        str += " ";
      }
      strb.append(str);
    }
    str = strb.toString().toUpperCase().trim();
    return str;
  }
}
