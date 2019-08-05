package com.example.pattern.structuralDesignPatterns.adapterPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:18
 */
public class Socket {
  public Volt getVolt() {
    return new Volt(120);
  }
}
