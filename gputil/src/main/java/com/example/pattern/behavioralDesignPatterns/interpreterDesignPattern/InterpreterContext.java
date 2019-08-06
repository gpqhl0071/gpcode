package com.example.pattern.behavioralDesignPatterns.interpreterDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:53
 */
public class InterpreterContext {
  public String getBinaryFormat(int i) {
    return Integer.toBinaryString(i);
  }

  public String getHexadecimalFormat(int i) {
    return Integer.toHexString(i);
  }
}
