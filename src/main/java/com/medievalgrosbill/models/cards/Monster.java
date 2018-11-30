package com.medievalgrosbill.models.cards;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Monster extends Personnage {

    @Column(name="level")
    private Integer level;
    @Column(name="treasure")
    private Integer treasure;
    @Column(name="leak")
    private Integer leak;
    @Column(name="malus")
    private String malus;

    public Monster() {
        super();
    }

    public Monster(Integer level, Integer treasure, Integer leak, String malus) {
        super();
        this.level = level;
        this.treasure = treasure;
        this.leak = leak;
        this.malus = malus;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTreasure() {
        return treasure;
    }

    public void setTreasure(Integer treasure) {
        this.treasure = treasure;
    }

    public Integer getLeak() {
        return leak;
    }

    public void setLeak(Integer leak) {
        this.leak = leak;
    }

    public String getMalus() {
        return malus;
    }

    public void setMalus(String malus) {
        this.malus = malus;
    }
}
