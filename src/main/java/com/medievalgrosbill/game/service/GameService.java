package com.medievalgrosbill.game.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.medievalgrosbill.game.FirebaseOpenHelper;
import com.medievalgrosbill.game.models.Game;
import com.medievalgrosbill.models.User;

@Service
public class GameService {
	
	private static final String GAME_PACKAGE = "com.medievalgrosbill.game.models.";
	private static final String USER_PACKAGE = "com.medievalgrosbill.models.";
	
	private Game game;
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	private Map<User, Map <String,Game>> gameMap;
	
	public static String getGamePackage() {
		return GAME_PACKAGE;
	}

	public static String getUserPackage() {
		return USER_PACKAGE;
	}

	public Map<User, Map<String, Game>> getGameMap() {
		return gameMap;
	}

	public void setGameMap(Map<User, Map<String, Game>> gameMap) {
		this.gameMap = gameMap;
	}

	public String addUser(User user) throws IOException {
		
		String result = "";
		if(this.gameMap.size() == 0) {
			
			Game game = this.createGame();
			Map<String, Game> item = new HashMap<String, Game>();
			item.put(game.toString().replace(GAME_PACKAGE, ""), game);
			result = item.entrySet().iterator().next().getKey();
			this.gameMap.put(user, item);
			
		} else if(this.gameMap.size() > 0 && this.gameMap.size() < 4) {
			
			Map.Entry<User, Map<String, Game>> entry = gameMap.entrySet().iterator().next();
			result = entry.getValue().entrySet().iterator().next().getKey();
			for (Entry<User, Map<String, Game>> iterable_element : gameMap.entrySet()) {
				if(user.equals(iterable_element.getKey())) {
					return result;
				}
			}
			this.gameMap.put(user, entry.getValue());
			
			if (this.gameMap.size() == 4) {
				
				this.lancerGame(this.gameMap);
				this.gameMap.clear();
			}
		}
		
		return result;
	}
	
	public Game createGame() throws IOException {
		this.game = new Game();
		this.game.setDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
		String gameName = this.game.toString().replace(GAME_PACKAGE, "");
		
		FirebaseOpenHelper.getInstance().getDatabase().getReference(gameName).setValueAsync(this.game);
		ChildEventListener listener = new GameEventListener();
		FirebaseOpenHelper.getInstance().getDatabase().getReference(gameName).addChildEventListener(listener);
		
		return this.game;
	}
	
	public GameService() {
		this.gameMap = new HashMap<User, Map <String,Game>>();
	}
	
	public void lancerGame(Map<User, Map<String, Game>> gameMap) throws IOException {
		this.game = this.gameMap.entrySet().iterator().next().getValue().entrySet().iterator().next().getValue();
		Map<String, User> players = new HashMap<String, User>();
		
		for (Entry<User, Map<String, Game>> iterable_element : this.gameMap.entrySet()) {
			players.put(iterable_element.getKey().toString().replace(USER_PACKAGE, ""), iterable_element.getKey());
		}
		
		game.setPlayers(players);
		
		Map.Entry<User, Map<String, Game>> entry = gameMap.entrySet().iterator().next();
		String gameName = entry.getValue().entrySet().iterator().next().getKey();
		FirebaseOpenHelper.getInstance().getDatabase().getReference(gameName).setValueAsync(this.game);
		
	}
	
	final class GameEventListener implements ChildEventListener {

		@Override
		public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
			// TODO Auto-generated method stub
			System.out.println("Added "+snapshot.getKey());
		}

		@Override
		public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onChildRemoved(DataSnapshot snapshot) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCancelled(DatabaseError error) {
			// TODO Auto-generated method stub
			
		}
	}
}
