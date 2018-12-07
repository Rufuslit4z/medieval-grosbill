package com.medievalgrosbill.game.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.models.cards.Deck;
import com.medievalgrosbill.models.cards.Player;
import com.medievalgrosbill.services.cards.CardService;


public class Game {
	
	@Autowired
	private CardService cardService;
	
	private List<Deck> sharedBoard;
		
	private List<Player> players;
	
	public Game() {
		
	}
	
	// --------- INIT --------- //
	
	// MANAGE DECKS
	
	// CREATE DUNGEON
		
	public Deck createDungeon() {
		return(new Deck(this.getCurses(), this.getMonsters()));
	}
	
	public List<Card> getCurses() {
		return this.cardService.findByDtype("Curse");
	}
	
	public List<Card> getMonsters() {
		return this.cardService.findByDtype("Monster");
	}
	
	// CREATE CHEST
		
	public Deck createChest() {
		return(new Deck(this.getArmors(), this.getBoots(), this.getHeads(), this.getOthers(), this.getWeapons()));
	}
	
	public List<Card> getArmors(){
		return this.cardService.findByDtype("Armor");
	}
	
	public List<Card> getBoots(){
		return this.cardService.findByDtype("Boots");
	}
	
	public List<Card> getHeads(){
		return this.cardService.findByDtype("Head");
	}
	
	public List<Card> getOthers(){
		return this.cardService.findByDtype("Other");
	}
	
	public List<Card> getWeapons(){
		return this.cardService.findByDtype("Weapon");
	}
	
	// CREATE DISCARD DUNGEON
	
	private List<Card> dDungeon;
	public Deck createDiscardDungeon() {
		return(new Deck(this.dDungeon));
	}
	
	// CREATE DISCARD CHEST
	
	private List<Card> dChest;
	public Deck createDiscardChest() {
		return(new Deck(this.dChest));
	}
	
	// CREATE SHAREDBOARD
	
	
	public void createSharedBoard() {
		this.sharedBoard.add(this.createDiscardDungeon());
		this.sharedBoard.add(this.createDungeon());
		
		this.sharedBoard.add(this.createChest());
		this.sharedBoard.add(this.createDiscardChest());
	}
	
	
	// -------------------------- //
	
	// MANAGE PLAYERS
	
	// PREPARE PLAYERs

//	public void getUsers() {
//		
//	}
//	
//	public void preparePlayer() {
//		
//	}
	
	// --------- END --------- //
	// ----------------------- //
	
	// --------- GAME -------- //
	
	// OPEN DOOR
	
//	private Card fight;
//
//	
//	while(!process) {
//		
//	}
//	
//	public Card getFirstCardDungeon() {
//		Card card = this.getDungeon().get(0);
//		this.getDungeon().remove(0);
//		return card;
//	}
//	
//	public Card getFight() {
//		return fight;
//	}
//
//	public void setFight(Card fight) {
//		this.fight = fight;
//	}
}
