package com.medievalgrosbill.game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.models.cards.Player;
import com.medievalgrosbill.services.cards.CardService;


public class GameManager {
	
	@Autowired
	private CardService cardService;
	
	private List<Card> discardDungeon;
	private List<Card> discardChest;
	
	
	private List<Player> players;
	
	public enum PhasePlateau {
		INITIALISATION,
		TOUR,
		FIN
	}
	
	public enum PhaseTour {
		DEBUT,
		PORTE,
		COMBAT,
		ENTRETIENT,
		FIN
	}
	
	public enum Combat {
		MONSTRE,
		MALEDICTION
	}
	
	public enum CombatMonstre {
		RESOLUTION,
		PIOCHE,
		FUITE
	}
	
	public enum Fuite {
		SUCCES,
		MORT
	}
	
	// --------- INIT --------- //
	
	// PREPARE DUNGEON
	
	private List<Card> dungeon;
	
	public void prepareDungeon() {
		for(Card curse : getCurses()) {
			this.dungeon.add(curse);
		}
		
		for(Card monster : getMonsters()) {
			this.dungeon.add(monster);
		}
	}
	
	public List<Card> getCurses() {
		return this.cardService.findByDtype("Curse");
	}
	
	public List<Card> getMonsters() {
		return this.cardService.findByDtype("Monster");
	}
	
	// PREPARE CHEST
	
	private List<Card> chest;
	
	public void prepareChest() {
		for(Card armor : getArmors()) {
			this.chest.add(armor);
		}
		
		for(Card boots : getBoots()) {
			this.chest.add(boots);
		}
		
		for(Card head : getHeads()) {
			this.chest.add(head);
		}
		
		for(Card other : getOthers()) {
			this.chest.add(other);
		}
		
		for(Card weapon : getWeapons()) {
			this.chest.add(weapon);
		}
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

	// PREPARE PLAYER
	
	public void getUsers() {
		
	}
	
	public void preparePlayer() {
		
	}
	
	// --------- END --------- //
}
