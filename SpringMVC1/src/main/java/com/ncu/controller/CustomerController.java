package com.ncu.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.model.Cutomer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
		
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("cutomer", new Cutomer());
		return "password";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("cutomer") Cutomer theCustomer,
			BindingResult theBindingResult, Model model) {
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		
		if (theBindingResult.hasErrors()) {
			return "password";
		}
		else {
			System.out.println("test");
			model.addAttribute("cutomer", theCustomer);
			return "passConfirm";
		}
	}
}