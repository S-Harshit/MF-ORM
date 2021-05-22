package com.ncu;


import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
 
public static void main(String[] args) {  
 
   
   ApplicationContext ctx=new ClassPathXmlApplicationContext("config/spring.xml");  
   
   Student obj = new Student();
	obj.setName("Mike");
	obj.setId(23);
	obj.setTot_cred(31);
	obj.setDept_name("somewhere");
	
   StudentDao dao=(StudentDao)ctx.getBean("edao");  
   int status=dao.saveStudent(obj);  


   System.out.println(status);  
         
   /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
   System.out.println(status); 
   */  
         
   /*Employee e=new Employee(); 
   e.setId(102); 
   int status=dao.deleteEmployee(e); 
   System.out.println(status);*/  
     
}  
 
}  