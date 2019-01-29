package com.example.util;

import com.example.dxShopUtil.StringUtil;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author gao peng
 * @date 2019/1/10 16:54
 */
public class MD5Util {
  public static void main(String[] args) {
    String str = "123123";
    System.out.println(StringUtil.md5(str));
    System.out.println(DigestUtils.md5Hex(str));
  }
}
