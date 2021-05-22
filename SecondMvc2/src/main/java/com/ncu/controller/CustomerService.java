package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.entities.models.Customer;
import com.ncu.entities.models.Q3Model;

@Controller
public class CustomerService {

	@RequestMapping("/complex")
	public String complexForm() {
		return "complexform";
	}
	
	@RequestMapping("/gopal")
	public String complexForm(Model model) {
		model.addAttribute("Q3Model", new Q3Model("Gopal", "20", "1234567890",
				"1234", "Male", "Address","CSE"));

		return "testings";
	}


	@RequestMapping(path = "handleform", method = RequestMethod.POST)
	public String handleForm( @ModelAttribute("customer") Customer customer, BindingResult result ) {
		
		if (result.hasErrors()) {
			return "complexform";
		}
		
		System.out.println(customer);
		return "success";
	}
}
