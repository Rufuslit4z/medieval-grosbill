package com.medievalgrosbill.services.cards;

import com.medievalgrosbill.database.cards.CurseRepository;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Curse;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurseService extends BaseService<Curse> {

    @Autowired
    private CurseRepository curseRepository;

    @Override
    protected BaseCRUDRepository<Curse> getCRUDRepository() {
        return curseRepository;
    }

    @Override
    protected List<Curse> setItemsByCriterias(Curse item, List<Curse> result) {
        return null;
    }
}
