package com.example1.beanPostProcessor;

public class Cat {

  private String name;

  private int age;

  public void say() {
    System.out.println("name:" + name);
    System.out.println("age:" + age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
