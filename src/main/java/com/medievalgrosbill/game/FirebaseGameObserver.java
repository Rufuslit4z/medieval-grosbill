package com.medievalgrosbill.game;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.medievalgrosbill.game.enuma.RechercheJoueur;
import com.medievalgrosbill.game.models.Game;
import com.medievalgrosbill.game.service.GameService;

public class FirebaseGameObserver {

//	private Game game;
//		
//	private FirebaseGameObserver() throws IOException {
//		this.game = new Game();
//		firebaseGamesObserver();
//	}
//
//	private GameService gameService;
//	
//	private static FirebaseGameObserver INSTANCE = null;
//
//	public static synchronized FirebaseGameObserver getInstance() throws IOException {
//		if (INSTANCE == null) {
//			INSTANCE = new FirebaseGameObserver();
//		}
//		return INSTANCE;
//	}
//	
//	private void firebaseGamesObserver() throws IOException {
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/waitingPlayers/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/playing/phaseBoard/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/playing/phaseTurn/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/playing/fight/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/playing/fightMonster/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/playing/flee/status").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//			
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/players/player1").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/players/player2").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/players/player3").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/gameID/players/player4").setValueAsync("").addListener(new Runnable() {
//			public void run() {
//				System.out.println("run");
//			}
//		}, new Executor() {
//			
//			public void execute(Runnable command) {
//				System.out.println("execute");
//			}
//		});;
//		
//		// ------------------------------------------- //
//		
//		FirebaseOpenHelper.getInstance().getDatabase().getReference("/game").addChildEventListener(new ChildEventListener() {
//			
//			public void onChildRemoved(DataSnapshot snapshot) {
//				System.out.println("removed "+snapshot.getKey());
//			}
//			
//			public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
//				System.out.println("moved "+snapshot.getKey());
//			}
//			
//			public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
//				System.out.println("changed "+snapshot.getKey());
////				if (snapshot.getKey().equals("name")) {
////					// FirebaseGameObserver.this.notification.setName(snapshot.getValue().toString());
////				}
////				if (snapshot.getKey().equals("clicks")) {
////					Integer clicks = Integer.valueOf(snapshot.getValue().toString());
////					// FirebaseGameObserver.this.notification.setClicks(clicks);
////				}	
//			}
//			
//			public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
//				System.out.println("Added "+snapshot.getKey());
//			}
//			
//			public void onCancelled(DatabaseError error) {
//				System.out.println("Error");
//			}
//		});
//	}
//
//	public Game getGame() {
//		return this.game;
//	}
}