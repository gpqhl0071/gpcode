package com.example.util;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * https://www.jianshu.com/p/df828a57cb8f
 * <p>
 * 截图：http://ww1.sinaimg.cn/large/9b13c8fdgy1fug7wjgnw8j20xy0iv0tm.jpg
 * <p>
 * 测试工具网站：http://tool.chacuo.net/cryptaes
 * <p>
 * AES加解密实现
 *
 * @author gao peng
 * @date 2018/8/20 15:40
 */
public class AESUtil {
  private static final String IV_STRING = "A-16-Byte-String";
  private static final String charset = "UTF-8";

  public static String aesEncryptString(String content, String key) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    byte[] contentBytes = content.getBytes(charset);
    byte[] keyBytes = key.getBytes(charset);
    byte[] encryptedBytes = aesEncryptBytes(contentBytes, keyBytes);
    Base64.Encoder encoder = Base64.getEncoder();
    return encoder.encodeToString(encryptedBytes);
  }

  public static String aesDecryptString(String content, String key) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    Base64.Decoder decoder = Base64.getDecoder();
    byte[] encryptedBytes = decoder.decode(content);
    byte[] keyBytes = key.getBytes(charset);
    byte[] decryptedBytes = aesDecryptBytes(encryptedBytes, keyBytes);
    return new String(decryptedBytes, charset);
  }

  public static byte[] aesEncryptBytes(byte[] contentBytes, byte[] keyBytes) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    return cipherOperation(contentBytes, keyBytes, Cipher.ENCRYPT_MODE);
  }

  public static byte[] aesDecryptBytes(byte[] contentBytes, byte[] keyBytes) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    return cipherOperation(contentBytes, keyBytes, Cipher.DECRYPT_MODE);
  }

  private static byte[] cipherOperation(byte[] contentBytes, byte[] keyBytes, int mode) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
    SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "AES");

    byte[] initParam = IV_STRING.getBytes(charset);
    IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);

    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(mode, secretKey, ivParameterSpec);

    return cipher.doFinal(contentBytes);
  }

  public static void main(String[] args) throws Exception {
    String content = "test中文";

    //随机生成密钥
    SecretKey key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue());

    //构建
    SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);

    //加密为16进制表示
    String encryptHex = aes.encryptHex(content);
    System.out.println(encryptHex);
    //解密为字符串
    String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
    System.out.println(decryptStr);
  }
}
