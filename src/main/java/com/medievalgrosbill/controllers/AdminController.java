package com.medievalgrosbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.medievalgrosbill.controllers.base.BaseController;
import com.medievalgrosbill.database.DBItem;
import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.AdminService;
import com.medievalgrosbill.services.base.BaseService;

public class AdminController extends BaseController {

	public static final String BASE_URL = "/admins";
	private static final String BASE_PAGE_NAME = "Admins";
	
	@Autowired
	private AdminService adminService;
	
	@Override
	protected BaseService<Effect> getBaseService() {
		// TODO Auto-generated method stub
		return adminService;
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
	protected void setupOtherFields(DBItem item) {
		// TODO Auto-generated method stub
		
	}


}
