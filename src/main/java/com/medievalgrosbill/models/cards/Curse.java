package com.medievalgrosbill.models.cards;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Curse")
public class Curse extends DBItem {

    public Curse() {
        super();
    }
}
