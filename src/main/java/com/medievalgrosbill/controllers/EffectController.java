package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.EffectService;

@Controller
@RequestMapping(value=EffectController.BASE_URL)
public class EffectController {
	
	public static final String BASE_URL = "/admins/effect";
	private static final String BASE_PAGE_NAME = "Effect";
	
	@Autowired
	private EffectService effectService;

	@RequestMapping(value={"","/","/index"}, method=RequestMethod.GET)
	public String effect(Model model) {
		model.addAttribute("pageName", BASE_PAGE_NAME);
		model.addAttribute("detailPath",BASE_URL);
		model.addAttribute("effects", this.effectService.findAll());
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
		model.addAttribute("detailPath", BASE_URL);
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
	public String effectSave(Model model, @ModelAttribute Effect effect) {
		this.effectService.save(effect);
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
	public String findWithCriteria(Model model, @RequestParam String search) {
		if (!search.equals("")) {
			model.addAttribute("effect", this.effectService.findByName(search));
		}
		model.addAttribute("detailPath", BASE_URL);
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
	public String effectDeleteById(Model model, @PathVariable Integer id) {
		this.effectService.deleteById(id);
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value={"/edit/{id}"}, method=RequestMethod.GET)
	public String effectEdit(Model model, @PathVariable Integer id) {
		model.addAttribute("detailPath", BASE_URL);
		model.addAttribute("effect", this.effectService.find(id).get());
		// isConnected ?
		model.addAttribute("isConnected", true);
		model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
		return BASE_URL+"/edit";
	}
}