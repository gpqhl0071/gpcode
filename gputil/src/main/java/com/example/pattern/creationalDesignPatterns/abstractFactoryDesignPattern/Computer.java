package com.example.pattern.creationalDesignPatterns.abstractFactoryDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 15:41
 */
public abstract class Computer {

  public abstract String getRAM();

  public abstract String getHDD();

  public abstract String getCPU();

  @Override
  public String toString() {
    return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
  }
}
