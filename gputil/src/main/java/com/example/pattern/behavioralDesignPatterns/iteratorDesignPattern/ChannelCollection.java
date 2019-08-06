package com.example.pattern.behavioralDesignPatterns.iteratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 15:01
 */
public interface ChannelCollection {
  public void addChannel(Channel c);

  public void removeChannel(Channel c);

  public ChannelIterator iterator(ChannelTypeEnum type);
}
