package com.ncu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.model.Customer;

@Controller
public class SignUpController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult, Model model) {
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			model.addAttribute("customer", theCustomer);
			return "customer-confirmation";
		}
	}
	
}
