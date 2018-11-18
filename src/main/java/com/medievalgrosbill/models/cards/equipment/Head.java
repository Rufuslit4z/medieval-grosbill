package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_head")
public class Head extends DBItem {

    public Head() {
        super();
    }
}
