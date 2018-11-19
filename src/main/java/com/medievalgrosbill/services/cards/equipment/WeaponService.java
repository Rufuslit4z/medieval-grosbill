package com.medievalgrosbill.services.cards.equipment;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.cards.equipment.WeaponRepository;
import com.medievalgrosbill.models.cards.equipment.Weapon;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService extends BaseService<Weapon> {

    @Autowired
    private WeaponRepository weaponRepository;

    @Override
    protected BaseCRUDRepository<Weapon> getCRUDRepository() {
        return weaponRepository;
    }

    @Override
    protected List<Weapon> setItemsByCriterias(Weapon item, List<Weapon> result) {
        return null;
    }
}
