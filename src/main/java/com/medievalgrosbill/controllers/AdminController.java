package com.medievalgrosbill.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping(AdminController.BASE_URL)
public class AdminController {
	
	public static final String BASE_URL = "/admins";
	private static final String BASE_PAGE_NAME = "Admins";
	
	@RequestMapping(value = {"","/","/index"}, method = RequestMethod.GET)
	public String admins(Model model) {
		
		return BASE_URL+"/index";
	}
}
