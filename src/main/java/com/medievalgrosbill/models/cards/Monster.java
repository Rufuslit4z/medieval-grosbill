package com.medievalgrosbill.models.cards;


import javax.persistence.Entity;

@Entity
public class Monster extends Personnage {

    private Integer level;
    private Integer treasure;
    private Integer leak;
    private String malus;
    
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

	public Monster() {
        super();
    }

    public Monster(Integer leak, Integer level, String malus, Integer treasure) {
        super();
        this.level = level;
        this.treasure = treasure;
        this.leak = leak;
        this.malus = malus;
    }
}
