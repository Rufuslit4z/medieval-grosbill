package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.Role;
import com.medievalgrosbill.services.RoleService;

@Controller
@RequestMapping(value=RoleController.BASE_URL)
public class RoleController {
	
	public static final String BASE_URL = "/admins/role";
	private static final String BASE_PAGE_NAME = "Role";
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value={"","/","/index"}, method=RequestMethod.GET)
	public String role(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		model.addAttribute("detailPath",BASE_URL);
		model.addAttribute("roles", this.roleService.findAll());
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return BASE_URL+"/index";
	}
	
	
	@RequestMapping(value={"/create"}, method=RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		model.addAttribute("detailPath",BASE_URL);
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return BASE_URL+"/create";
	}
	
	@RequestMapping(value={"/create"}, method=RequestMethod.POST)
	public String create(Model model, @RequestParam String name) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		this.roleService.save(new Role(name));
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.GET)
	public String deleteById(Model model, @PathVariable Integer id) {
		this.roleService.deleteById(id);
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
            model.addAttribute("r", this.roleService.findByName(search));
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
