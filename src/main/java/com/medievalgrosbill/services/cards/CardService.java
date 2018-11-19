package com.medievalgrosbill.services.cards;

import com.medievalgrosbill.database.cards.CardRepository;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService extends BaseService<Card> {

    @Autowired
    private CardRepository cardRepository;

    @Override
    protected BaseCRUDRepository<Card> getCRUDRepository() {
        return cardRepository;
    }

    @Override
    protected List<Card> setItemsByCriterias(Card item, List<Card> result) {
        if (!item.getName().equals("")) {
            result = this.cardRepository.findByName(item.getName());
        }
        return result;
    }
}
