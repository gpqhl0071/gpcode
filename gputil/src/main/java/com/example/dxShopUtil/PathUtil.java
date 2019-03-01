package com.example.dxShopUtil;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

import java.io.InputStream;
import java.nio.file.Files;

/**
 * @author gao peng
 * @date 2019/3/1 9:13
 */
public class PathUtil {
  public static void main(String[] args) {
//    ClassPathResource resource = new ClassPathResource("aes.key");
//    System.out.println(resource.normalizePath());


    InputStream is = PathUtil.class.getResourceAsStream("/aes.key");
    byte[] keyBytes = IoUtil.readBytes(is);

    //构建
    SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, keyBytes);

    //加密为16进制表示
    String encryptHex = aes.encryptHex("123");

    System.out.println(encryptHex);

    //构建
    //解密为字符串
    String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
    System.out.println(decryptStr);
  }
}
