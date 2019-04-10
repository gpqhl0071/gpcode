package com.example.controller;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class ApsLoginController {

    public void apsLogin(){

    }

    public static String encrypt(String data, String key) {
        try {
            byte[] dataBytes = data.getBytes("UTF-8");
            byte[] keyBytes = Base64.decodeBase64(key);
            return Base64.encodeBase64String(encrypt(dataBytes, keyBytes));
        } catch (Exception var4) {
            return null;
        }
    }

    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        Key k = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, k);
        return cipher.doFinal(data);
    }

    private static String decrypt(byte[] data, byte[] key) throws Exception {
        Key k = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, k);
        return new String(cipher.doFinal(data), "UTF-8");
    }

    public static String decrypt(String data, String key) {
        try {
            return decrypt(Base64.decodeBase64(data), Base64.decodeBase64(key));
        } catch (Exception var3) {
            return null;
        }
    }
}
