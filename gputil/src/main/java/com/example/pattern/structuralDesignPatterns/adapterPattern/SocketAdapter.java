package com.example.pattern.structuralDesignPatterns.adapterPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:18
 */
public interface SocketAdapter {
  public Volt get120Volt();

  public Volt get12Volt();

  public Volt get3Volt();
}
