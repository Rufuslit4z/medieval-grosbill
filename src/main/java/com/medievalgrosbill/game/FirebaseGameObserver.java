package com.medievalgrosbill.game;

import java.io.IOException;
import java.util.concurrent.Executor;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.medievalgrosbill.game.models.FirebaseGame;

public class FirebaseGameObserver {

	FirebaseGame firebaseGame;
	
	private FirebaseGameObserver() throws IOException {
		this.firebaseGame = new FirebaseGame();
		firebaseGamesObserver(this.firebaseGame);
	}

	private static FirebaseGameObserver INSTANCE = null;

	public static synchronized FirebaseGameObserver getInstance() throws IOException {
		if (INSTANCE == null) {
			INSTANCE = new FirebaseGameObserver();
		}
		return INSTANCE;
	}
	
	private void firebaseGamesObserver(FirebaseGame firebaseGame) throws IOException {
		FirebaseOpenHelper.getInstance().getDatabase().getReference("/game").setValueAsync(firebaseGame).addListener(new Runnable() {
			
			public void run() {
				System.out.println("run");
			}
		}, new Executor() {
			
			public void execute(Runnable command) {
				System.out.println("execute");
			}
		});;
		FirebaseOpenHelper.getInstance().getDatabase().getReference("/game").addChildEventListener(new ChildEventListener() {
			
			public void onChildRemoved(DataSnapshot snapshot) {
				System.out.println("removed "+snapshot.getKey());
			}
			
			public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
				System.out.println("moved "+snapshot.getKey());
			}
			
			public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
				System.out.println("changed "+snapshot.getKey());
				if (snapshot.getKey().equals("name")) {
					// FirebaseGameObserver.this.notification.setName(snapshot.getValue().toString());
				}
				if (snapshot.getKey().equals("clicks")) {
					Integer clicks = Integer.valueOf(snapshot.getValue().toString());
					// FirebaseGameObserver.this.notification.setClicks(clicks);
				}	
			}
			
			public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
				System.out.println("Added "+snapshot.getKey());
			}
			
			public void onCancelled(DatabaseError error) {
				System.out.println("Error");
			}
		});
	}

	public FirebaseGame getFirebaseGame() {
		return this.firebaseGame;
	}
}
