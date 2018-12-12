package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.services.users.UserService;


@Controller
@RequestMapping(value=IndexController.BASE_URL)
public class IndexController {

	public static final String BASE_URL = "/";

	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"",BASE_URL,"/index"}, method=RequestMethod.GET)
	public String index(Model model) {
		// isConnected ?
		if(SecurityContextHolder.getContext().getAuthentication().getName() == "anonymousUser") {
			model.addAttribute("isConnected", false);
			model.addAttribute("isAdmin", false);
			System.out.println("AN ANONYMOUS_USER IS CONNECTED\r");
		} else {
			model.addAttribute("isConnected", true);
			String role = userService.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName()).getRoles().get(0).getName();
			if(role.equalsIgnoreCase("admin")) {
				System.out.println("AN ADMIN IS CONNECTED\r");
				model.addAttribute("isAdmin", true);
			} else {
				System.out.println("AN USER IS CONNECTED\r");
				model.addAttribute("isAdmin", false);
			}
		}
		// isOnLogin
		model.addAttribute("isOnLogin", true);
		// isOnRegister
		model.addAttribute("isOnRegister", true);
		return BASE_URL+"index";
	}
}
