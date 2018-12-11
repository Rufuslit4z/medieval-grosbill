package com.medievalgrosbill.game.models;

import java.util.Map;

public class FirebaseGame {
	
	private Integer id;
	private Game game;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public FirebaseGame(Integer id, Game game){
		this.id = id;
		this.game = game;
	}
	
	//----------------------------
	
	Map<String, String> toto;
}
