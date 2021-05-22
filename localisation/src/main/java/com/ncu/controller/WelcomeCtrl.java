package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.model.WelcomeModel;

@Controller
public class WelcomeCtrl {

	@RequestMapping("/init1")
	public String initView(Model model, @ModelAttribute("welcome") WelcomeModel wm) {
		System.out.println("Handler method is called.");

		model.addAttribute("welcome_msg", "Spring Mvc Internationalization SignUp Page");

		return "welcome1";
	}

	@RequestMapping("/init2")
	public String next(Model model, @ModelAttribute("welcome") WelcomeModel wm) {

		model.addAttribute("name", wm.getName());

		return "welcome2";
	}
}