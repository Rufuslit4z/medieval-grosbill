package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.users.UserService;
import com.medievalgrosbill.validators.UserValidator;

@Controller
@RequestMapping(name = UserController.BASE_URL)
public class UserController {

	public static final String BASE_URL = "/admins/user";
	private static final String BASE_PAGE_NAME = "User";
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {BASE_URL}, method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		model.addAttribute("detailPath",this.BASE_URL);
		model.addAttribute("users",this.userService.findAll());
		return BASE_URL+"/index";
	}
	
	@RequestMapping(value = {BASE_URL+"/delete/{id}"}, method = RequestMethod.GET)
	public String deleteById(@PathVariable Integer id) {
		this.userService.deleteById(id);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value = {BASE_URL+"/active/{id}={active}"}, method = RequestMethod.GET)
	public String enableOrDisableById(@PathVariable Integer id, @PathVariable Integer active) {
		User user = this.userService.findById(id).get();
		System.out.println("ID : "+id);
		System.out.println("ACTIVE : "+active);
		user.setActive(active);
		this.userService.save(user);
		return "redirect:"+BASE_URL;
	}
	
//	@RequestMapping(value = {BASE_URL+"/find"}, method = RequestMethod.POST)
//	public String find(Model model, @RequestParam String search) {
//		
//		return "redirect:"+BASE_URL;
//	}
}
