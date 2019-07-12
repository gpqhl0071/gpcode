package com.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gao peng
 * @date 2019/7/12 15:17
 */
public class ThreadPoolTest {
  public static void main(String[] args) {
    int numWorkers = Integer.parseInt(args[0]);
    int threadPoolSize = Integer.parseInt(args[1]);

    ExecutorService pool =
        Executors.newFixedThreadPool(threadPoolSize);
    WorkerThread[] workers = new WorkerThread[numWorkers];
    for (int i = 0; i < numWorkers; ++i) {
      workers[i] = new WorkerThread(i + 1);
      pool.execute(workers[i]);
    }
    pool.shutdown();
  }
}

class WorkerThread implements Runnable {
  private int workerNumber;

  WorkerThread(int workerNumber) {
    this.workerNumber = workerNumber;
  }

  public void run() {
    // The thread simply prints 1 to 5
    for (int i = 1; i <= 5; ++i) {
      System.out.printf("Worker %d: %d\n", workerNumber, i);
      try {
        // sleep for 0 to 0.5 second
        Thread.sleep((int) (Math.random() * 500));
      } catch (InterruptedException e) {
      }
    }
  }
}