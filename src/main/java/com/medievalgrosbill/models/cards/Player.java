package com.medievalgrosbill.models.cards;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import javax.persistence.Entity;

@Entity
public class Player extends Personnage {

	private ArrayList<Card> board;
	private ArrayList<Card> hand;
		
	private Integer attack;
    private Integer level;
	
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
		for(Card modifier: getBoard()) {
			if(modifier instanceof Equipment) {
				attack += ((Equipment) modifier).getAttack();
			}
		}
		attack += getLevel();
		
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
		
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Player(Integer attack, Integer level) {
		super();
		this.attack = attack;
		this.level = level;		
	}	
}