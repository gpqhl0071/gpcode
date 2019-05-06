package com.example.executor;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author gao peng
 * @date 2019/4/18 17:56
 */
public class ExecutorserviceDemo4 {
  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);
    // Callable implementation
    // lambda 表达式用法，仅限用于jdk8 以上
    Callable<String> c = () -> {
      System.out.println("Executed at- " + new Date());
      return "Executing task";
    };
    System.out.println("Time before execution started- " + new Date());
    // scheduling tasks with callable as param to be
    // executed after a delay of 3 Secs
    ScheduledFuture<String> sf = scheduledExecutor.schedule(c, 3, TimeUnit.SECONDS);
    try {
      System.out.println("Value- " + sf.get());
    } catch (InterruptedException | ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    scheduledExecutor.shutdown();
  }
}
