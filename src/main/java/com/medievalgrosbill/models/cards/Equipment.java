package com.medievalgrosbill.models.cards;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
public class Equipment extends DBItem {

    @Column(name="attack")
    private Integer attack;
    @Column(name="price")
    private Integer price;
    @Column(name="bigItem")
    private Boolean bigIem;

    public Equipment() {
        super();
    }

    public Equipment(Integer attack, Integer price, Boolean bigIem) {
        super();
        this.attack = attack;
        this.bigIem = bigIem;
        this.price = price;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getBigIem() {
        return bigIem;
    }

    public void setBigIem(Boolean bigIem) {
        this.bigIem = bigIem;
    }
}
