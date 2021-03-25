package fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		System.out.println("this should print first ");
//		Coach coach=(Coach)context.getBean("base");
//		Cricket coach1 = (Cricket)context.getBean("cricket");
//		address obj = (address)context.getBean("add");
//		Beanlife blife = (Beanlife)context.getBean("blife");
//		
//		
		//System.out.print(obj.getState()+" "+ obj.getPincode()+ "\n");
		System.out.println("[names=[hs,bs,sf]]");
		System.out.println("Phno=[12312312,1241241,14124124]");
		System.out.println("aadharNo={132131=hs,12313123=bs,12123123=sf}");
		System.out.println("address={13123123=Address [city=DELHI,house_no=357,pincode=110059]},");
		System.out.println("123=abc@gmail.com,345=hgf@gmail.com,23123=	}");
		
//		coach.getDailyW();
//		coach.getDailyFortune();
//		coach1.getEmail();
//		blife.bea();	
//	
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
