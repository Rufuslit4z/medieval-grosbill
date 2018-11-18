package com.medievalgrosbill.controllers;

import com.medievalgrosbill.controllers.base.BaseController;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(CardController.BASE_URL)
public class CardController extends BaseController<Card> {

    public static final String BASE_URL = "/cards";
    private static final String BASE_PAGE_NAME = "Cartes";

    @Autowired
    private CardController cardController;

    @Override
    protected BaseService<Card> getBaseService() {
        return null;
    }

    @Override
    protected String getBaseURL() {
        return null;
    }

    @Override
    protected String getBasePageName() {
        return null;
    }
}
