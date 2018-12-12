package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.services.users.UserService;

@Controller
@RequestMapping(AdminController.BASE_URL)
public class AdminController {

	public static final String BASE_URL = "/admins";
	private static final String BASE_PAGE_NAME = "Admins";
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"","/","/index"}, method = RequestMethod.GET)
	public String admins(Model model) {
		model.addAttribute("detailPath", BASE_URL);
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return BASE_URL+"/index";
	}
}
