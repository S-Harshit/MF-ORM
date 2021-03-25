package com.ncu.aspected3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnlyticsAspect {

	@Before("execution(* print())")
	public void beforePrint() {
		System.out.println("Order 3");
	}

}
