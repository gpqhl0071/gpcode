package com.example.socket;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author gao peng
 * @date 2019/9/10 15:32
 */
public class Test4 {
  public static void main(String[] args) throws Exception {

    SocketChannel socketChannel = SocketChannel.open();
//    socketChannel.connect(new InetSocketAddress("115.28.214.108", 9600));
    socketChannel.connect(new InetSocketAddress("192.168.9.10", 9600));


    List<String> list = new LinkedList<String>();
    list.add(DemoSTR.getStr1() + DemoSTR.getStr2() + DemoSTR.getStr3());
//    list.add(DemoSTR.getStr2());
//    list.add(DemoSTR.getStr3());
    list.add(DemoSTR.getJsonStr());

    int i = 1;
    ByteBuffer buf = ByteBuffer.allocate(2000);
    for (String str : list) {
      System.out.println(str);
      if (i == 2) {
        ByteBuffer buf1 = ByteBuffer.allocate(2048);
        int bytesRead = socketChannel.read(buf1);
        byte[] b = buf1.array();
        System.out.println(HttpUtil.getString(b, CharsetUtil.CHARSET_UTF_8, true));
      }
      buf.clear();
      buf.put(str.getBytes());
      buf.flip();
      while (buf.hasRemaining()) {
        socketChannel.write(buf);
      }
      TimeUnit.MILLISECONDS.sleep(100);
      i += 1;
    }


    ByteBuffer buf1 = ByteBuffer.allocate(2048);

    int bytesRead = socketChannel.read(buf1);

    byte[] b = buf1.array();

    System.out.println(HttpUtil.getString(b, CharsetUtil.CHARSET_UTF_8, true));

    System.out.println(bytesRead);

    socketChannel.close();
  }
}
