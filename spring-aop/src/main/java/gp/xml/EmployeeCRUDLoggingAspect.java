package gp.xml;

import org.aspectj.lang.JoinPoint;

public class EmployeeCRUDLoggingAspect {

  public void logBefore(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logBefore() : " + joinPoint.getSignature().getName());
  }

  public void logAfter(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logAfter() : " + joinPoint.getSignature().getName());
  }
}
