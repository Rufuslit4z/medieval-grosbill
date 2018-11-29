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

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="img")
    private String image;

    public Card() {
        super();
    }

    public Card(String name, String description, String image) {
        super();
        this.name = name;
        this.description = description;
        this.image = image;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
