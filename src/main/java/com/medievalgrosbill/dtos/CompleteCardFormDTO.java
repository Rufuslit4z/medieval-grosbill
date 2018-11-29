package com.medievalgrosbill.dtos;

import com.medievalgrosbill.models.cards.Curse;
import com.medievalgrosbill.models.cards.Monster;
import com.medievalgrosbill.models.cards.equipment.*;

public class CompleteCardFormDTO {

    private Monster monster;
    private Curse curse;
    private Boots boots;
    private Weapon weapon;
    private Other other;
    private Head head;
    private Armor armor;

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Curse getCurse() {
        return curse;
    }

    public void setCurse(Curse curse) {
        this.curse = curse;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
