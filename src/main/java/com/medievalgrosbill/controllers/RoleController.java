package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.services.RoleService;

@Controller
@RequestMapping(name=RoleController.BASE_URL)
public class RoleController {
	
	public static final String BASE_URL = "/admins/role";
	protected static final String BASE_PAGE_NAME = "Role";
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = {"","/","/role"}, method = RequestMethod.GET)
	public String role(Model model) {
//		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL+"/role";
	}
	
	@RequestMapping(value = {"/role"}, method = RequestMethod.GET)
	public String w(Model model) {
//		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL+"/role";
	}
	
}
