package com.medievalgrosbill.services.cards.equipment;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.cards.equipment.HeadRepository;
import com.medievalgrosbill.models.cards.equipment.Head;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadService extends BaseService<Head> {

    @Autowired
    private HeadRepository headRepository;

    @Override
    protected BaseCRUDRepository<Head> getCRUDRepository() {
        return headRepository;
    }

    @Override
    protected List<Head> setItemsByCriterias(Head item, List<Head> result) {
        return null;
    }
}
