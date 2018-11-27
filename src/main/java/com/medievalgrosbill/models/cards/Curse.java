package com.medievalgrosbill.models.cards;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Curse extends Card {

    @Column(name="effect")
    private List<Object> effect; //Change Object to Effect Class

    public Curse() {
        super();
    }

    public Curse(List<Object> effect) {
        this.effect = effect;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }
}
