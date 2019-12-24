package com.example.batch.demo1;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskOne implements Tasklet {

  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext){

    System.out.println("MyTaskOne start...");

    System.out.println("MyTaskOne done...");

    return RepeatStatus.FINISHED;

  }

}
