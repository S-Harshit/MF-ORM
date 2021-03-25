package com.ncu.aspected2;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XAspect {

	Logger logger = Logger.getLogger(XAspect.class);

	long starttime, endtime;

	@Pointcut("execution(* logic())")
	public void myPointCut() {
	}

	@Before("myPointCut()")
	public void start(JoinPoint jp) {
		logger.debug("Going to start " + jp.getSignature());
		System.out.println("Start Call " + jp.getSignature());
		System.out.println("Method Name: " + jp.getStaticPart().getSignature().getName());
		starttime = System.currentTimeMillis();
		logger.debug("starttime: " + starttime);
	}

	@After("myPointCut()")
	public void end(JoinPoint jp) {
		logger.debug("Going to endtime " + jp.getSignature());

		endtime = System.currentTimeMillis();
		System.out.println("Total Time Taken " + (endtime - starttime) + "ms");
	}

}
