package com.example.thread;

/**
 * <p>通过synchronized关键字，锁住方法，避免多线程导致的线程安全的问题</p>
 * @author gao peng
 * @date 2019/7/10 17:40
 */
public class TestSynchronizedCounter {
  public static void main(String[] args) {
    Thread threadIncrement = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 10; ++i) {
          SynchronizedCounter.increment();
          try {
            sleep(1);
          } catch (InterruptedException e) {
          }
        }
      }
    };

    Thread threadDecrement = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 10; ++i) {
          SynchronizedCounter.decrement();
          try {
            sleep(1);
          } catch (InterruptedException e) {
          }
        }
      }
    };

    threadIncrement.start();
    threadDecrement.start();
  }
}

class SynchronizedCounter {
  private static int count = 0;

  public synchronized static void increment() {
    ++count;
    System.out.println("Count is " + count + " @ " + System.nanoTime());
  }

  public synchronized static void decrement() {
    --count;
    System.out.println("Count is " + count + " @ " + System.nanoTime());
  }
}
