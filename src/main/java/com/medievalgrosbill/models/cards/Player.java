package com.medievalgrosbill.models.cards;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player extends Personnage {

    @Column(name="level")
    private Integer level;

    public Player() {
        super();
    }

    public Player(Integer level) {
        super();
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
