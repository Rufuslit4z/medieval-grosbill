package com.medievalgrosbill.models.cards;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
@Inheritance
public abstract class Equipment extends Card {

    @Column(name="attack")
    private Integer attack;
    @Column(name="cost")
    private Integer cost;
    @Column(name="bigItem")
    private Boolean bigItem;

    public Equipment() {
        super();
    }

    public Equipment(Integer attack, Integer price, Boolean bigIem) {
        super();
        this.attack = attack;
        this.bigItem = bigIem;
        this.cost = price;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Boolean getBigItem() {
        return bigItem;
    }

    public void setBigItem(Boolean bigItem) {
        this.bigItem = bigItem;
    }
}
