package com.example.pattern.behavioralDesignPatterns.iteratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 15:01
 */
public interface ChannelIterator {
  public boolean hasNext();

  public Channel next();
}
