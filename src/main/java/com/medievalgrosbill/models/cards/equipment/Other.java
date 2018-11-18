package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_other")
public class Other extends DBItem {

    public Other() {
        super();
    }
}
