package com.ncuindia.controllers;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//add controller annotation here
@Controller 
public class WelcomeController {
//To start the model controller add Request Mapping Annotation with argument hello, hello has to passed in URL to start this model
@RequestMapping("/hello")
public String sayWelcome(Model model) {
//To send data on JSP, model.addAttribute is used and the value is sent in key msg the //value Hello user.
model.addAttribute("msg","hello user") ;
		
return "welcome";
}
}