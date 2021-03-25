package com.ncu.aspected;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Before("execution(* getName() )")
	public void beforeGetName() {
		System.out.println("Before getName");
	}

	@After("execution(* setName(..))")
	public void afterSetName() {
		System.out.println("After setName");
	}

	@Around("execution(* calculate_sal())")
	public void aroundCalculate_sal(ProceedingJoinPoint joinPoint) throws Throwable {
	     System.out.println("Around method getting called");
	     joinPoint.proceed();
	 }
}
