package com.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * example : https://knpcode.com/java/concurrency/java-executor-tutorial-executorservice-scheduledexecutorservice/
 *
 * @author gao peng
 * @date 2019/4/18 17:49
 */
public class ExecutorserviceDemo {
  public static void main(String[] args) {
    // creating executor with pool of 2 threads
    ExecutorService executor = Executors.newFixedThreadPool(2);
    // running 4 tasks using pool of 2 threads
    executor.execute(new Task());
    executor.execute(new Task());
    executor.execute(new Task());
    executor.execute(new Task());
    executor.shutdown();
  }


  static class Task implements Runnable {
    @Override
    public void run() {
      System.out.println("Executing task (Thread name)- " + Thread.currentThread().getName());
      try {
        TimeUnit.MILLISECONDS.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    }
  }
}