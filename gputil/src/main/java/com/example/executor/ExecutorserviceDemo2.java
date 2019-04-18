package com.example.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author gao peng
 * @date 2019/4/18 17:54
 */
public class ExecutorserviceDemo2 {
  public static void main(String[] args) {
    // creating executor with pool of 2 threads
    ExecutorService executor = Executors.newFixedThreadPool(2);
    // running 4 tasks using pool of 2 threads
    Future<?> f1 = executor.submit(new Task());
    Future<?> f2 = executor.submit(new Task());
    Future<?> f3 = executor.submit(new Task());
    Future<?> f4 = executor.submit(new Task());
    try {
      System.out.println("f1- " + f1.get());
      System.out.println("f2- " + f2.get());
      if (f3.get() == null) {
        System.out.println("submitted task executed successfully");
      }
      System.out.println("f4- " + f4.get());
    } catch (InterruptedException | ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    executor.shutdown();
  }

}

class Task implements Runnable {
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
