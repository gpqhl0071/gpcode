package com.example.pattern.structuralDesignPatterns.adapterPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:19
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

  @Override
  public Volt get120Volt() {
    return getVolt();
  }

  @Override
  public Volt get12Volt() {
    Volt v = getVolt();
    return convertVolt(v, 10);
  }

  @Override
  public Volt get3Volt() {
    Volt v = getVolt();
    return convertVolt(v, 40);
  }

  private Volt convertVolt(Volt v, int i) {
    return new Volt(v.getVolts() / i);
  }

}
