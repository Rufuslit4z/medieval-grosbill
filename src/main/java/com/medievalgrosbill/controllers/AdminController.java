package com.medievalgrosbill.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(AdminController.BASE_URL)
public class AdminController {
public static final String BASE_URL = "/admins";
private static final String BASE_PAGE_NAME = "Admins";
//Ajouter une fonction de list des paths pour les different sous controller d'admin
	
	public static final String BASE_URL = "/admins";
	private static final String BASE_PAGE_NAME = "Admins";
	
	@RequestMapping(value = {"","/","/index"}, method = RequestMethod.GET)
	public String admins(Model model) {
		model.addAttribute("detailPath", BASE_URL);
		return BASE_URL+"/index";
	}
}
