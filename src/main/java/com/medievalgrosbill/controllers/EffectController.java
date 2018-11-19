package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.medievalgrosbill.controllers.base.BaseController;
import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.EffectService;
import com.medievalgrosbill.services.base.BaseService;

public class EffectController extends BaseController<Effect> {
	
	public static final String BASE_URL = "/admins/effect";
	private static final String BASE_PAGE_NAME = "Effect";
	
	@Autowired
	private EffectService effectService;
	
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
		
	}
}


