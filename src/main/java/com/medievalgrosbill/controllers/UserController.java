package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.users.UserService;

@Controller
@RequestMapping(value = UserController.BASE_URL)
public class UserController {

	public static final String BASE_URL = "/admins/user";
	private static final String BASE_PAGE_NAME = "User";
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"","/","/index"}, method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		model.addAttribute("detailPath",this.BASE_URL);
		model.addAttribute("users",this.userService.findAll());		
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return BASE_URL+"/index";
	}
	
	@RequestMapping(value={"/delete/{id}"}, method=RequestMethod.GET)
	public String deleteById(Model model, @PathVariable Integer id) {
		this.userService.deleteById(id);
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value={"/active/{id}={active}"}, method=RequestMethod.GET)
	public String enableOrDisableById(Model model, @PathVariable Integer id, @PathVariable Integer active) {
		User user = this.userService.findById(id).get();
		System.out.println("ID : "+id);
		System.out.println("ACTIVE : "+active);
		user.setActive(active);
		this.userService.save(user);
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value={"/find"}, method=RequestMethod.POST)
    public String find(Model model, @RequestParam String search) {
    	model.addAttribute("detailPath",this.BASE_URL);
    	if (!search.equals("")) {
            model.addAttribute("u", this.userService.findByUsername(search));
        }
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
