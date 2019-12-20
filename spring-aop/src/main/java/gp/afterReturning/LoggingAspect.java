package gp.afterReturning;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Before("execution(* gp.afterReturning.EmployeeManagerImpl.*(..))")
  public void before() throws Throwable {
    System.out.println("**** before ");

  }

  @After("execution(* gp.afterReturning.EmployeeManagerImpl.*(..))")
  public void after() throws Throwable {
    System.out.println("**** after ");

  }

  @AfterReturning("execution(* gp.afterReturning.EmployeeManagerImpl.*(..))")
  public void afterReturning() throws Throwable {
    System.out.println("**** after returning");

  }

  @AfterThrowing("execution(* gp.afterReturning.EmployeeManagerImpl.*(..))")
  public void afterThrowing() throws Throwable {
    System.out.println("**** throw exception ");

  }
}
