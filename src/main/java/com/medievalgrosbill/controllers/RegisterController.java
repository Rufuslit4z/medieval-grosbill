package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.services.EffectService;

@Controller
@RequestMapping(value = RegisterController.BASE_URL)
public class RegisterController {
	public static final String BASE_URL = "/register";
	private static final String BASE_PAGE_NAME = "Register";
	
	//@Autowired
	//private EffectService effectService;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL;
	}
}
