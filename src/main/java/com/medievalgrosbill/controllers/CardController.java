package com.medievalgrosbill.controllers;

import com.medievalgrosbill.dtos.CompleteCardFormDTO;
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
    public static final String BASE_URL = "/admins/cards";
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

   /* @RequestMapping(value= {"/delete/{id}"}, method=RequestMethod.GET)
    public String deleteId(Model model, @PathVariable Integer id) {
        this.cardService.deleteById(id);
        return "redirect:"+this.BASE_URL+"/index";
    }

    @RequestMapping(value= {"/delete"}, method=RequestMethod.GET)
    public String deleteCriteria(Model model) {
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" deletion criteria");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/delete";
    }

    @RequestMapping(value= {"/delete"}, method=RequestMethod.POST)
    public String deleteCriteriaSearch(Model model, @ModelAttribute T item) {
        List<T> items = this.cardService.findWithCriteria(item);
        if (items.size() > 0) {
            model.addAttribute(BASE_ATTRIBUT_LIST,items);
        }else {
            model.addAttribute("notFound","No match");
        }

        model.addAttribute("pageName",this.BASE_PAGE_NAME+" deletion criteria");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/delete";
    }

    @RequestMapping(value= {"/deletecriteria"}, method=RequestMethod.POST)
    public String deleteCriteriaDelete(@ModelAttribute BaseDeleteCriteriaDTO<T> form) {
        this.cardService.delete(form.getItems());
        return "redirect:"+this.BASE_URL+"/delete";
    }

    @RequestMapping(value= {"/find"}, method=RequestMethod.GET)
    public String findCriteria(Model model) {
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" find criteria");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/find";
    }

    @RequestMapping(value= {"/find"}, method=RequestMethod.POST)
    public String findCriteriaSearch(Model model, @ModelAttribute T item) {
        List<T> roles = this.cardService.findWithCriteria(item);
        if (roles.size() > 0) {
            model.addAttribute(BASE_ATTRIBUT_LIST,roles);
        }else {
            model.addAttribute("notFound","No match");
        }

        model.addAttribute("pageName",this.BASE_PAGE_NAME+" find criteria");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/find";
    }*/

    @RequestMapping(value= {"/edit"}, method=RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" create");
        model.addAttribute("detailPath",this.BASE_URL);
        return this.BASE_URL+"/edit";
    }

    @RequestMapping(value= {"/edit/{id}"}, method=RequestMethod.GET)
    public String edit(Model model, @PathVariable Integer id) {
        model.addAttribute(BASE_ATTRIBUT,this.cardService.find(id).get());
        model.addAttribute("pageName",this.BASE_PAGE_NAME+" edit");
        model.addAttribute("detailPath",this.BASE_URL);
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

    /*
    @RequestMapping(value= {"/edit"}, method=RequestMethod.POST)
    public String editDelete() {
        return "redirect:"+this.BASE_URL+"/index";
    }*/
}
