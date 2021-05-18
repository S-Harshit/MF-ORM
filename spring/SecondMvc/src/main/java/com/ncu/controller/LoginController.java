package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.entities.models.User;

@Controller
@SessionAttributes("user")
@RequestMapping("/users")
public class LoginController {
	
	@ModelAttribute("user")
	   public User setUpUserForm() {
	      return new User();
	   }

	   @RequestMapping("/")
	   public String index(Model model) {
	     model.addAttribute("user", new User());
		   return "loginsession";
	   }

	   @RequestMapping(value="/dologin", method=RequestMethod.GET)
	   public String doLogin(@ModelAttribute("user") User user, Model model) {

	      // Implement your business logic
	      if (user.getEmail().equals("ishit@gmail.com") && user.getPassword().equals("seti@123")) {
	         // Set user dummy data
	        System.out.println(user.getEmail() + " Login SSuccess");
	    	 user.setFname("Ishit");
	         user.setMname("Sethi");
	         user.setLname(", delhi");
	         user.setAge(34);
	         model.addAttribute(user);
	      } else{
	         model.addAttribute("message","Login failed. Try again.");
	         System.out.println("login failed");
	         return "loginsession";
	      }
	      return "successsession";
	   }
}