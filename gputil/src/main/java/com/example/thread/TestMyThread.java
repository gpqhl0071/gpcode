package com.example.thread;

/**
 * @author gao peng
 * @date 2019/7/10 17:19
 */
public class TestMyThread {

  public static void main(String[] args) {
    Thread[] threads = {
        new MyThread("Thread 1"),
        new MyThread("Thread 2"),
        new MyThread("Thread 3")
    };
    for (Thread t : threads) {
      t.start();
    }
  }

}

class MyThread extends Thread {
  private String name;

  public MyThread(String name) {   // constructor
    this.name = name;
  }

  // Override the run() method to specify the thread's running behavior
  @Override
  public void run() {
    for (int i = 1; i <= 5; ++i) {
      System.out.println(name + ": " + i);
      yield();
    }
  }
}