package com.example.batch.demo1;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
  @Autowired
  JobLauncher jobLauncher;
  @Autowired
  Job job;

  @Override
  public void run(String... args) throws Exception {
    JobParameters params = new JobParametersBuilder()
        .addString("JobID", String.valueOf(System.currentTimeMillis()))
        .toJobParameters();

    jobLauncher.run(job, params);
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
