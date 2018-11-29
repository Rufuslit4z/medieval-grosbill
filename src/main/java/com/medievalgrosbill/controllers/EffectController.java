package com.medievalgrosbill.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.effect.EffectRepository;
import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.EffectService;
import com.medievalgrosbill.services.base.BaseService;

import net.bytebuddy.asm.Advice.This;

@Controller
@RequestMapping(value = EffectController.BASE_URL)
public class EffectController {
	
	public static final String BASE_URL = "/admins/effect";
	private static final String BASE_PAGE_NAME = "Effect";
	
	@Autowired
	private EffectService effectService;
	
	@RequestMapping(value = {"","/","/effect"}, method = RequestMethod.GET)
	public String effect(Model model) {

		return BASE_URL+"/effect";
	}
	
	@RequestMapping(value = {"","/","/effect"}, method = RequestMethod.POST)
	public String effectSave(@ModelAttribute Effect effect) {
		this.effectService.save(effect);
		return "redirect:"+BASE_URL;
	}
	
	@RequestMapping(value= {"/find"}, method=RequestMethod.GET)
	public String find(Model model) {
		return BASE_URL+"/find";
	}
	
	@RequestMapping(value= {"/find"}, method=RequestMethod.POST)
	public String findWithCriteria(@RequestParam String name, Model model) {
		model.addAttribute("effect", this.effectService.findByName(name));
		model.addAttribute("error", "ERREUR : L'EFFET \""+name+"\" N'EXISTE PAS");
		return BASE_URL+"/find";
	}
	
	@RequestMapping(value = {"/show"}, method = RequestMethod.GET)
	public String effectShow(Model model) {
		model.addAttribute("effects", this.effectService.findAll());
		return BASE_URL+"/show";
	}
	
	@RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.GET)
	public String effectDeleteById(@PathVariable Integer id) {
		this.effectService.deleteById(id);
		return "redirect:/admins";
	}
	
	@RequestMapping(value = {"/edit/{id}"}, method = RequestMethod.GET)
	public String effectEdit(Model model, @PathVariable Integer id) {
		
		Optional<Effect> effect = this.effectService.find(id);
		model.addAttribute("effect", effect.get());

		return BASE_URL+"/edit";
	}
	
	@RequestMapping(value = {"/edit/{id}"}, method = RequestMethod.POST)
	public String effectEditById(Model model, @ModelAttribute Effect effect) {
		this.effectService.save(effect);
		return "redirect:"+BASE_URL;
	}
}


