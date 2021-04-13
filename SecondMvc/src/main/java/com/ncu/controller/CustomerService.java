package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.entities.models.Customer;

@Controller
public class CustomerService {

	@RequestMapping("/complex")
	public String complexForm() {
		return "complexform";
	}

	@RequestMapping(path = "handleform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("customer") Customer customer, BindingResult result ) {
		
		if (result.hasErrors()) {
			return "complexform";
		}
		
		System.out.println(customer);
		return "success";
	}
}
