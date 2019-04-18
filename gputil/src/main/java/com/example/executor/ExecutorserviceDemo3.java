package com.example.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author gao peng
 * @date 2019/4/18 17:55
 */
public class ExecutorserviceDemo3 {
  public static void main(String[] args) {
    // creating executor with pool of 2 threads
    ExecutorService executor = Executors.newFixedThreadPool(2);
    // running 4 tasks using pool of 2 threads
    Future<String> f1 = executor.submit(new Task1());
    Future<String> f2 = executor.submit(new Task1());
    Future<String> f3 = executor.submit(new Task2());
    Future<String> f4 = executor.submit(new Task2());
    try {
      System.out.println("f1- " + f1.get());
      System.out.println("f2- " + f2.get());
      System.out.println("f3- " + f3.get());
      System.out.println("f4- " + f4.get());
    } catch (InterruptedException | ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    executor.shutdown();
  }

}

class Task1 implements Callable<String> {
  @Override
  public String call() throws Exception {
    System.out.println("Executing task (Thread name)- " + Thread.currentThread().getName());
    try {
      TimeUnit.MILLISECONDS.sleep(500);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "In Task1";
  }
}

class Task2 implements Callable<String> {
  @Override
  public String call() throws Exception {
    System.out.println("Executing task (Thread name)- " + Thread.currentThread().getName());
    try {
      TimeUnit.MILLISECONDS.sleep(500);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "In Task2";
  }
}
