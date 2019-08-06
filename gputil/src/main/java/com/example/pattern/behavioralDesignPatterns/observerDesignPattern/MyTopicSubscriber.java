package com.example.pattern.behavioralDesignPatterns.observerDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:16
 */
public class MyTopicSubscriber implements Observer {
  private String name;
  private Subject topic;

  public MyTopicSubscriber(String nm) {
    this.name = nm;
  }

  @Override
  public void update() {
    String msg = (String) topic.getUpdate(this);
    if (msg == null) {
      System.out.println(name + ":: No new message");
    } else
      System.out.println(name + ":: Consuming message::" + msg);
  }

  @Override
  public void setSubject(Subject sub) {
    this.topic = sub;
  }
}
