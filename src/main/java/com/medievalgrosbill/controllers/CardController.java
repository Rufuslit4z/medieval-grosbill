package com.medievalgrosbill.controllers;

import com.medievalgrosbill.dtos.CompleteCardFormDTO;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.models.cards.Curse;
import com.medievalgrosbill.models.cards.Monster;
import com.medievalgrosbill.models.cards.equipment.*;
import com.medievalgrosbill.services.EffectService;
import com.medievalgrosbill.services.cards.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value=CardController.BASE_URL)
public class CardController {

	protected final static String BASE_URL = "/admins/cards";
	
    private final String BASE_ATTRIBUT_LIST = "cards";
    private final String BASE_ATTRIBUT = "card";
    private  final String BASE_PAGE_NAME = "Cartes";

    @Autowired
    private CardService cardService;

    @Autowired
    private EffectService effectService;

    @RequestMapping(value={"","/","/index"}, method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute(BASE_ATTRIBUT_LIST,this.cardService.findAll());
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" index");
        model.addAttribute("detailPath",this.BASE_URL);
        // isConnected ?
     	model.addAttribute("isConnected", true);
     	model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
        return BASE_URL+"/index";
    }

    @RequestMapping(value= {"/find"}, method=RequestMethod.POST)
    public String find(Model model, @RequestParam String search) {
    	model.addAttribute("detailPath",this.BASE_URL);
    	if (!search.equals("")) {
            model.addAttribute(BASE_ATTRIBUT_LIST,this.cardService.findByName(search));
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

    @RequestMapping(value={"/create"}, method=RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" create");
        model.addAttribute("detailPath", this.BASE_URL);
        model.addAttribute("effect", this.effectService.findAll());
        // isConnected ?
     	model.addAttribute("isConnected", true);
     	model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
        return BASE_URL+"/create";
    }

    @RequestMapping(value={"/edit/{id}"}, method=RequestMethod.GET)
    public String edit(Model model, @PathVariable Integer id) {
        Card card = this.cardService.find(id).get();
        if (card instanceof Monster) {
            model.addAttribute(BASE_ATTRIBUT, (Monster)card);
            model.addAttribute("type","monster");
            model.addAttribute("switch","monster");
        } else if (card instanceof Curse) {
            model.addAttribute(BASE_ATTRIBUT, (Curse)card);
            model.addAttribute("type","curse");
            model.addAttribute("switch","monster");
        } else if (card instanceof Armor) {
            model.addAttribute(BASE_ATTRIBUT, (Armor)card);
            model.addAttribute("type","armor");
            model.addAttribute("switch","equipment");
        } else if (card instanceof Boots) {
            model.addAttribute(BASE_ATTRIBUT, (Boots)card);
            model.addAttribute("type","boots");
            model.addAttribute("switch","equipment");
        } else if (card instanceof Head) {
            model.addAttribute(BASE_ATTRIBUT, (Head)card);
            model.addAttribute("type","head");
            model.addAttribute("switch","equipment");
        } else if (card instanceof Other) {
            model.addAttribute(BASE_ATTRIBUT, (Other)card);
            model.addAttribute("type","other");
            model.addAttribute("switch","equipment");
        } else if (card instanceof Weapon) {
            model.addAttribute(BASE_ATTRIBUT, (Weapon)card);
            model.addAttribute("type","weapon");
            model.addAttribute("switch","equipment");
        }
        model.addAttribute("detailPath",this.BASE_URL);
        // isConnected ?
     	model.addAttribute("isConnected", true);
     	model.addAttribute("isAdmin", true);
		// isOnLogin
		model.addAttribute("isOnLogin", false);
		// isOnRegister
		model.addAttribute("isOnRegister", false);
        return BASE_URL+"/edit";
    }

    @RequestMapping(value={"/create"}, method=RequestMethod.POST)
    public String editSave(Model model, @ModelAttribute CompleteCardFormDTO form) {
        if (form.getMonster() != null) {
            this.cardService.save(form.getMonster());
        } else if (form.getCurse() != null) {
            this.cardService.save(form.getCurse());
        } else if (form.getArmor() != null) {
            this.cardService.save(form.getArmor());
        } else if (form.getBoots() != null) {
            this.cardService.save(form.getBoots());
        } else if (form.getHead() != null) {
            this.cardService.save(form.getHead());
        } else if (form.getOther() != null) {
            this.cardService.save(form.getOther());
        } else if (form.getWeapon() != null) {
            this.cardService.save(form.getWeapon());
        }
        // isConnected ?
     	model.addAttribute("isConnected", true);
     	model.addAttribute("isAdmin", true);
        return "redirect:"+BASE_URL;
    }

    @RequestMapping(value={"/delete/{id}"}, method=RequestMethod.GET)
    public String editDelete(Model model, @PathVariable Integer id) {
        this.cardService.deleteById(id);
        // isConnected ?
     	model.addAttribute("isConnected", true);
     	model.addAttribute("isAdmin", true);
        return "redirect:"+BASE_URL;
    }
}
