package com.ncu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.dao.IUserDao;
import com.ncu.model.User;

@Controller
@SessionAttributes("user")
@RequestMapping("/users")
public class LoginController {

	@Autowired
	private IUserDao userdao;

	@ModelAttribute("user")
	public User setUpUserForm() {
		return new User();
	}

	@RequestMapping("/lg")
	public String index(Model model) {
		model.addAttribute("user", new User());
		return "loginsession";
	}

//	@RequestMapping(value = "/dologin", method = RequestMethod.GET)
//	public String doLogin(@ModelAttribute("user") User user, Model model) {
//
//		// Implement your business logic
//		if (user.getEmail().equals("g") && user.getPassword().equals("b")) {
//			// Set user dummy data
//			System.out.println(user.getEmail() + " Login SSuccess");
//			user.setFname("Grishav");
//			user.setMname("NA");
//			user.setLname("Bhardwaj");
//			user.setAge(34);
//			model.addAttribute(user);
//		} else {
//			model.addAttribute("message", "Login failed. Try again.");
//			System.out.println("login failed");
//			return "loginsession";
//		}
//		return "successsession";
//	}

	@RequestMapping(value = "/dologin", method = RequestMethod.GET)
	public String doLogin(@ModelAttribute("user") User user, Model model) {
		String email = user.getEmail();
		// Implement your business logic
		if (user.getEmail().equals("g") || user.getPassword().equals("b")) {
			// Set user dummy data
			System.out.println(user.getEmail());

			user = userdao.get(email);

			model.addAttribute(user);
		} else {
			model.addAttribute("message", "Login failed. Try again.");
			System.out.println("login failed");
			return "loginsession";
		}
		return "successsession";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String dbInfo(@PathVariable("id") String id, @ModelAttribute("user") User user, Model model) {

		System.out.println("id: " + id);
		System.out.println("First Name: " + user.getFname());

		user = userdao.get(id);
		model.addAttribute(user);
		return "dbinfo";
	}

}