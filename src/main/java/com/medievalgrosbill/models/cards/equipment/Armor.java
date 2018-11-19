package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.models.cards.Equipment;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_armor")
public class Armor extends Equipment {

    public Armor() {
        super();
    }
}
