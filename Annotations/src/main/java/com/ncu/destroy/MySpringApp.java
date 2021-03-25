package com.ncu.destroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

		((AnnotationConfigApplicationContext) context).scan("com.ncu.destroy");
		DestroyPrototypeBeansPostProcessor b = context.getBean(DestroyPrototypeBeansPostProcessor.class);
		
		MyBean mb1 = context.getBean(MyBean.class);
		
		MyBean mb2 = context.getBean(MyBean.class);
	
		context.close();

		// ((AnnotationConfigApplicationContext)context).close();

	}

}