package com.medievalgrosbill.services.cards;

import com.medievalgrosbill.database.cards.MonsterRepository;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Monster;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService extends BaseService<Monster> {

    @Autowired
    private MonsterRepository monsterRepository;

    @Override
    protected BaseCRUDRepository<Monster> getCRUDRepository() {
        return monsterRepository;
    }

    @Override
    protected List<Monster> setItemsByCriterias(Monster item, List<Monster> result) {
        return null;
    }
}
