package com.example.dxShopUtil;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gao peng
 * @date 2019/1/29 15:12
 */
public class AESUtil {
  public static void main(String[] args) throws Exception {
    String content = "test中文";

    //随机生成密钥
    /*SecretKey key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue());

    Path keyPath = Paths.get("D:/aes.key");
    Files.write(keyPath, key.getEncoded());*/

    String fileName = "aes.key";
    ClassPathResource resource = new ClassPathResource(fileName);
    System.out.println(resource.getAbsolutePath());

//    byte[] keyBytes = IOUtils.toByteArray(in);

    // 读取本地秘钥
    Path keyPath = Paths.get(resource.getAbsolutePath());
    byte[] keyBytes = Files.readAllBytes(keyPath);

    //构建
    SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, keyBytes);

    //加密为16进制表示
    String encryptHex = aes.encryptHex(content);
    System.out.println(encryptHex);
    //解密为字符串
    String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
    System.out.println(decryptStr);
  }
}
