package com.medievalgrosbill.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.security.services.UserDetailServiceImpl;
import com.medievalgrosbill.services.RoleService;
import com.medievalgrosbill.services.users.UserService;
import com.medievalgrosbill.validators.UserValidator;

@Controller
public class RegistrationController {
	
	@Autowired
    private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
    private UserValidator userValidator;
	
	@Autowired
	private UserDetailServiceImpl userDetailsServiceImpl;
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        return "/security/registration";
    }
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute User user, @RequestParam String passwordconfirm, BindingResult bindingResult, Model model) {
        this.userValidator.validate(user, bindingResult);

        model.addAttribute("postresult", bindingResult);
        
        if (bindingResult.hasErrors() || !user.getPassword().equals(passwordconfirm)) {
            model.addAttribute("postresult", bindingResult);
        	return "redirect:/registration";
        }

        user.getRoles().add(this.roleService.findByName("USER"));
        user.setActive(1);
        this.userService.save(user);
        
        this.userDetailsServiceImpl.autologin(user.getEmail(), user.getPassword());
        
        return "redirect:/";
    }
}
