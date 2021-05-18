package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.entities.models.Student;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "This is Gopal");
		return "index";
	}

//	@RequestMapping("/login")
//	public String loginmsg(Model model) {
//		model.addAttribute("msg", "kalra login");
//		return "login";
//	}

	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userId = request.getParameter("userId");
		model.addAttribute("msg", "kalra login" + userId);
		model.addAttribute("model", new Student());
		return "login";
	}

	/*
	 * @RequestMapping("/now") public String display(@RequestParam("userId") String
	 * id, @RequestParam("pwd") String pwd, Model model) {{
	  
	 
	 * String msg = "Hello there " + id + " " + pwd; // add a message to the model
	 * model.addAttribute("message", msg); model.addAttribute("id", id);
	 * model.addAttribute("pass", pwd); return "display";
	 * 
	 *   } 
	 * }
	 */

	@RequestMapping("/now")
	public String doLog(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("pass",student.getId());
		model.addAttribute("message", "Welcome " + student.getName());
		return "display";
	}
	
	@RequestMapping("/init")
	public String initView(Model model) {
		System.out.println("Handler method is called.");

		model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
		return "langjsp";
	}
}