package com.example.demo;


import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  private static String key = "0C3C2748E17622F42CC658F01645C5B3";
  private static final String OFFSET = "0000000000000000";

  private static String mer_code = "103473055410001";

  public static void main(String[] args) throws Exception {

    String str = "{\"ordernumber\":\"2017092300000006\",\"body\":\"支付测试\",\"amount\":\"1\",\"paymenttype\":\"1\",\"ordertype\":\"001\",\"bankno\":\"103100000026\"}";

    AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, key.getBytes(), OFFSET.getBytes());
    byte[] b = aes.encrypt(str);

    System.out.println(HexUtil.encodeHex(b));

    // java 的zero填充模式实现
    // https://my.oschina.net/Jacker/blog/86383
  }

}





