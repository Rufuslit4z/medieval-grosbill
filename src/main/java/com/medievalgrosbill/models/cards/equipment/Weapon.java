package com.medievalgrosbill.models.cards.equipment;

import com.medievalgrosbill.models.cards.Equipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equip_weapon")
public class Weapon extends Equipment {

    @Column(name="isOneHand")
    private Boolean isOneHand;

    public Weapon() {
        super();
    }

    public Weapon(Boolean isOneHand) {
        super();
        this.isOneHand = isOneHand;
    }

    public Boolean getOneHand() {
        return isOneHand;
    }

    public void setOneHand(Boolean oneHand) {
        isOneHand = oneHand;
    }
}
