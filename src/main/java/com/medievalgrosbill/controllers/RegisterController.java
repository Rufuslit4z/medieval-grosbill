package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.RoleService;
import com.medievalgrosbill.services.users.UserService;

@Controller
@RequestMapping(value = RegisterController.BASE_URL)
public class RegisterController {
	
	public static final String BASE_URL = "/register";
	private static final String BASE_PAGE_NAME = "Register";
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL;
	}
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.POST)
	public String registerSave(Model model, @ModelAttribute User user) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		user.setActive(0);
		this.userService.save(user);
		return BASE_URL;
	}
}
