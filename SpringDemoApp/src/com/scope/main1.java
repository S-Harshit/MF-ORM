package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.Main;

public class main1 {
	
	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	CheckC objc = (CheckC)context.getBean("checkC");
	CheckC objc2 = (CheckC)context.getBean("checkC");	
 	CheckB objb = (CheckB)context.getBean("checkB");
	CheckB objb2 = (CheckB)context.getBean("checkB");
 	CheckA obja = (CheckA)context.getBean("checkA");
 	CheckA obja2 = (CheckA)context.getBean("checkA");
	
 	
 	System.out.println(objb2.getC().getValueC());
 	objc2.setValueC(25);
 	objb.setC(objc2);
 	System.out.println(objb.getC().getValueC());
	}
}
