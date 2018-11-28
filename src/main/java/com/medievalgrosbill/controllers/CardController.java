package com.medievalgrosbill.controllers;

import com.medievalgrosbill.dtos.CompleteCardFormDTO;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.models.cards.Curse;
import com.medievalgrosbill.models.cards.Monster;
import com.medievalgrosbill.models.cards.equipment.*;
import com.medievalgrosbill.services.cards.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(CardController.BASE_URL)
public class CardController {

    private static final String BASE_ATTRIBUT_LIST = "items";
    private static final String BASE_ATTRIBUT = "item";
    public static final String BASE_URL = "/cards";
    private static final String BASE_PAGE_NAME = "Cartes";

    @Autowired
    private CardService cardService;

    @RequestMapping(value= {"","/","/index"}, method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute(BASE_ATTRIBUT_LIST,this.cardService.findAll());
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" index");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/index";
    }

    @RequestMapping(value= {"/edit"}, method=RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" create");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/edit";
    }

    @RequestMapping(value= {"/edit/{id}"}, method=RequestMethod.GET)
    public String edit(Model model, @PathVariable Integer id) {
        Card card = this.cardService.find(id).get();
        if (card instanceof Monster) {
            model.addAttribute("card", (Monster)card);
        } else if (card instanceof Curse) {
            model.addAttribute("card", (Curse)card);
        } else if (card instanceof Armor) {
            model.addAttribute("card", (Armor)card);
        } else if (card instanceof Boots) {
            model.addAttribute("card", (Boots)card);
        } else if (card instanceof Head) {
            model.addAttribute("card", (Head)card);
        } else if (card instanceof Other) {
            model.addAttribute("card", (Other)card);
        } else if (card instanceof Weapon) {
            model.addAttribute("card", (Weapon)card);
        }
        return this.BASE_URL+"/edit";
    }

    @RequestMapping(value= {"/edit"}, method=RequestMethod.POST)
    public String editSave(@ModelAttribute CompleteCardFormDTO form) {
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

        return "redirect:"+this.BASE_URL+"/index";
    }

    @RequestMapping(value= {"/edit"}, method=RequestMethod.DELETE)
    public String editDelete() {
        return "redirect:"+this.BASE_URL+"/index";
    }
}
