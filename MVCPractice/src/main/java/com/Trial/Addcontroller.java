package com.Trial;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addcontroller {
	
	@RequestMapping("/add")
	public ModelAndView add( @RequestParam("inp1")int i,@RequestParam("inp2") int j) {
		
//		int i = Integer.parseInt(request.getParameter("inp1"));
//		int j = Integer.parseInt(request.getParameter("inp2"));
//		
		
		int result = i + j;
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("result",result);
		
		
		return mv;
	}


}
