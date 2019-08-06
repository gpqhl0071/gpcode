package com.example.pattern.behavioralDesignPatterns.observerDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:12
 */
public interface Observer {

  //method to update the observer, used by subject
  public void update();

  //attach with subject to observe
  public void setSubject(Subject sub);
}
