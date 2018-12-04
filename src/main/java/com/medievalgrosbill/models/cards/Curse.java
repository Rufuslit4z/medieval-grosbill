package com.medievalgrosbill.models.cards;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.medievalgrosbill.models.Effect;

@Entity
public class Curse extends Card {

    @ManyToOne(targetEntity = Effect.class)
    private Effect effect; //Change Object to Effect Class

    public Curse() {
        super();
    }

    public Curse(Effect effect) {
        this.effect = effect;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }
}
