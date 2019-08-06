package com.example.pattern.behavioralDesignPatterns.iteratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 15:01
 */
public class Channel {
  private double frequency;
  private ChannelTypeEnum TYPE;

  public Channel(double freq, ChannelTypeEnum type) {
    this.frequency = freq;
    this.TYPE = type;
  }

  public double getFrequency() {
    return frequency;
  }

  public ChannelTypeEnum getTYPE() {
    return TYPE;
  }

  @Override
  public String toString() {
    return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
  }
}
