package com.example.pattern.structuralDesignPatterns.adapterPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:18
 */
public class Volt {
  private int volts;

  public Volt(int v) {
    this.volts = v;
  }

  public int getVolts() {
    return volts;
  }

  public void setVolts(int volts) {
    this.volts = volts;
  }
}
