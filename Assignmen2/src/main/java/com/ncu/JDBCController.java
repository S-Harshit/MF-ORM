package com.ncu;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JDBCController {

	@RequestMapping("/stud")
	public ModelAndView information(@RequestParam("name") String name, @RequestParam("dept_name") String dept_name,
			@RequestParam("id") int id, @RequestParam("tot_cred") int tot_cred) {

		Student obj = new Student();
		obj.setName(name);
		obj.setId(id);
		obj.setTot_cred(tot_cred);
		obj.setDept_name(dept_name);

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring.xml");

		IStudentDao dao = (IStudentDao) ctx.getBean("edao");
		int status = dao.saveStudent(obj);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentinfo");
		mv.addObject("stuff", obj.toString());
		return mv;
	}

	@RequestMapping("/getStudent")
	public ModelAndView getStudentvalues() {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config/spring.xml");  
	     
		   IStudentDao dao=(IStudentDao)ctx.getBean("edao");  
		   List<Map<String, Object>> obj4 =  dao.getStudent();
		   
		ModelAndView mv2 = new ModelAndView();
		mv2.setViewName("infs");
		

			StringBuilder sb = new StringBuilder();
			for (Map<String, Object> s : obj4) 
			{
			    sb.append(s);
			    sb.append("\t");
			}
				
		mv2.addObject("stuff2",sb.toString());
		return mv2;
		   
	}

}
