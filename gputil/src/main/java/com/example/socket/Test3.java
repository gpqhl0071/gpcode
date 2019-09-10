package com.example.socket;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author gao peng
 * @date 2019/9/10 14:28
 */
public class Test3 {

  public static void main(String[] args) throws IOException {

    SocketChannel socketChannel = SocketChannel.open();
    socketChannel.connect(new InetSocketAddress("192.168.9.10", 9600));

    String newData = "New String to write to file..." + System.currentTimeMillis();

    ByteBuffer buf = ByteBuffer.allocate(48);
    buf.clear();
    buf.put(newData.getBytes());

    buf.flip();

    while (buf.hasRemaining()) {
      socketChannel.write(buf);
    }

    ByteBuffer buf1 = ByteBuffer.allocate(1024);

    int bytesRead = socketChannel.read(buf1);

    byte[] b = buf1.array();

    System.out.println(HttpUtil.getString(b, CharsetUtil.CHARSET_UTF_8, true));

    System.out.println(bytesRead);

  }

}
