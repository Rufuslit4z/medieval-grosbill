package com.medievalgrosbill.models.cards;

import com.medievalgrosbill.database.cards.Personnage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="monster")
public class Monster extends Personnage {

    @Column(name="level")
    private Integer level;
    @Column(name="treasure")
    private Integer treasure;
    @Column(name="leak")
    private Integer leak;

    public Monster() {
        super();
    }

    public Monster(Integer level, Integer treasure, Integer leak) {
        super();
        this.level = level;
        this.treasure = treasure;
        this.leak = leak;
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
}
