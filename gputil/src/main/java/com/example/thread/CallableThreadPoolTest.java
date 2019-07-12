package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 支持线程回调
 * @author gao peng
 * @date 2019/7/12 15:46
 */
public class CallableThreadPoolTest {
  public static void main(String[] args) {
    int numWorkers = Integer.parseInt(args[0]);

    ExecutorService pool = Executors.newCachedThreadPool();
    CallableWorkerThread workers[] = new CallableWorkerThread[numWorkers];
    Future[] futures = new Future[numWorkers];

    for (int i = 0; i < numWorkers; ++i) {
      workers[i] = new CallableWorkerThread(i + 1);
      futures[i] = pool.submit(workers[i]);
    }
    for (int i = 0; i < numWorkers; ++i) {
      try {
        // 此处出发线程执行
        System.out.println(futures[i].get() + " ended");
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      } catch (ExecutionException ex) {
        ex.printStackTrace();
      }
    }
  }
}

class CallableWorkerThread implements Callable<String> {
  private int workerNumber;

  CallableWorkerThread(int workerNumber) {
    System.out.println("lalala+" + workerNumber);
    this.workerNumber = workerNumber;
  }

  public String call() {    // use call() instead of run()
    for (int i = 1; i <= 5; ++i) {    // just print 1 to 5
      System.out.printf("Worker %d: %d\n", workerNumber, i);
      try {
        Thread.sleep((int) (Math.random() * 1000));
      } catch (InterruptedException e) {
      }
    }
    return "worker " + workerNumber;
  }
}