package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.EffectService;

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
		effectService.save(effect);
		return "redirect:"+BASE_URL+"/effect";
	}
	
	/*
	@Override
	protected BaseService<Effect> getBaseService() {
		// TODO Auto-generated method stub
		return effectService;
	}
	
	@Override
	protected String getBaseURL() {
		// TODO Auto-generated method stub
		return BASE_URL;
	}
	
	@Override
	protected String getBasePageName() {
		// TODO Auto-generated method stub
		return BASE_PAGE_NAME;
	}
	
	@Override
	protected void setOtherAttributes(Model model) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void setupOtherFields(Effect item) {
		// TODO Auto-generated method stub
		
	}*/
}


