package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.models.cards.Equipment;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_other")
public class Other extends Equipment {

    public Other() {
        super();
    }
}
