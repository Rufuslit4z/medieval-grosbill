package com.medievalgrosbill.models.cards;

import com.medievalgrosbill.database.DBItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="card")
@Inheritance
public class Card extends DBItem {

	@Column(insertable = false, updatable = false)
	private String dtype;
	
    @Column(name="name")
    private String name;
    
    @Column(name="description")
    private String description;
    
    @Column(name="img")
    private String img;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public Card() {
        super();
    }

    public Card(String description, String img, String name) {
        super();
        this.description = description;
        this.img = img;
        this.name = name;
    }
}
