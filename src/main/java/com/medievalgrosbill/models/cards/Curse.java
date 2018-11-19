package com.medievalgrosbill.models.cards;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Curse")
public class Curse extends Card {

    public Curse() {
        super();
    }
}
