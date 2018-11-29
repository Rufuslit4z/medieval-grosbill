package com.medievalgrosbill.services.cards.equipment;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.cards.equipment.ArmorRepository;
import com.medievalgrosbill.models.cards.equipment.Armor;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorService extends BaseService<Armor> {

    @Autowired
    private ArmorRepository armorRepository;

    @Override
    protected BaseCRUDRepository<Armor> getCRUDRepository() {
        return armorRepository;
    }

    @Override
    protected List<Armor> setItemsByCriterias(Armor item, List<Armor> result) {
        return null;
    }
}
