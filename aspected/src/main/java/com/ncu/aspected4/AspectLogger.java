package com.ncu.aspected4;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogger {

	Logger l = Logger.getLogger(AspectLogger.class);

	@Pointcut("execution(* getEmployeewithid(..))")
	public void pointCut() {

	}

	@Around("pointCut()")
	public void aroundGetEmployeewithid(ProceedingJoinPoint pt) {

		System.out.println("Before");
		try {
			pt.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			l.debug(e);
//			e.printStackTrace();
		}
		System.out.println("After");
	}

}
