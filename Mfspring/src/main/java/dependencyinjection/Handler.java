package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Handler {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(projeConfiguration.class);
		
		Coach coach = (Coach) ac.getBean("coach"); 
		System.out.println(coach.startTraining());
	  //System.out.println(coach.getName());
		((AbstractApplicationContext)ac).close();
		System.out.println(coach.stopTraining());
		
	
		
		
		
	
	}
}
