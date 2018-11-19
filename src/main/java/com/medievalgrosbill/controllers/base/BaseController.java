package com.medievalgrosbill.controllers.base;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medievalgrosbill.database.DBItem;
import com.medievalgrosbill.services.base.BaseService;

public abstract class BaseController<T extends DBItem> {
	
	private static final String BASE_ATTRIBUT_LIST = "items";
	private static final String BASE_ATTRIBUT = "item";
	
	protected abstract BaseService<T> getBaseService();
	protected abstract String getBaseURL();
	protected abstract String getBasePageName();
	protected abstract void setOtherAttributes(Model model);
	protected abstract void setupOtherFields(T item);

	@RequestMapping(value = {"","/","/index"}, method=RequestMethod.GET)
	public String index(Model model) {
		//model.addAttribute(BASE_ATTRIBUT_LIST,this.getBaseService().findAll());
		//model.addAttribute("pageName",this.getBasePageName()+" index");
		//model.addAttribute("detailPath",this.getBaseURL());
		return this.getBaseURL()+"/index";
	}
	
	@RequestMapping(value = {"/admins","/admins/index"}, method=RequestMethod.GET)
	public String admins(Model model) {
		//model.addAttribute(BASE_ATTRIBUT_LIST,this.getBaseService().findAll());
		//model.addAttribute("pageName",this.getBasePageName()+" index");
		//model.addAttribute("detailPath",this.getBaseURL());
		return this.getBaseURL()+"/admins";
	}
}
