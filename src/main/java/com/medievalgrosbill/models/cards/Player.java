package com.medievalgrosbill.models.cards;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.medievalgrosbill.services.cards.CardService;
import com.medievalgrosbill.services.users.UserService;

@Entity
public class Player extends Personnage {

	private ArrayList<Card> board;
	private ArrayList<Card> hand;
	
	@Column(name="attack")
	private Integer attack;
	
	@Column(name="description")
	private String description;
	
	@Column(name="img")
	private String img;
	
    @Column(name="level")
    private Integer level;
    
	@Column(name="name")
	private String name;
	
	public ArrayList<Card> getBoard() {
		return board;
	}
	
	public void setBoard(ArrayList<Card> board) {
		this.board = board;
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
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
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Player(Integer attack, String description, String img, Integer level, String name) {
		super();
		this.attack = attack;
		this.description = description;
		this.img = img;
		this.level = level;		
		this.name = name;
	}	
}