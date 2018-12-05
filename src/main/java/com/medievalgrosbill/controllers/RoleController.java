package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.Role;
import com.medievalgrosbill.services.RoleService;

@Controller
@RequestMapping(name=RoleController.BASE_URL)
public class RoleController {
	
	public static final String BASE_URL = "/admins/role";
	private static final String BASE_PAGE_NAME = "Role";
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = {BASE_URL}, method=RequestMethod.GET)
	public String role(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		return BASE_URL;
	}
	
	@RequestMapping(value = {BASE_URL}, method=RequestMethod.POST)
	public String add(Model model, @RequestParam String name) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		this.roleService.save(new Role(name));
		return BASE_URL;
	}
}
