package com.example.demo;


/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {

    String amount = "12045";
    if (amount.length() >= 3) {
      System.out.println("1:" + amount.substring(amount.length()-3, amount.length()-2));
    } else {
      System.out.println("2:" + amount.length());
    }
  }

}

class DemoVo {

  private int count;

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}





