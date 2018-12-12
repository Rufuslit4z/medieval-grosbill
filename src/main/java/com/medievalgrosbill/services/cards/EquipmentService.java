package com.medievalgrosbill.services.cards;

import com.medievalgrosbill.database.cards.EquipmentRepository;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.models.cards.Equipment;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService extends BaseService<Equipment> {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    protected BaseCRUDRepository<Equipment> getCRUDRepository() {
        return equipmentRepository;
    }

    @Override
    protected List<Equipment> setItemsByCriterias(Equipment item, List<Equipment> result) {
        return null;
    }
}
