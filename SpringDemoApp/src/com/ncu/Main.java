package com.ncu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fourth.TennisCoach;

public class Main {

    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Iworker iw = (Iworker)context.getBean("fast", FastProduce.class);
	 Consumer obj = new Consumer(iw);
	 
	 TennisCoach tennis = (TennisCoach)context.getBean("tennis");
     TennisCoach tennis1 = (TennisCoach)context.getBean("tennis");
     
     
     tennis.setName("1");
     tennis1.setName("2");
    
     System.out.println(tennis.getName());
     System.out.println(tennis1.getName());
     
	 obj.consumer();
    }
}
