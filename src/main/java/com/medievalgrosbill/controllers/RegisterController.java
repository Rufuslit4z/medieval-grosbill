package com.medievalgrosbill.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.models.Role;
import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.RoleService;
import com.medievalgrosbill.services.users.UserService;
import com.medievalgrosbill.validators.UserValidator;

@Controller
@RequestMapping(value = RegisterController.BASE_URL)
public class RegisterController {
	
	public static final String BASE_URL = "/register";
	private static final String BASE_PAGE_NAME = "Register";
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	private UserValidator validator;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL;
	}
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.POST)
	public String registerSave(@Valid User user, BindingResult bindingResult, Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		
		validator.validate(user, bindingResult);
		model.addAttribute("errors",bindingResult);
		user.setActive(0);
		user.setRoles((List<Role>) this.roleService.findAll());
		this.userService.save(user);
		return BASE_URL;
	}
}
