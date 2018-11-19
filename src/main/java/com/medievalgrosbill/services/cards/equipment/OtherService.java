package com.medievalgrosbill.services.cards.equipment;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.cards.equipment.OtherRepository;
import com.medievalgrosbill.models.cards.equipment.Other;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherService extends BaseService<Other> {

    @Autowired
    private OtherRepository otherRepository;

    @Override
    protected BaseCRUDRepository<Other> getCRUDRepository() {
        return otherRepository;
    }

    @Override
    protected List<Other> setItemsByCriterias(Other item, List<Other> result) {
        return null;
    }
}
