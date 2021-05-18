package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.entities.models.User;

@Controller 
public class UserController {
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String userInfo(@SessionAttribute("user") User user) {

		System.out.println("Email: " + user.getEmail());
		System.out.println("First Name: " + user.getFname());

		return "usersession";
	}
	
	
	@RequestMapping(value = "/info2", method = RequestMethod.GET)
	public String userInfo2(@SessionAttribute("user") User user) {

		System.out.println("Email: " + user.getEmail());
		System.out.println("First Name: " + user.getFname());

		return "usersession2";
	}
}
