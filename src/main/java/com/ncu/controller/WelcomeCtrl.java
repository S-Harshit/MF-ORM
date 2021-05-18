package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeCtrl {

	@RequestMapping("/init")
	public String initView(Model model) {
		System.out.println("Handler method is called.");

		model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
		return "welcome";
	}
}