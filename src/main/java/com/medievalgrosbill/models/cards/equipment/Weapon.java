package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_weapon")
public class Weapon extends DBItem {

    @Column(name="oneHand")
    private Boolean oneHand;

    public Weapon() {
        super();
    }

    public Weapon(Boolean oneHand) {
        super();
        this.oneHand = oneHand;
    }

    public Boolean getOneHand() {
        return oneHand;
    }

    public void setOneHand(Boolean oneHand) {
        this.oneHand = oneHand;
    }
}
