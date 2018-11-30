package com.medievalgrosbill.services.cards.equipment;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.cards.equipment.BootsRepository;
import com.medievalgrosbill.models.cards.equipment.Boots;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootsService extends BaseService<Boots> {

    @Autowired
    private BootsRepository bootsRepository;

    @Override
    protected BaseCRUDRepository<Boots> getCRUDRepository() {
        return bootsRepository;
    }

    @Override
    protected List<Boots> setItemsByCriterias(Boots item, List<Boots> result) {
        return null;
    }
}
